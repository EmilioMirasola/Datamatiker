package term1.lesson35;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import term1.lesson35.controller.Controller;
import term1.lesson35.model.Festival;
import term1.lesson35.model.Frivillig;
import term1.lesson35.model.Job;
import term1.lesson35.model.Vagt;

import java.util.Arrays;

public class MainApp extends Application {
    GridPane pane;
    ListView<Festival> festivalListView;
    ListView<Job> jobsListView;
    ListView<Frivillig> frivilligeListView;
    ListView<Vagt> vagtListView;
    TextField txtTimer;
    TextArea txtVagter;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.pane = new GridPane();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        this.initContent();
    }

    private void initContent() {
        this.festivaller();
        this.jobs();
        this.frivillige();
        this.vagter();
        this.tagVagt();
    }

    private void tagVagt() {
        HBox box = new HBox();
        Label label = new Label("Timer:");
        txtTimer = new TextField();
        Button btnTagVagt = new Button("Tag vagt");
        box.getChildren().addAll(Arrays.asList(label, txtTimer, btnTagVagt));

        btnTagVagt.setOnAction(event -> tilføjVagtTilFrivillig());
        pane.add(box, 1, 3);
    }

    private void tilføjVagtTilFrivillig() {
        Frivillig frivillig = frivilligeListView.getSelectionModel().getSelectedItem();
        Job job = jobsListView.getSelectionModel().getSelectedItem();
        try {
            int valgteTimer = Integer.parseInt(txtTimer.getText());
            try {
                Controller.tagVagt(job, frivillig, valgteTimer);
                updateVagtView();
                txtTimer.clear();
            } catch (RuntimeException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("FEJL I FRIVILLIGS TIMER");
                alert.setContentText(e.getMessage());
                alert.show();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input mismatch");
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    private void vagter() {
        txtVagter = new TextArea();
        pane.add(txtVagter, 3, 1);
        updateVagtView();

        Label label = new Label("Vagter");
        pane.add(label, 3, 0);
    }

    private void frivillige() {
        frivilligeListView = new ListView<>();
        frivilligeListView.getItems().setAll(Controller.getFrivillige());
        frivilligeListView.getSelectionModel().selectFirst();
        pane.add(frivilligeListView, 2, 1);

        frivilligeListView.setOnMouseClicked(event -> updateVagtView());

        Label label = new Label("Frivillige");
        pane.add(label, 2, 0);
    }

    private void jobs() {
        jobsListView = new ListView<>();
        jobsListView.getItems().setAll(festivalListView.getSelectionModel().getSelectedItem().getJobs());
        jobsListView.getSelectionModel().selectFirst();
        pane.add(jobsListView, 1, 1);

        Label label = new Label("Jobs");
        pane.add(label, 1, 0);
    }

    private void festivaller() {
        festivalListView = new ListView<>();
        festivalListView.getItems().setAll(Controller.getFestivaller());
        festivalListView.getSelectionModel().selectFirst();
        pane.add(festivalListView, 0, 1);

        Label label = new Label("Festivaller");
        pane.add(label, 0, 0);
    }

    private void updateVagtView() {
        Frivillig valgtFrivillig = frivilligeListView.getSelectionModel().getSelectedItem();
        txtVagter.clear();
        txtVagter.appendText(valgtFrivillig.getNavn() + "\n");
        txtVagter.appendText("Maks antal timer, der ønskes: " + valgtFrivillig.getMaksAntalTimer() + "\n");
        valgtFrivillig.getVagter().forEach((vagt -> {
            txtVagter.appendText(vagt.getTimer() + " timer på " + vagt.getJob().getKode() + "\n");
        }));
    }

}
