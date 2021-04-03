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
public class fitness_cihazlari  extends Malzemeler {

    private String isim;
    private String etkisi;
    private int kisi_sayi;

    public fitness_cihazlari () {
    }

    public fitness_cihazlari (int Malzeme_id, String isim, String etkisi, int kisi_sayi) {
        super(Malzeme_id);
        this.isim = isim;
        this.etkisi = etkisi;
        this.kisi_sayi = kisi_sayi;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEtkisi() {
        return etkisi;
    }

    public void setEtkisi(String etkisi) {
        this.etkisi = etkisi;
    }

    public int getKisi_sayi() {
        return kisi_sayi;
    }

    public void setKisi_sayi(int kisi_sayi) {
        this.kisi_sayi = kisi_sayi;
    }

    
}
