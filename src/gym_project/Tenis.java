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
public class Tenis  extends Bolumler {
    private int kortlar_sayisi;
    private int grup_sayisi;

    public Tenis() {
    }

    public  Tenis  (int Bolum_id, String Bolum_ismi, int uyelik_ucreti,int kortlar_sayisi,int grup_sayisi) {
        super( Bolum_id, Bolum_ismi, uyelik_ucreti);
        this.kortlar_sayisi = kortlar_sayisi;
        this.grup_sayisi = grup_sayisi;

    }

    public int getKortlar_sayisi() {
        return kortlar_sayisi;
    }

    public void setKortlar_sayisi(int kortlar_sayisi) {
        this.kortlar_sayisi = kortlar_sayisi;
    }

    public int getGrup_sayisi() {
        return grup_sayisi;
    }

    public void setGrup_sayisi(int grup_sayisi) {
        this.grup_sayisi = grup_sayisi;
    }
    
}
