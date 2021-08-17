module com.mycompany.lagersoftware {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.lagersoftware to javafx.fxml;
    exports com.mycompany.lagersoftware;
}
