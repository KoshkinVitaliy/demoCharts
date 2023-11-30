module com.example.democharts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.democharts to javafx.fxml;
    exports com.example.democharts;
}