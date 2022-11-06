package com.example.weatherfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class WeatherController {
    @FXML
    static TextField textfield;
   private String reg = textfield.getText();
    Weather weather = new Weather(reg);

    public void handle(KeyEvent e) {
        if (e.getCode().equals(KeyCode.ENTER)) {

          //  weather.MapCityAndTemp();
          //  weather.FindCity("Москва");
            // weather.getWeatherFor8Days();
        }
    }
//    @FXML
//    private Label welcomeText;

//    @FXML
//    protected void onHelloButtonClick() {
//
//    }
}