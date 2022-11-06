package com.example.weatherfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("weatherFrame.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Погода");

    }

    public static void main(String[] args) {
        Weather weather = new Weather("77");
        weather.MapCityAndTemp();
        weather.FindCity("Москва");
        weather.getWeatherFor8Days();
        launch();
    }
}//