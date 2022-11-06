package com.example.weatherfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    static String reg = "77";
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("weatherFrame.fxml"));
       Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
       stage.setScene(scene);
        stage.show();
        stage.setTitle("Погода");
        Weather weather = new Weather();

        TextField textField = (TextField) fxmlLoader.getNamespace().get("textFieldChangeCity");
        textField.setText(reg);
        textField.getText();
        weather.GetRegion(textField.getText());

        List<String> citiesList = new ArrayList<String>(weather.CAH.keySet());
            System.out.println(weather.CAH);

        ComboBox comboBoxChangeCity = (ComboBox) fxmlLoader.getNamespace().get("comboBoxChangeCity");
        comboBoxChangeCity.getItems().addAll(citiesList);
    }


    public void handle(KeyEvent e) {
        if (e.getCode().equals(KeyCode.ENTER)) {
        }
    }

    public static void main(String[] args) {
//        Weather weather = new Weather();
//        weather.GetRegion("77");
//        weather.FindCity("Москва");
//        weather.getWeatherFor8Days();
        launch();
    }
}//