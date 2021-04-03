/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class Antrenor_FitnessController implements Initializable {

    @FXML
    private TextField Antrenor_id;
    @FXML
    private TextField Antrenor_ismi;
    @FXML
    private TextField tel_numarasi;
    @FXML
    private TableColumn<?, ?> E_mail;
    @FXML
    private TextField Weight;
    @FXML
    private TextField Gorev_suresi;
    @FXML
    private ComboBox<String> secim;
    @FXML
    private TextField yaş;
    @FXML
    private TableColumn<?, ?> maas;
    @FXML
    private TableColumn<?, ?> id;
    @FXML
    private TableColumn<?, ?> isim;
    @FXML
    
    private TableColumn<?, ?> tel_num;
    @FXML
    private TableColumn<?, ?> weight;
    @FXML
    private TableColumn<?, ?> gorev;
    @FXML
    private TableColumn<?, ?> yas;
    @FXML
    private TextField E_mail1;
    @FXML
    private TextField maas1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Sec(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) {
    }

    @FXML
    private void Close(ActionEvent event) {
    }
    
}
