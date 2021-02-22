package term1.lesson9.template;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
        gc.strokeLine(10, 160, 180, 160);
        gc.strokeLine(180, 160, 175, 155);
        gc.strokeLine(180, 160, 175, 165);

        int x = 20;
        int y1 = 155;
        int y2 = 165;

        for (int i = 0; i <= 10; i++) {
            if (i % 5 == 0) {
                gc.strokeLine(x, y1 - 5, x, y2 + 5);
                gc.strokeText("" + i, x-3, y2 + 20);

            } else {
                gc.strokeLine(x, y1, x, y2);
            }
            x += 15;
        }
    }

}
