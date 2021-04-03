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
public abstract class Antrenorler {
        Bolumler b2 = new Bolumler();

    private int Antrenor_id;
    private String Antrenor_ismi;
    private String tel_numarasi;
    private String E_mail;
    private float maas ;

    public Antrenorler(int Antrenor_id, String Antrenor_ismi, String tel_numarasi, String E_mail, float maas) {
        this.Antrenor_id = Antrenor_id;
        this.Antrenor_ismi = Antrenor_ismi;
        this.tel_numarasi = tel_numarasi;
        this.E_mail = E_mail;
        this.maas = maas;
    }

    public Antrenorler(int Antrenor_id, String Antrenor_ismi) {
        this.Antrenor_id = Antrenor_id;
        this.Antrenor_ismi = Antrenor_ismi;
    }


    public Antrenorler() {
    }

    public int getAntrenor_id() {
        return Antrenor_id;
    }

    public void setAntrenor_id(int Antrenor_id) {
        this.Antrenor_id = Antrenor_id;
    }

    public String getAntrenor_ismi() {
        return Antrenor_ismi;
    }

    public void setAntrenor_ismi(String Antrenor_ismi) {
        this.Antrenor_ismi = Antrenor_ismi;
    }

    public String getTel_numarasi() {
        return tel_numarasi;
    }

    public void setTel_numarasi(String tel_numarasi) {
        this.tel_numarasi = tel_numarasi;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public Bolumler getB2() {
        return b2;
    }

    public void setB2(Bolumler b2) {
        this.b2 = b2;
    }

    public float getMaas() {
        return maas;
    }

    public abstract float getMaas(int s);

    public void setMaas(float maas) {
        this.maas = maas;
    }

    public void Ekleme(){};
    public void Listeleme(){};
    public void Silme(){};
    public void Guncelleme(){};
    public void Arama(){};
    public void Geridon(){};


}
