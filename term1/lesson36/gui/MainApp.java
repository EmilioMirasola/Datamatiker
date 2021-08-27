package term1.lesson36.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import term1.lesson36.controller.Controller;
import term1.lesson36.model.Bil;
import term1.lesson36.model.Bilmærke;
import term1.lesson36.model.Parkeringshus;
import term1.lesson36.model.Parkeringsplads;

import java.util.Arrays;


public class MainApp extends Application {
    private HBox hBoxContainer = new HBox();
    private ParkeringshuseListView parkeringshuseListView;
    private OptagnePladserListView optagnePladserListView;
    private ComboBox<Bilmærke> cbbBilmærke;
    private ComboBox<Parkeringsplads> cbBoxParkeringsPladser;
    private TextField txtBil;

    @Override
    public void start(Stage primaryStage) throws Exception {
        hBoxContainer = new HBox();
        hBoxContainer.setSpacing(50);
        hBoxContainer.setPadding(new Insets(50));
        Scene scene = new Scene(hBoxContainer, 1000, 500);
        primaryStage.setTitle("Parkeringshuse oversigt");
        primaryStage.setScene(scene);
        primaryStage.show();
        this.initContent();
    }

    private void initContent() {
        parkeringshuseView();
        optagnePladserView();
        tilføjBilInput();
    }

    private void tilføjBilInput() {
        VBox box = new VBox();
        box.setSpacing(10);

        Label label = new Label("Opret bil med nummer: ");
        box.getChildren().add(label);

        this.txtBil = new TextField();
        txtBil.setPromptText("Reg nr");
        box.getChildren().add(txtBil);

        Label lblMærke = new Label("Bilens mærke");
        box.getChildren().add(lblMærke);
        cbbBilmærke = new ComboBox<>();
        cbbBilmærke.getItems().setAll(Bilmærke.values());
        box.getChildren().add(cbbBilmærke);

        Label lblVælgPlads = new Label("Vælg plads");
        box.getChildren().add(lblVælgPlads);

        cbBoxParkeringsPladser = new ComboBox<>();
        cbBoxParkeringsPladser.getItems().setAll(Controller.getFrieParkeringsPladser(parkeringshuseListView.getSelectionModel().getSelectedItem()));
        box.getChildren().add(cbBoxParkeringsPladser);

        Button btnOpret = new Button("Opret");
        box.getChildren().add(btnOpret);
        btnOpret.setOnAction(event -> opretBil());

        Label lblSaldoOverskrift = new Label("Saldo");
        box.getChildren().add(lblSaldoOverskrift);

        Button btnHentBil = new Button("Hent bil");
        btnHentBil.setOnAction(event -> hentBil());
        box.getChildren().add(btnHentBil);

        Label lblSaldo = new Label(String.valueOf(Controller.getPHusSaldo(parkeringshuseListView.getSelectionModel().getSelectedItem())));
        box.getChildren().add(lblSaldo);
        hBoxContainer.getChildren().add(box);


    }

    private void hentBil() {
        System.out.println("Og så nåede jeg ikke mere :)");
    }

    private void opretBil() {
        if (cbbBilmærke.getSelectionModel().getSelectedItem() != null && cbBoxParkeringsPladser.getSelectionModel().getSelectedItem() != null && txtBil.getText().length() > 0) {
            Bil bil = Controller.opretBil(txtBil.getText(), cbbBilmærke.getSelectionModel().getSelectedItem());
            Controller.parkerBil(bil, cbBoxParkeringsPladser.getSelectionModel().getSelectedItem());
            opdaterFriePladser();
            txtBil.clear();
            cbbBilmærke.getSelectionModel().clearSelection();
            optagnePladserListView.opdaterView();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input fejl");
            alert.setContentText("Venligst indtast alle oplysninger");
            alert.showAndWait();
        }
    }

    public void opdaterFriePladser() {
        cbBoxParkeringsPladser.getItems().setAll(Controller.getFrieParkeringsPladser(parkeringshuseListView.getSelectionModel().getSelectedItem()));
        cbBoxParkeringsPladser.getSelectionModel().clearSelection();
    }

    private void optagnePladserView() {
        VBox box = new VBox();
        Label labelOptagnePladser = new Label("Optagne pladser");
        box.getChildren().add(labelOptagnePladser);

        optagnePladserListView = new OptagnePladserListView(parkeringshuseListView.getSelectionModel().getSelectedItem());
        box.getChildren().add(optagnePladserListView);

        hBoxContainer.getChildren().add(box);
    }

    private void parkeringshuseView() {
        VBox box = new VBox();
        Label labelPHuse = new Label("Parkeringshuse");
        box.getChildren().add(labelPHuse);

        parkeringshuseListView = new ParkeringshuseListView();
        parkeringshuseListView.getSelectionModel().selectFirst();
        box.getChildren().add(parkeringshuseListView);

        hBoxContainer.getChildren().add(box);

        parkeringshuseListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectionChanged(newValue);
        });
    }

    private void selectionChanged(Parkeringshus newValue) {
        optagnePladserListView.setValgtParkeringshus(newValue);
        optagnePladserListView.opdaterView();
        opdaterFriePladser();
    }
}
