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
public class Antrenor_tenis extends Antrenorler {

    private int calisma_saatleri;
    private float whieght;

    public Antrenor_tenis(int calisma_saatleri, float whieght, int Antrenor_id, String Antrenor_ismi, String tel_numarasi, String E_mail, float maas) {
        super(Antrenor_id, Antrenor_ismi, tel_numarasi, E_mail, maas);
        this.calisma_saatleri = calisma_saatleri;
        this.whieght = whieght;
    }

    public Antrenor_tenis() {
    }

    public int getCalisma_saatleri() {
        return calisma_saatleri;
    }

    public void setCalisma_saatleri(int calisma_saatleri) {
        this.calisma_saatleri = calisma_saatleri;
    }

    public float getWhieght() {
        return whieght;
    }

    public void setWhieght(float whieght) {
        this.whieght = whieght;
    }


    @Override
    public float getMaas(int s) {
this.calisma_saatleri=s;
return s*100  ;    }

}
