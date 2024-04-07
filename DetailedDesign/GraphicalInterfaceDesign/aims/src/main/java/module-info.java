module com.example.labviet {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.labviet to javafx.fxml;
    exports com.example.labviet;
}