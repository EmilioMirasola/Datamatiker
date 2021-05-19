package term1.lesson35;

import javafx.application.Application;
import term1.lesson35.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller.initStorage();
        Application.launch(MainApp.class);
    }
}
