module com.example.weatherfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;


    opens com.example.weatherfx to javafx.fxml;
    exports com.example.weatherfx;
}