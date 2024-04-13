module com.example.test3a {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test3a to javafx.fxml;
    exports com.example.test3a;
}