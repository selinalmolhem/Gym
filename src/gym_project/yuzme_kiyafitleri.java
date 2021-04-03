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
public class yuzme_kiyafitleri extends Malzemeler {

    private String isim;
    private String beden;
    private String durum;

    public yuzme_kiyafitleri() {
    }

    public yuzme_kiyafitleri(int Malzeme_id, String isim, String beden, String durum) {
        super(Malzeme_id);
        this.isim = isim;
        this.beden = beden;
        this.durum = durum;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBeden() {
        return beden;
    }

    public void setBeden(String beden) {
        this.beden = beden;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    
}
