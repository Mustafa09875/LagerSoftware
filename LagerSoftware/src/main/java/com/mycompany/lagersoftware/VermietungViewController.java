/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lagersoftware;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class VermietungViewController implements Initializable {

    @FXML
    private HBox LagerVerwaltungHbox;
    @FXML
    private ListView<?> lwSelectKunde;
    @FXML
    private ListView<?> lwSelectTechniker;
    @FXML
    private ListView<?> lwSelectTechnik;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnTechnikanlegen(ActionEvent event) {
    }

    @FXML
    private void BtnTechnikAnpassen(ActionEvent event) {
    }

    @FXML
    private void BtnTechnikRegale(ActionEvent event) {
    }

    @FXML
    private void btnSelectKunde(MouseEvent event) {
    }

    @FXML
    private void btnSelectTechniker(MouseEvent event) {
    }

    @FXML
    private void btnSelectTechnik(MouseEvent event) {
    }
    
}
