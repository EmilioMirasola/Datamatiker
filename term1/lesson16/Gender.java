package term1.lesson16;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gender extends Application {

    private TextField newName;
    private ListView<String> nameList;
    private ArrayList<String> boys;
    private ArrayList<String> girls;
    private ToggleGroup toggleGroup;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gender");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(10));
        this.boys = new ArrayList<String>();
        this.girls = new ArrayList<String>();

        this.toggleGroup = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Boys");
        rb1.setToggleGroup(toggleGroup);
        rb1.setSelected(true);
        rb1.setOnAction(event -> this.changeSelectedGender());

        RadioButton rb2 = new RadioButton("Girls");
        rb2.setToggleGroup(toggleGroup);
        rb2.setOnAction(event -> this.changeSelectedGender());

        pane.add(rb1, 1, 0);
        pane.add(rb2, 2, 0);

        Label names = new Label("Names: ");
        pane.add(names, 0, 1);

        this.nameList = new ListView<String>();
        nameList.getItems().setAll(this.boys);

        this.nameList = new ListView<>();
        pane.add(nameList, 1, 1, 2, 3);
        nameList.setPrefHeight(200);
        Label name = new Label("Name: ");
        pane.add(name, 0, 4);

        this.newName = new TextField();
        pane.add(newName, 1, 4);

        Button btnAdd = new Button("Add");
        btnAdd.setOnAction(event -> handlePersonAdd());
        pane.add(btnAdd, 2, 4);
    }

    private void handlePersonAdd() {
        RadioButton selectedList = (RadioButton) this.toggleGroup.getSelectedToggle();
        String name = this.newName.getText().trim();
        if (selectedList.getText().equalsIgnoreCase("Boys") && name.length() > 0) {
            this.boys.add(name);
            this.nameList.getItems().setAll(this.boys);
            this.newName.clear();
        } else {
            this.girls.add(name);
            this.nameList.getItems().setAll(this.girls);
            this.newName.clear();
        }
    }

    private void changeSelectedGender() {
        RadioButton selectedGender = (RadioButton) this.toggleGroup.getSelectedToggle();
        if (selectedGender.getText().equalsIgnoreCase("Boys")) {
            this.nameList.getItems().setAll(this.boys);
        } else {
            this.nameList.getItems().setAll(this.girls);
        }
    }
}
