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
public class Toplar extends Malzemeler {

    private float hacim;
    private String renk;
    private int sayi;
    private  String bolum;

    public Toplar() {
    }

    public Toplar(int Malzeme_id, String bolum, float hacim, String renk, int sayi) {
        super(Malzeme_id);
        this.hacim = hacim;
        this.renk = renk;
        this.sayi = sayi;

    }

    public float getHacim() {
        return hacim;
    }

    public void setHacim(float hacim) {
        this.hacim = hacim;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

}
