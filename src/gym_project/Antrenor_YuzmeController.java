/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 *
 * @author hp
 */
public class Antrenor_YuzmeController {

    @FXML
    private ComboBox<String> secim;
    @FXML
    private TableColumn<?, ?> id;
    @FXML
    private TableColumn<?, ?> isim;
    @FXML
    private TableColumn<?, ?> tel_numarasi;
    @FXML
    private TableColumn<?, ?> email;
    @FXML
    private TableColumn<?, ?> weight;
    @FXML
    private TableColumn<?, ?> egitim_duzeyi;
    @FXML
    private TableColumn<?, ?> maas;
    @FXML
    private TextField Tel_Num;
    @FXML
    private TextField E_mail;
    @FXML
    private TextField Weight;
    @FXML
    private TextField Egitmen_Duzeyi;
    @FXML
    private TextField Maas;

    @FXML
    private void Sec(ActionEvent event) {
    }

    @FXML
    private void Back(ActionEvent event) {
    }

    @FXML
    private void Close(ActionEvent event) {
    }
    
}
