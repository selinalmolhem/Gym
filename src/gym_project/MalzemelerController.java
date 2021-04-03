/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class MalzemelerController implements Initializable {

    @FXML
    private TableColumn<?, ?> cihaz_ismi;
    @FXML
    private TableColumn<?, ?> etkisi;
    @FXML
    private TableColumn<?, ?> beden;
    @FXML
    private TableColumn<?, ?> tipi;
    @FXML
    private TableColumn<?, ?> marka;
    @FXML
    private TableColumn<?, ?> hacmi;
    @FXML
    private TableColumn<?, ?> renki;
    @FXML
    private TableColumn<?, ?> bolumu;
    @FXML
    private TableColumn<?, ?> sayi;
    @FXML
    private TableColumn<?, ?> id_malzeme4;
    @FXML
    private TableColumn<?, ?> kisi_sayi;
    @FXML
    private TableColumn<?, ?> id_malzeme3;
    @FXML
    private TableColumn<?, ?> durum2;
    @FXML
    private TableColumn<?, ?> id_malzeme2;
    @FXML
    private TableColumn<?, ?> durum1;
    @FXML
    private TableColumn<?, ?> id_malzeme1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Back(ActionEvent event) {
         try {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Ana_Ekran.fxml"));
            Scene tableview = new Scene(tableViewParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableview);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(Ana_EkranController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void Search(ActionEvent event) {
    }
    
}
