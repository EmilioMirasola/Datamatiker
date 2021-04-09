package term1.lesson23.semesterprøve.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import term1.lesson23.semesterprøve.application.controller.Controller;
import term1.lesson23.semesterprøve.application.model.Area;
import term1.lesson23.semesterprøve.application.model.Seat;

public class MainApp extends Application {
    ListView<Seat> lvwSeats;
    TextField txfNumber;
    ToggleGroup btnGroup;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Netcafe administration");

        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() {
        Controller.initStorage();
    }

    public void initContent(GridPane pane) {

        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(10, 10, 10, 10));

        Label lblSeats = new Label("Pladser:");
        pane.add(lblSeats, 0, 0);

        lvwSeats = new ListView<>();
        updateListView();
        lvwSeats.setPrefHeight(200);
        lvwSeats.setPrefWidth(200);
        pane.add(lvwSeats, 0, 1);

        Label lblArea = new Label("Område:");
        pane.add(lblArea, 0, 2);

        btnGroup = new ToggleGroup();
        for (int i = 1; i <= 4; i++) {
            RadioButton btn = new RadioButton(getButtonLabel(i));
            pane.add(btn, i, 2);
            btn.setToggleGroup(btnGroup);
        }

        Label lblNumber = new Label("Nummer:");
        pane.add(lblNumber, 0, 3);

        txfNumber = new TextField();
        pane.add(txfNumber, 1, 3);

        Button btnCreate = new Button("Opret");
        btnCreate.setOnAction(event -> createAction());
        pane.add(btnCreate, 0, 4);

    }

    private void createAction() {
        RadioButton selectedButton = (RadioButton) btnGroup.getSelectedToggle();
        Area chosenArea = determineSelectedArea(selectedButton.getText());
        int seatNumber = Integer.parseInt(txfNumber.getText());

        Controller.createSeat(seatNumber, chosenArea);
        updateListView();
    }

    private void updateListView() {
        lvwSeats.getItems().setAll(Controller.getSeats());
    }

    private Area determineSelectedArea(String text) {
        Area chosenArea = Area.STANDARD;
        switch (text) {
            case "VIP":
                chosenArea = Area.VIP;
                break;
            case "Børne":
                chosenArea = Area.KIDS;
                break;
            case "Turnering":
                chosenArea = Area.TOURNAMENT;
                break;
        }
        return chosenArea;
    }

    private String getButtonLabel(int i) {
        String btnLabel = "";
        switch (i) {
            case 1:
                btnLabel = "Standard";
                break;
            case 2:
                btnLabel = "VIP";
                break;
            case 3:
                btnLabel = "Børne";
                break;
            case 4:
                btnLabel = "Turnering";
                break;
        }
        return btnLabel;
    }
}


