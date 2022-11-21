module com.example.lesson11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson11 to javafx.fxml;
    exports com.example.lesson11;
}