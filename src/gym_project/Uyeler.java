/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_project;

/**
 *
 * @author hp
 */
public abstract class Uyeler {

    Bolumler b1 = new Bolumler();
    private int uye_id;
    private String uye_ismi;
    private String tel_numarasi;
    private String bolum;
    private int odenecek_miktar;

    public Uyeler(int uye_id, String uye_ismi, String tel_numarasi, String bolum, int odenecek_miktar) {
        this.uye_id = uye_id;
        this.uye_ismi = uye_ismi;
        this.tel_numarasi = tel_numarasi;
        this.bolum = bolum;
        this.odenecek_miktar = odenecek_miktar;
    }



    public Uyeler() {
    }

    public String getUye_ismi() {
        return uye_ismi;
    }

    public String getTel_numarasi() {
        return tel_numarasi;
    }

    
    public String getBolum() {
        return bolum;
    }

    public void setUye_ismi(String uye_ismi) {
        this.uye_ismi = uye_ismi;
    }

    public void setTel_numarasi(String tel_numarasi) {
        this.tel_numarasi = tel_numarasi;
    }


    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public Bolumler getB1() {
        return b1;
    }

    public void setB1(Bolumler b1) {
        this.b1 = b1;
    }

    public int getUye_id() {
        return uye_id;
    }

    public void setUye_id(int uye_id) {
        this.uye_id = uye_id;
    }

    public int getOdenecek_miktar() {
        return odenecek_miktar;
    }

    public void setOdenecek_miktar(int odenecek_miktar) {
        this.odenecek_miktar = odenecek_miktar;
    }

 public abstract double Odenecek_miktar_hesapla(int h ) ;
 
 
}
