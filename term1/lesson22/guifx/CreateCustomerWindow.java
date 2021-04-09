package term1.lesson22.guifx;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import term1.lesson22.application.controller.Controller;
import term1.lesson22.application.model.Company;

public class CreateCustomerWindow extends Stage {
    private TextField txfName;
    private final Company company;

    public CreateCustomerWindow(String title, Company company) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);
        this.company = company;

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

        txfName = new TextField();
        pane.add(txfName, 0,0);

        Button btnOk = new Button("OK");
        Button btnCancel = new Button("Cancel");
        pane.add(btnOk, 1,1);
        pane.add(btnCancel, 0,1);

        btnOk.setOnAction(event -> {
            Controller.createCustomer(txfName.getText(), company);
            this.close();
        });

        btnCancel.setOnAction(event -> this.close());
    }
}
