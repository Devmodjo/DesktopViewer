module cm.victormodjo.mvviewdesk {
    requires javafx.controls;
    requires javafx.fxml;


    opens cm.victormodjo.mvviewdesk to javafx.fxml;
    exports cm.victormodjo.mvviewdesk;
}