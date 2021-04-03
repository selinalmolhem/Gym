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
public class Yuzme extends Bolumler {
    private String havuz_turu;

    public Yuzme() {
    }
    

    public  Yuzme  (int Bolum_id, String Bolum_ismi, int uyelik_ucreti, String havuz_turu) {
        super( Bolum_id, Bolum_ismi, uyelik_ucreti);
        this.havuz_turu = havuz_turu;

    }

    public String getHavuz_turu() {
        return havuz_turu;
    }

    public void setHavuz_turu(String havuz_turu) {
        this.havuz_turu = havuz_turu;
    }
}
