module com.example.logistique {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.logistique to javafx.fxml;
    exports com.example.logistique;
}