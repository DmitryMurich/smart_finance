package com.smartfinance.gui;

import com.smartfinance.constants.Constants;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        setUserAgentStylesheet(STYLESHEET_MODENA);
        Parent root = FXMLLoader.load(getClass().getResource("smartfinance.fxml"));
        primaryStage.setTitle(Constants.MAIN_NAME);
        primaryStage.setScene(new Scene(root, Constants.MAIN_WIDTH, Constants.MAIN_HEIGHT));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
