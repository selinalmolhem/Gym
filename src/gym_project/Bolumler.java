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
public class Bolumler {
    private int Bolum_id;
    private String Bolum_ismi;
    private int uyelik_ucreti;

    public Bolumler() {
    }

    public Bolumler(int Bolum_id, String Bolum_ismi, int uyelik_ucreti) {
        this.Bolum_id = Bolum_id;
        this.Bolum_ismi = Bolum_ismi;
        this.uyelik_ucreti = uyelik_ucreti;
    }

    public int getBolum_id() {
        return Bolum_id;
    }

    public void setBolum_id(int Bolum_id) {
        this.Bolum_id = Bolum_id;
    }

    public String getBolum_ismi() {
        return Bolum_ismi;
    }

    public void setBolum_ismi(String Bolum_ismi) {
        this.Bolum_ismi = Bolum_ismi;
    }



    public int getUyelik_ucreti() {
        return uyelik_ucreti;
    }

    public void setUyelik_ucreti(int uyelik_ucreti) {
        this.uyelik_ucreti = uyelik_ucreti;
    }
    

    public void Listeleme(){};
    public void Ara_durum(){};
    public void Geridon(){};
    
}
