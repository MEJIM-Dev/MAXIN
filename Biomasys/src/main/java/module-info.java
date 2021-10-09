module com.example.biomasys {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.biomasys to javafx.fxml;
    exports com.example.biomasys;
}