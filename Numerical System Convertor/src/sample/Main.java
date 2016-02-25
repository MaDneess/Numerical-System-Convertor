package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static String numbers = "0";
    public static String answer = "0";
    public static Scene scene;
    public enum STATE {
        HEX, DECIMAL, OCTAL, BINARY
    }
    public static STATE state = STATE.DECIMAL;
    public static boolean actionAdded = false;

    public enum ACTION {
        ADD, SUBTRACT, MULTI, DIVIDE, NO_ACTION
    }
    public static ACTION action = ACTION.NO_ACTION;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../layout/calculatorLayout.fxml"));
        primaryStage.setTitle("Programmer");
        primaryStage.getIcons().add(new Image("/style/images.jpg"));
        scene = new Scene(root);
        scene.getStylesheets().add("style/styleSheet");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
