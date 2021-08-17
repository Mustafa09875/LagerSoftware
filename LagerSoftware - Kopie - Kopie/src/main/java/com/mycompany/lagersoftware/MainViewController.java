/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lagersoftware;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class MainViewController implements Initializable {

    @FXML
    private ImageView MinBtn;
    @FXML
    private ImageView CloseBtn;
    @FXML
    private AnchorPane MenuePane;
    @FXML
    private Label TxtUeberschrift;

    @FXML
    private Button BtnMraus;
    @FXML
    private Button BtnMrein;
    @FXML
    private HBox TitleBar;
    @FXML
    private BorderPane borderpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BtnMraus.setVisible(false);
      TitleBar.requestFocus();
      TitleBar.setFocusTraversable(true);
        //MenuePane wird nach links verschoben
        MenuePane.setTranslateX(-156);
        MenuePane.setVisible(false);
        
        CloseBtn.setOnMouseClicked(event -> {
            Stage stage = (Stage) CloseBtn.getScene().getWindow();
    stage.close();
        });
        CloseBtn.setOnMouseEntered((tt) -> {
            CloseBtn.setFitHeight(24);
            CloseBtn.setFitWidth(24);
        });
        CloseBtn.setOnMouseExited((ttt) -> {
            CloseBtn.setFitHeight(20);
            CloseBtn.setFitWidth(20);
        });
        

        MinBtn.setOnMousePressed((ss) -> {
            Stage s = (Stage) ((Node) ss.getSource()).getScene().getWindow();
            s.setIconified(true);
        });
        MinBtn.setOnMouseEntered((sss) -> {
            MinBtn.setFitHeight(24);
            MinBtn.setFitWidth(24);
        });
        MinBtn.setOnMouseExited((ssss) -> {
            MinBtn.setFitHeight(20);
            MinBtn.setFitWidth(20);
        });
        // TODO
    }    

    @FXML
    private void BtnVermietung(ActionEvent event) {
    }

    @FXML
    private void BtnTechniker(ActionEvent event) {
    }


    @FXML
    private void BtnLagerVerwaltung(ActionEvent event) throws IOException {
      AnchorPane  pane = FXMLLoader.load(getClass().getResource("LagerVerwaltungView.fxml"));
      borderpane.setCenter(pane);
    }
    
   
    

    @FXML
    private void BtnMraus(ActionEvent event) throws IOException {     MenuePane.setVisible(true);
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(MenuePane);

        slide.setToX(-160);
        slide.play();

        MenuePane.setTranslateX(0);
        slide.setOnFinished((t) -> {
            BtnMrein.setVisible(true);
            BtnMraus.setVisible(false);
            TxtUeberschrift.requestFocus();
        try {
            App.setRoot("MainView");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        });
       
        
    }

    @FXML
    private void BtnMrein(ActionEvent event) {
          MenuePane.setVisible(true);
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(MenuePane);

        slide.setToX(0);
        slide.play();

        MenuePane.setTranslateX(-156);
        slide.setOnFinished((t) -> {
            BtnMrein.setVisible(false);
            BtnMraus.setVisible(true);
            BtnMraus.requestFocus();
        });
    }
    }



