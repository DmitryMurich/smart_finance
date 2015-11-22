package com.smartfinance.gui;

import com.smartfinance.constants.Constants;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main extends Application {
    protected static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    @Override
    public void start(Stage primaryStage) throws Exception{
        setUserAgentStylesheet(STYLESHEET_MODENA);
        Parent root = FXMLLoader.load(getClass().getResource("smartfinance.fxml"));
        primaryStage.setTitle(Constants.MAIN_NAME);
        primaryStage.setScene(new Scene(root, Constants.MAIN_WIDTH, Constants.MAIN_HEIGHT));
        primaryStage.show();
    }


    public static void main(String[] args) {
        LOGGER.info("the main method started successfully");
        launch(args);
    }
}
