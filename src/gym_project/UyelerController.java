/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_project;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class UyelerController implements Initializable {

    /**
     *
     */
    Dosya_islemleri d = new Dosya_islemleri();
    int index;
    @FXML
    private TextField uye_id1;
    @FXML
    private TextField bolum1;
    @FXML
    private TextField tel_numarasi1;
    @FXML
    private TextField uye_ismi1;
    @FXML
    private TextField odenecek_miktari1;
    @FXML
    private TextField baslama_tarihi1;
    @FXML
    private TableView<Normal_Uye> tableview;
    @FXML
    private TableColumn<Normal_Uye, Integer> idv;
    @FXML
    private TableColumn<Normal_Uye, String> isimv;
    @FXML
    private TableColumn<Normal_Uye, String> telv;
    @FXML
    private TableColumn<Normal_Uye, String> bv;
    @FXML
    private TableColumn<Normal_Uye, String> gasv;
    @FXML
    private TableColumn<Normal_Uye, Integer> aylikv;

    @FXML
    private TableView<Ozel_Uye> tableview1;
    @FXML
    private TableColumn<Ozel_Uye, Integer> idc;
    @FXML
    private TableColumn<Ozel_Uye, String> isimc;
    @FXML
    private TableColumn<Ozel_Uye, String> telc;
    @FXML
    private TableColumn<Ozel_Uye, String> bolumc;
    @FXML
    private TableColumn<Ozel_Uye, Integer> aylikc;
    @FXML
    private TextField uye_id2;
    @FXML
    private TextField odenecek_miktar2;
    @FXML
    private TextField bolum2;
    @FXML
    private TextField tel_numarasi2;
    @FXML
    private TextField uye_ismi2;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void Back(ActionEvent event) {
        try {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("Ana_Ekran.fxml"));
            Scene tableVView = new Scene(tableViewParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(tableVView);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(Ana_EkranController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    public void getSelected() {
        index = tableview.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        uye_id1.setText(idv.getCellData(index).toString());
        uye_ismi1.setText(isimv.getCellData(index));
        tel_numarasi1.setText(telv.getCellData(index));
        bolum1.setText(bv.getCellData(index));
        baslama_tarihi1.setText(gasv.getCellData(index));
        odenecek_miktari1.setText(aylikv.getCellData(index).toString());

    }

    @FXML
    private void Ekleme1(ActionEvent event) throws IOException {

        String f1 = "N1.txt";

        d.yaz(uye_id1.getText(), f1);
        d.yaz(uye_ismi1.getText(), f1);
        d.yaz(tel_numarasi1.getText(), f1);
        d.yaz(bolum1.getText(), f1);
        d.yaz(baslama_tarihi1.getText(), f1);
        d.yaz1(odenecek_miktari1.getText(), f1);
        tableview.getItems().clear();
        Listeleme();
    }

  
    private void Listeleme() throws IOException {
      String f1 = "N1.txt";
        tableview.getItems().clear();
        d.oku(f1, "Normal_Uye");
        idv.setCellValueFactory(new PropertyValueFactory<Normal_Uye, Integer>("Uye_id"));
        isimv.setCellValueFactory(new PropertyValueFactory<Normal_Uye, String>("Uye_ismi"));
        telv.setCellValueFactory(new PropertyValueFactory<Normal_Uye, String>("tel_numarasi"));
        bv.setCellValueFactory(new PropertyValueFactory<Normal_Uye, String>("Bolum"));
        gasv.setCellValueFactory(new PropertyValueFactory<Normal_Uye, String>("Baslama_tarihi"));
        aylikv.setCellValueFactory(new PropertyValueFactory<Normal_Uye, Integer>("odenecek_miktar"));
        tableview.setItems(d.getDataList());

    }
  
    @FXML
    private void Ekleme2(ActionEvent event2) throws IOException {

        String f2 = "Ozel_Uye.txt";

        d.yaz(uye_id2.getText(), f2);
        d.yaz(uye_ismi2.getText(), f2);
        d.yaz(tel_numarasi2.getText(), f2);
        d.yaz(bolum2.getText(), f2);
        d.yaz1(odenecek_miktar2.getText(), f2);

    }

    @FXML
    private void Silme1(ActionEvent event) throws IOException {
        String f1 = "N1.txt";
        d.sil(f1, uye_id1.getText());
        Listeleme();

    }
  @FXML
    private void Guncelleme1(ActionEvent event) throws IOException {
  String f1 = "N1.txt";
      d.guncelle(f1, uye_id1.getText(), uye_ismi1.getText(),  tel_numarasi1.getText(),  bolum1.getText(),  baslama_tarihi1.getText(),  odenecek_miktari1.getText());
     tableview.getItems().clear();
        Listeleme();
    }

    @FXML
    private void Guncelleme2(ActionEvent event) {
    }

    @FXML
    private void Silme2(ActionEvent event) {
    }

    @FXML
    private void Listele(ActionEvent event) throws IOException {

        Listeleme();
    }

}
