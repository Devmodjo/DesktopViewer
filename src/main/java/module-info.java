module cm.victormodjo.mvviewdesk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens cm.victormodjo.mvviewdesk to javafx.fxml;
    exports cm.victormodjo.mvviewdesk;
}