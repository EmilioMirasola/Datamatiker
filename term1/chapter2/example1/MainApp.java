package term1.chapter2.example1;

import java.util.Collection;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        // FIGURER OPGAVE 1-2
        // figurer12(pane);

        // OPGAVE 2
        // opgave2(pane);

        // OPGAVE 3
        // opgave3(pane);

        // OPGAVE 4
        // opgave4(pane);

        // OPGAVE 5
        // opgave5(pane);

        // FIGURER OPG 4
        figurer4(pane);

    }

    private void figurer4(Pane pane) {
        Circle center = new Circle(200, 200, 7, Color.RED);
        center.setStroke(Color.GREEN);
        center.setStrokeWidth(5);

        Circle middleCircle = new Circle(200, 200, 40, null);
        middleCircle.setStroke(Color.GREEN);
        middleCircle.setStrokeWidth(5);
        ;

        Circle outerCircleInnerStroke = new Circle(200, 200, 70, null);
        outerCircleInnerStroke.setStroke(Color.GREEN);
        outerCircleInnerStroke.setStrokeWidth(5);

        Circle outercircle = new Circle(200, 200, 80, null);
        outercircle.setStroke(Color.BLACK);
        outercircle.setStrokeWidth(20);

        Line arrow = new Line(200, 200, 220, 180);
        Line feather1 = new Line(220, 180, 215, 175);
        Line feather2 = new Line(220, 180, 217, 173);
        Line feather3 = new Line(220, 180, 219, 171);
        Line feather4 = new Line(220, 180, 221, 169);
        Line feather5 = new Line(220, 180, 223, 167);
        Line feather6 = new Line(220, 180, 225, 165);
        Line feather7 = new Line(220, 180, 227, 163);
        Line feather8 = new Line(220, 180, 229, 161);
        Line feather9 = new Line(220, 180, 231, 159);
        Line feather10 = new Line(220, 180, 233, 157);
        Line feather11 = new Line(220, 180, 215, 175);
        Line feather12 = new Line(220, 180, 217, 173);
        Line feather13 = new Line(220, 180, 219, 171);
        Line feather14 = new Line(220, 180, 221, 169);
        Line feather15 = new Line(220, 180, 223, 167);
        Line feather16 = new Line(220, 180, 225, 165);
        Line feather17 = new Line(220, 180, 227, 163);
        Line feather18 = new Line(220, 180, 241, 161);
        Line feather19 = new Line(220, 180, 229, 159);
        Line feather20 = new Line(220, 180, 231, 157);

        pane.getChildren().addAll(outercircle, outerCircleInnerStroke, middleCircle, center, arrow, feather1, feather2,
                feather3, feather4, feather5, feather6, feather7, feather8, feather9, feather10, feather11, feather12,
                feather13, feather14, feather15, feather16, feather17, feather18, feather19, feather20);
    };

    private void opgave5(Pane pane) {
        Circle circle1 = new Circle(100, 55, 50, Color.WHITE);
        circle1.setStroke(Color.BLUE);
        circle1.setStrokeWidth(5);

        Circle circle2 = new Circle(200, 55, 50, null);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(5);

        Circle circle3 = new Circle(300, 55, 50, null);
        circle3.setStroke(Color.RED);
        circle3.setStrokeWidth(5);

        Circle circle4 = new Circle(150, 100, 50, null);
        circle4.setStroke(Color.YELLOW);
        circle4.setStrokeWidth(5);

        Circle circle5 = new Circle(250, 100, 50, null);
        circle5.setStroke(Color.GREEN);
        circle5.setStrokeWidth(5);

        pane.getChildren().addAll(circle1, circle2, circle3, circle4, circle5);
    }

    private void opgave4(Pane pane) {
        Circle circle1 = new Circle(200, 200, 60, Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeWidth(10);

        Circle circle2 = new Circle(200, 200, 40, Color.WHITE);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(10);

        Circle circle3 = new Circle(200, 200, 20, Color.BLACK);

        pane.getChildren().addAll(circle1, circle2, circle3);
    }

    private void opgave3(Pane pane) {
        Circle headCircle = new Circle(200, 200, 100, Color.WHITE);
        headCircle.setStroke(Color.BLACK);

        Circle rightEye = new Circle(165, 160, 10, Color.WHITE);
        rightEye.setStroke(Color.BLACK);

        Circle leftEye = new Circle(235, 160, 10, Color.WHITE);
        leftEye.setStroke(Color.BLACK);

        Line nose = new Line(200, 195, 200, 205);

        Line mouth = new Line(155, 235, 245, 235);

        pane.getChildren().addAll(headCircle, rightEye, leftEye, mouth, nose);
    }

    private void opgave2(Pane pane) {
        Rectangle rectangle = new Rectangle(100, 50);
        rectangle.setFill(Color.BLUE);

        Text text = new Text(30, 30, "Emilio");
        text.setFill(Color.RED);

        pane.getChildren().addAll(rectangle, text);
    }

    private void figurer12(Pane pane) {
        int pixels = 100;
        Color color = Color.YELLOW;

        Circle circle = new Circle(pixels, 70, 30);
        circle.setFill(color);
        circle.setStroke(Color.BLACK);

        Rectangle rectangle = new Rectangle(pixels, 100, 30, 30);
        rectangle.setFill(color);
        rectangle.setStroke(Color.BLACK);

        Line line = new Line(pixels, pixels, pixels, 200);
        line.setFill(color);
        line.setStroke(Color.BLACK);

        pane.getChildren().addAll(circle, rectangle, line);
    }
}
