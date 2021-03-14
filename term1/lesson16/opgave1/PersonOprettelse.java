package term1.lesson16.opgave1;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import term1.lesson16.Person;

public class PersonOprettelse extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("Personoprettelse");
		GridPane pane = new GridPane();
		this.initContent(pane);

		this.personInputWindow = new PersonInputWindow("Create person", stage);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	private ArrayList<Person> persons;
	private ListView<Person> lvwPersons;
	private PersonInputWindow personInputWindow;

	private void initContent(GridPane pane) {
		initPersons();
		pane.setPadding(new Insets(20));
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);


		Button btnAdd = new Button("Add person");
		btnAdd.setOnAction(event -> addPerson());
		pane.add(btnAdd, 2, 0);


		Label personLbl = new Label("Persons:");
		pane.add(personLbl, 0, 0);

		lvwPersons = new ListView<Person>();
		lvwPersons.getItems().setAll(this.persons);
		pane.add(lvwPersons, 1, 0, 1, 2);

	}

	private void addPerson() {

		personInputWindow.showAndWait();
		if(personInputWindow.getActualPerson() != null) {
			this.persons.add(personInputWindow.getActualPerson());
			lvwPersons.getItems().setAll(persons);
		}
	}

	private void initPersons() {
		this.persons = new ArrayList<Person>();
		this.persons.add(new Person("Emilio", "Studerende", true));
		this.persons.add(new Person("Emilio", "Studerende", false));
	}
}
