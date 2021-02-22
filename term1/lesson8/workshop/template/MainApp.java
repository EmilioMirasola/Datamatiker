package term1.lesson8.workshop.template;

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
        // exercise1(gc);
        // exercise2(gc);
        // exercise3_1(gc);
        // exercise3_2(gc);
        exercise3_3(gc);
        // int baseXY = 20;
        // int r = 100;
        // while (r >= 20) {
        //     gc.strokeOval(baseXY, baseXY, r, r);
        //     r -= 20;
        //     baseXY += 20;
        // }
    }

    private void exercise3_3(GraphicsContext gc) {
        int y = 20;
        int x1 = 90;
        int x2 = 110;
        int n = 0;
        while (n < 5) {
            gc.strokeLine(x1, y, x2, y);
            y += 40;
            x1 -= 20;
            x2 += 20;
            n++;
        }
    }

    private void exercise3_2(GraphicsContext gc) {
        int y = 20;
        int x1 = 10;
        int x2 = 190;
        int n = 0;
        while (n < 5) {
            gc.strokeLine(x1, y, x2, y);
            y += 40;
            n++;
        }
    }

    private void exercise3_1(GraphicsContext gc) {
        int x = 20;
        int y1 = 10;
        int y2 = 190;
        int n = 0;
        while (n < 5) {
            gc.strokeLine(x, y1, x, y2);
            x += 40;
            n++;
        }
    }

    private void exercise2(GraphicsContext gc) {
        int x1 = 100;
        int y1 = 100;
        int x2 = 20;
        int y2 = 10;

        while (x2 <= 180) {
            gc.strokeLine(x1, y1, x2, y2);
            x2 += 20;
        }
    }

    private void exercise1(GraphicsContext gc) {
        int x = 100;
        int y = 75;
        int length = 20;
        int height = 8;
        gc.strokeLine(x, y, x + length, y - height);
        gc.strokeLine(x, y, x + length, y + height);

        x = 100;
        y = 125;
        gc.strokeLine(x, y, x + length, y - height);
        gc.strokeLine(x, y, x + length, y + height);

        x = 20;
        y = 50;
        gc.strokeLine(x, y, x + length, y - height);
        gc.strokeLine(x, y, x + length, y + height);
    }

}
