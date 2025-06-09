package cm.victormodjo.mvviewdesk.controller;

import cm.victormodjo.mvviewdesk.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainappController {

    @FXML
    private Button addwebsite;

    @FXML
    private VBox vboxlistwebsite;

    @FXML
    private void initialize(){
        addwebsite.setOnAction(event ->SpawnSaveInterface());
    }


    // fonction de spwan de l'interface d'enregistrement
    public void SpawnSaveInterface(){
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("addwebsite.fxml"));
            Parent root = loader.load();
            Scene scene  = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("add a new website");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
