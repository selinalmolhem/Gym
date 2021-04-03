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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class Ana_EkranController implements Initializable {

    public String SecimText;

    @FXML
    private Button Uyeler;
    @FXML
    private Button malzeme;
    @FXML
    private Button bolumler;
    @FXML
    private Button exit;
    @FXML
    public ComboBox<String> Secim;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //  Stage stage2 = new Stage();
//    
//           Parent root = FXMLLoader.load(getClass().getResource("Uyeler.fxml"));
//        
//        Scene scene2 = new Scene(root);
//        
//        stage2.setScene(scene2);
//        stage2.show()
     @FXML
    private void uyeler(ActionEvent a) throws IOException {
      try {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Uyeler.fxml"));
            Scene tableview = new Scene(tableViewParent);
            Stage window = (Stage) ((Node) a.getSource()).getScene().getWindow();
            window.setScene(tableview);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(Ana_EkranController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void bolumler(ActionEvent a) {
        try {
           Parent tableViewParent = FXMLLoader.load(getClass().getResource("Bolumler.fxml"));
            Scene tableview = new Scene(tableViewParent);
            Stage window = (Stage) ((Node) a.getSource()).getScene().getWindow();
            window.setScene(tableview);
            window.show();
        } catch (IOException ex) {
                        Logger.getLogger(Ana_EkranController.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    @FXML
    private void malzemeler(ActionEvent a) {
        try {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Malzemeler.fxml"));
            Scene tableview = new Scene(tableViewParent);
            Stage window = (Stage) ((Node) a.getSource()).getScene().getWindow();
            window.setScene(tableview);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(Ana_EkranController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
    @FXML
    private void exit(ActionEvent event) {
        try {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
            Scene tableview = new Scene(tableViewParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableview);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(Ana_EkranController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void Sec(ActionEvent event) {
    }

    
}
