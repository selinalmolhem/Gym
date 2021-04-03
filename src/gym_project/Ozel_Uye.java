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

    
public class  Ozel_Uye extends Uyeler{
    private int hours ;
private double s;

    public Ozel_Uye(int hours, double s, int uye_id, String uye_ismi, String tel_numarasi, String bolum, int odenecek_miktar) {
        super(uye_id, uye_ismi, tel_numarasi, bolum, odenecek_miktar);
        this.hours = hours;
        this.s = s;
    }

    public Ozel_Uye(int hours, double s) {
        this.hours = hours;
        this.s = s;
    }

    public Ozel_Uye(int uye_id, String uye_ismi, String tel_numarasi, String bolum, int odenecek_miktar) {
        super(uye_id, uye_ismi, tel_numarasi, bolum, odenecek_miktar);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public Bolumler getB1() {
        return b1;
    }

    public void setB1(Bolumler b1) {
        this.b1 = b1;
    }

    @Override
    public String toString() {
        return "Ozel_Uye{" + "hours=" + hours + ", s=" + s + '}';
    }

    @Override
    public double Odenecek_miktar_hesapla(int h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
    
    }

