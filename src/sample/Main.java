package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello Rubuuik's Cubes");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();


    }
//hello this is testing bla bla

    public static void main(String[] args) {
        launch(args);
    }
}
