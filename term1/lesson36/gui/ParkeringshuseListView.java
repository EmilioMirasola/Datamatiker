package term1.lesson36.gui;

import javafx.scene.control.ListView;
import term1.lesson36.controller.Controller;
import term1.lesson36.model.Parkeringshus;

public class ParkeringshuseListView extends ListView<Parkeringshus> {
    public ParkeringshuseListView() {
        super();
        this.setPrefWidth(350);
        this.initContent();
    }

    private void initContent() {
        this.getItems().setAll(Controller.getParkeringshuse());
    }
}
