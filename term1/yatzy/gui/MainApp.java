package term1.yatzy.gui;

import java.util.Arrays;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import term1.yatzy.model.Yatzy;

public class MainApp extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("Yatzy");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	// -------------------------------------------------------------------------

	// Shows the face values of the 5 dice.
	private TextField[] txfValues;
	// Shows the hold status of the 5 dice.
	private CheckBox[] chbHolds;
	// Shows the results previously selected .
	// For free results (results not set yet), the results
	// corresponding to the actual face values of the 5 dice are shown.
	private TextField[] txfResults;
	// Shows points in sums, bonus and total.
	private TextField txfSumSame, txfBonus, txfSumOther, txfTotal;
	// Shows the number of times the dice has been rolled.
	private Label lblRolled;

	private Button btnRoll;

	private void initContent(GridPane pane) {
		pane.setGridLinesVisible(false);
		pane.setPadding(new Insets(10));
		pane.setHgap(10);
		pane.setVgap(10);

		// ---------------------------------------------------------------------

		dicePane(pane);

		// ---------------------------------------------------------------------

		scorePane(pane);

	}

	private void dicePane(GridPane pane) {
		GridPane dicePane = new GridPane();
		pane.add(dicePane, 0, 0);
		dicePane.setGridLinesVisible(false);
		dicePane.setPadding(new Insets(10));
		dicePane.setHgap(10);
		dicePane.setVgap(10);
		dicePane.setStyle("-fx-border-color: black");

		this.txfValues = new TextField[5];
		this.chbHolds = new CheckBox[5];
		for (int i = 0; i < this.txfValues.length; i++) {
			txfValues[i] = new TextField("0");
			txfValues[i].setDisable(true);
			txfValues[i].setPrefSize(100, 100);
			txfValues[i].setFont(Font.font(50));
			txfValues[i].setAlignment(Pos.CENTER);
			dicePane.add(txfValues[i], i, 0);

			CheckBox checkBox = new CheckBox();
			this.chbHolds[i] = checkBox;
			dicePane.add(checkBox, i, 1);
		}

		btnRoll = new Button("Roll");
		btnRoll.setOnAction(event -> this.rollDices());
		dicePane.add(this.btnRoll, 3, 2);

		this.lblRolled = new Label("Rolls: 0/3");
		dicePane.add(this.lblRolled, 4, 2);

	}

	private void rollDices() {
		if (this.logicYatzy.getThrowCount() < 3) {
			boolean[] holds = new boolean[5];
			for (int i = 0; i < this.chbHolds.length; i++) {
				holds[i] = this.chbHolds[i].isSelected();
			}
			logicYatzy.throwDice(holds);
			int[] newValues = logicYatzy.getValues();
			this.lblRolled.setText("Rolls: " + logicYatzy.getThrowCount() + "/3");

			for (int i = 0; i < newValues.length; i++) {
				this.txfValues[i].setText(Integer.toString(newValues[i]));
			}
			this.calcScoring();
		}
	}

	// -------------------------------------------------------------------------
	private void scorePane(GridPane pane) {
		GridPane scorePane = new GridPane();
		pane.add(scorePane, 0, 1);
		scorePane.setGridLinesVisible(false);
		scorePane.setPadding(new Insets(10));
		scorePane.setVgap(5);
		scorePane.setHgap(10);
		scorePane.setStyle("-fx-border-color: black");
		int w = 50; // width of the text fields

		this.txfResults = new TextField[15];
		for (int i = 0; i < txfResults.length; i++) {
			this.txfResults[i] = new TextField("0");
			this.txfResults[i].setPrefWidth(w);
			this.txfResults[i].setOnMouseClicked(event -> determineEventFunction(event));
			scorePane.add(this.txfResults[i], 1, i);

			Label lbl = new Label(determineLabel(i));
			scorePane.add(lbl, 0, i);
		}
	}

	private void calcScoring() {
		for (int i = 0; i < this.txfResults.length; i++) {
			this.determineScoringAlgorithm(i);
		}
	}

	private void determineScoringAlgorithm(int i) {
		if (i >= 0 && i <= 6) {
			if (!checkIfFieldDisabled(i)) {
				this.txfResults[i].setText(Integer.toString(logicYatzy.sameValuePoints(i + 1)));
			}
		} else if (i == 7) {
			if (!checkIfFieldDisabled(i)) {
				this.txfResults[i - 1].setText(Integer.toString(logicYatzy.onePairPoints()));
			}
		}
	}

	private boolean checkIfFieldDisabled(int i) {
		return this.txfResults[i].isDisabled();
	}

	private void determineEventFunction(Event event) {
		TextField txt = (TextField) event.getSource();
		txt.setDisable(true);
	}

	private String determineLabel(int i) {
		if (i >= 0 && i <= 5) {
			return (i + 1) + "-s";
		} else if (i == 6) {
			return "One Pair";
		} else if (i == 7) {
			return "Two Pairs";
		} else if (i == 8) {
			return "Three Same";
		} else if (i == 9) {
			return "Four Same";
		} else if (i == 10) {
			return "Full House";
		} else if (i == 11) {
			return "Small Straight";
		} else if (i == 12) {
			return "Large Straight";
		} else if (i == 13) {
			return "Change";
		} else {
			return "Yatzy";
		}
	}

	private Yatzy logicYatzy = new Yatzy();

	// -------------------------------------------------------------------------

	// Create a method for mouse click on one of the text fields in txfResults.
	// Hint: Create small helper methods to be used in the mouse click method.
	// TODO

}
