package term1.lesson36.gui;

import javafx.scene.control.ListView;
import term1.lesson36.model.Parkeringshus;

public class OptagnePladserListView extends ListView<String> {
    Parkeringshus valgtParkeringshus;

    public OptagnePladserListView(Parkeringshus valgtParkeringshus) {
        super();
        this.valgtParkeringshus = valgtParkeringshus;
        this.setPrefWidth(350);
        this.initContent();
    }

    private void initContent() {
        opdaterView();
    }

    public void setValgtParkeringshus(Parkeringshus valgtParkeringshus) {
        this.valgtParkeringshus = valgtParkeringshus;
    }

    public void opdaterView() {
        this.getItems().setAll(valgtParkeringshus.optagnePladser());
        this.getSelectionModel().selectFirst();
    }
}
