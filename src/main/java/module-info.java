module cm.victormodjo.mvviewdesk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;


    opens cm.victormodjo.mvviewdesk to javafx.fxml;
    opens cm.victormodjo.mvviewdesk.controller to javafx.fxml;
    exports cm.victormodjo.mvviewdesk;
}