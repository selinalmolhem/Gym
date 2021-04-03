/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author COMPUMAGIC
 */
public class LoginScreenController implements Initializable {
    

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Pane stackepane;

            
    @FXML
    private ImageView image;
     private Label label;

    @FXML
    public void exit(){Platform.exit();}
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        
        Parent Ana_ekran_parent = FXMLLoader.load(getClass().getResource("Ana_Ekran.fxml"));
        Scene Ana_ekran_scene = new Scene(Ana_ekran_parent);
        Stage app_stage =  (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(Ana_ekran_scene);
        app_stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }}
