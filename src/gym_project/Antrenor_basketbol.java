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
public class Antrenor_basketbol extends Antrenorler {

    private float uzunluk;

    public Antrenor_basketbol(float uzunluk, int Antrenor_id, String Antrenor_ismi, String tel_numarasi, String E_mail, float maas) {
        super(Antrenor_id, Antrenor_ismi, tel_numarasi, E_mail, maas);
        this.uzunluk = uzunluk;
    }

    public Antrenor_basketbol(float uzunluk) {
        this.uzunluk = uzunluk;
    }

    public Antrenor_basketbol() {

    }

    public float getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(float uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public float getMaas(int s) {
return super.getMaas();    }


}
