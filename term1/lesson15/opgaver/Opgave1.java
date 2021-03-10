package term1.lesson15.opgaver;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Opgave1 extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("Opgave 1");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	// -------------------------------------------------------------------------

	// OPGAVE 1/3
	private final TextField txfLastName = new TextField();
	private final TextField txfFirstName = new TextField();
	private final TextField txfFullName = new TextField();

	// OPGAVE 2/5
	private final TextField txf1 = new TextField();
	private final TextField txf2 = new TextField();

	// OPGAVE 3
	private final TextField txf3 = new TextField();

	private void initContent(GridPane pane) {
		pane.setGridLinesVisible(false);
		pane.setPadding(new Insets(20));
		pane.setHgap(10);
		pane.setVgap(10);

		// opgave1(pane);
		// opgave2(pane);
		// opgave3(pane);
		// opgave4(pane);
		opgave5(pane);
	}

	private void opgave5(GridPane pane) {
		Label C = new Label("C:");
		Label F = new Label("F:");
		txf1.setOnAction(event -> calculateFahrenheit());
		txf2.setOnAction(event -> calculateCelcius());
		pane.add(txf1, 1, 0);
		pane.add(txf2, 1, 1);
		pane.add(C, 0, 0);
		pane.add(F, 0, 1);
	}

	private void calculateCelcius() {
		double fahrenheit = Double.parseDouble(txf2.getText());
		double celcius = (fahrenheit - 32) * 0.5556;
		txf1.setText(celcius + "");
	}

	private void calculateFahrenheit() {
		double celcius = Double.parseDouble(txf1.getText());
		// double fahrenheit = celcius * 9 / 5 + 32;
		double fahrenheit = celcius * 9 / 5 + 32;
		txf2.setText(fahrenheit + "");
	}

	private void opgave4(GridPane pane) {
		txf3.setText("50");
		pane.add(txf3, 1, 1, 1, 1);
		Label lbl = new Label("Number:");
		pane.add(lbl, 0, 1, 1, 1);
		Button incrementer = new Button("+");
		Button substract = new Button("-");
		incrementer.setOnAction(event -> handleNumChange(true));
		substract.setOnAction(event -> handleNumChange(false));
		pane.add(incrementer, 2, 0, 1, 1);
		pane.add(substract, 2, 2, 1, 1);
	}

	private void handleNumChange(boolean increment) {
		int currentNum = Integer.parseInt(txf3.getText());
		if (increment) {
			currentNum++;
		} else {
			currentNum--;
		}
		txf3.setText(currentNum + "");
	}

	private void opgave3(GridPane pane) {
		pane.add(txfFullName, 0, 0, 2, 1);
		pane.add(txfFirstName, 0, 1, 1, 1);
		pane.add(txfLastName, 1, 1, 1, 1);
		Button btnSwap = new Button("Split");
		pane.add(btnSwap, 0, 2, 1, 1);
		btnSwap.setOnAction(event -> splitName());
	}

	private void splitName() {
		String fullName = txfFullName.getText();
		String[] splitted = fullName.split(" ");
		txfFirstName.setText(splitted[0]);
		txfLastName.setText(splitted[1]);
	}

	private void opgave2(GridPane pane) {
		Button btnSwap = new Button("Ombyt");
		btnSwap.setOnAction(event -> swapTfxValues());
		pane.add(txf1, 0, 0);
		pane.add(txf2, 0, 1);
		pane.add(btnSwap, 0, 2);
	}

	private void swapTfxValues() {
		String txf1Value = txf1.getText();
		String txf2Value = txf2.getText();

		txf1.setText(txf2Value);
		txf2.setText(txf1Value);
	}

	private void opgave1(GridPane pane) {
		pane.add(txfFirstName, 0, 0, 1, 1);
		pane.add(txfLastName, 1, 0, 1, 1);
		pane.add(txfFullName, 0, 1, 2, 1);

		// add a button to the pane (at col=1, row=1)
		Button btnCombine = new Button("Kombiner");
		pane.add(btnCombine, 0, 2);

		btnCombine.setOnAction(event -> handleClick());
	}

	private void handleClick() {
		String firstName = txfFirstName.getText().trim();
		String lastName = txfLastName.getText().trim();
		txfFullName.setText(firstName + " " + lastName);
	}
}
