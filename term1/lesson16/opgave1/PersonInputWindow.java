package term1.lesson16.opgave1;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import term1.lesson16.Person;

public class PersonInputWindow extends Stage {
    
	private TextField txtName;
	private TextField txtTitle;
	private CheckBox isSenior;
	private Alert alert;
	private Person actualPerson = null;

	public PersonInputWindow(String title, Stage owner) {
		this.initOwner(owner);
		this.initStyle(StageStyle.UTILITY);
		this.initModality(Modality.APPLICATION_MODAL);
		this.setMinHeight(100);
		this.setMinWidth(200);
		this.setResizable(false);

		this.setTitle(title);
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		this.setScene(scene);
	}
    

		
    private void initContent(GridPane pane) {
		pane.setPadding(new Insets(20));
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);

		//Text name
		this.txtName = new TextField();
		pane.add(txtName, 1,0);
		this.txtName.requestFocus();
		
		// Label name
		Label lblName = new Label("Name: ");
		pane.add(lblName, 0,0);
		
		//Text title
		this.txtTitle = new TextField();
		pane.add(txtTitle, 1,1);

		//Label title
		Label lblTitle = new Label("Title: ");
		pane.add(lblTitle, 0,1);

		//Checkbox
		this.isSenior = new CheckBox("Senior");
		pane.add(isSenior, 0, 4);

		//Cancel button
		Button cancel = new Button("Cancel");
		cancel.setOnAction(event -> this.handleCancel());
		pane.add(cancel, 0, 3);

		//OK button
		Button createPerson = new Button("OK");
		createPerson.setOnAction(event -> this.handlePersonCreation());
		pane.add(createPerson, 1, 3);
	}



	private void handlePersonCreation() {
		String name = this.txtName.getText().trim();
		String title = this.txtTitle.getText().trim();

		if (name.length() < 1 || title.length() < 1) {
			this.alert = new Alert(AlertType.ERROR);
			alert.setTitle("Add person");
			alert.setHeaderText("No name typed");
			alert.setContentText("Type the name of the person");
			alert.show();
		} else {
			boolean senior = this.isSenior.isSelected();
			this.actualPerson = new Person(name, title, senior);
			this.txtName.clear();
			this.txtTitle.clear();
			PersonInputWindow.this.hide();
		}
	}



	private void handleCancel() {
		this.txtName.clear();
		this.txtTitle.requestFocus();
		PersonInputWindow.this.hide();
	}

	public Person getActualPerson() {
		return this.actualPerson;
	}

	public void clearActualPerson() {
		this.actualPerson = null;
	}

    }
