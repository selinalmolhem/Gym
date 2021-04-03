/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author hp
 */
public class Antrenor_TenisController {
	public String SecimText;
    @FXML
    private TextField Antrenor_id;
    @FXML
    private TextField Antrenor_ismi;
    @FXML
    private TextField tel_numarasi;
    @FXML
    private TextField E_mail;
    @FXML
    private TextField Weight;
    @FXML
    private TextField saat;
    @FXML
    private TextField yas;
    @FXML
    private TextField maas;
    @FXML
    private ComboBox<?> Secim;

    @FXML
    private void back(ActionEvent event) {
    }

    @FXML
    private void close(ActionEvent event) {
    }
    		
    @FXML
	public void Sec (ActionEvent actionEvent) {
		
		SecimText = Secim.getSelectionModel().getSelectedItem().toString();
		if(SecimText.equals("Ekle"))
		{
			
		}
		else if(SecimText.equals("Sil"))
		{
			
		}
		else if(SecimText.equals("Guncelle"))
		{
			
		}
		
		
}}
