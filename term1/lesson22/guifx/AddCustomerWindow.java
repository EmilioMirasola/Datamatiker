package term1.lesson22.guifx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import term1.lesson22.application.controller.Controller;
import term1.lesson22.application.model.Company;
import term1.lesson22.application.model.Customer;

public class AddCustomerWindow extends Stage {
    private Company company;
    private ListView<Customer> lvwCustomers;

    public AddCustomerWindow(String title, Company company) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);
        this.company = company;
        this.lvwCustomers = new ListView<>();

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        pane.add(lvwCustomers, 0, 0, 1, 3);
        lvwCustomers.setPrefHeight(200);
        lvwCustomers.setPrefWidth(200);
        lvwCustomers.getItems().setAll(Controller.getCustomers());
        lvwCustomers.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


        HBox hbxButtons = new HBox(40);
        hbxButtons.setPadding(new Insets(10, 0, 0, 0));
        hbxButtons.setAlignment(Pos.BASELINE_CENTER);
        pane.add(hbxButtons, 0, 4, 2, 1);

        Button btnOk = new Button("OK");
        hbxButtons.getChildren().add(btnOk);
        btnOk.setOnAction(event -> this.btnOkAction());

        Button btnCancel = new Button("Cancel");
        hbxButtons.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.btnCancelAction());

    }

    private void btnCancelAction() {
        this.close();
    }

    private void btnOkAction() {
        this.company.addCustomers(lvwCustomers.getSelectionModel().getSelectedItems());
        this.close();
    }
}
