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
public class Raketler extends Malzemeler {

    private String tipi;
    private String marka;
    private String durum;

    public Raketler() {
    }

    public Raketler(int Malzeme_id, String tipi, String marka, String durum) {
        super(Malzeme_id);
        this.tipi = tipi;
        this.marka = marka;
        this.durum = durum;

    }

    public String getTipi() {
        return tipi;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

}
