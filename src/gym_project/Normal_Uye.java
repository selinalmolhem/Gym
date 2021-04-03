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
public class Normal_Uye extends Uyeler {

    private String baslama_tarihi;
    private int ozelodemeler;
    private double s;

    public Normal_Uye(String baslama_tarihi, int ozelodemeler, double s, int uye_id, String uye_ismi, String tel_numarasi, String bolum, int odenecek_miktar) {
        super(uye_id, uye_ismi, tel_numarasi, bolum, odenecek_miktar);
        this.baslama_tarihi = baslama_tarihi;
        this.ozelodemeler = ozelodemeler;
        this.s = s;
    }

    public Normal_Uye( int uye_id, String uye_ismi, String tel_numarasi, String bolum,String baslama_tarihi, int odenecek_miktar) {
        super(uye_id, uye_ismi, tel_numarasi, bolum, odenecek_miktar);
        this.baslama_tarihi = baslama_tarihi;
    }




    public String getBaslama_tarihi() {
        return baslama_tarihi;
    }

    public void setBaslama_tarihi(String baslama_tarihi) {
        this.baslama_tarihi = baslama_tarihi;
    }

    public double Odenecek_miktar_hesapla(int h) {
        this.ozelodemeler = h;
        s = h + super.getOdenecek_miktar();
        return s;

    }

    public Normal_Uye() {
    }

    @Override
    public String toString() {
        return "Normal_Uye{" + "baslama_tarihi=" + baslama_tarihi + ", ozelodemeler=" + ozelodemeler + ", s=" + s + '}';
    }


}
