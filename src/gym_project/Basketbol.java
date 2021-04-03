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
public class Basketbol  extends Bolumler {
    private String Takim_uyesayisi;

    public Basketbol() {
    }

    public Basketbol(int Bolum_id, String Bolum_ismi, int uyelik_ucreti,String Takim_uyesayisi) {
        super( Bolum_id, Bolum_ismi, uyelik_ucreti);
        this.Takim_uyesayisi = Takim_uyesayisi;
    }

    public String getTakim_uyesayisi() {
        return Takim_uyesayisi;
    }

    public void setTakim_uyesayisi(String Takim_uyesayisi) {
        this.Takim_uyesayisi = Takim_uyesayisi;
    }
    
    
    
}
