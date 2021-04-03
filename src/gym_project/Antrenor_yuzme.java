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
public class Antrenor_yuzme extends Antrenorler {

    private String Egitim_duzeyi;
    private float whieght;
 
    public Antrenor_yuzme(String Egitim_duzeyi, float whieght, int Antrenor_id, String Antrenor_ismi, String tel_numarasi, String E_mail, float maas) {
        super(Antrenor_id, Antrenor_ismi, tel_numarasi, E_mail, maas);
        this.Egitim_duzeyi = Egitim_duzeyi;
        this.whieght = whieght;
    }

    public Antrenor_yuzme(float whieght, int Antrenor_id, String Antrenor_ismi, String tel_numarasi, String E_mail, float maas) {
        super(Antrenor_id, Antrenor_ismi, tel_numarasi, E_mail, maas);
        this.whieght = whieght;
    }



    public Antrenor_yuzme() {
    }

    public String getEgitim_duzeyi() {
        return Egitim_duzeyi;
    }

    public void setEgitim_duzeyi(String Egitim_duzeyi) {
        this.Egitim_duzeyi = Egitim_duzeyi;
    }


    public float getWhieght() {
        return whieght;
    }

    public void setWhieght(float whieght) {
        this.whieght = whieght;
    }

    @Override
    public float getMaas(int s) {
 return super.getMaas();
 }

    }


