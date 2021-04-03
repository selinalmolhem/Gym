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
public class Fitness  extends Bolumler {
    private String Egitmen_ismi;
    private int uye_sayisi;

    public Fitness() {
    }

    public Fitness(int Bolum_id, String Bolum_ismi, int uyelik_ucreti,String Egitmen_ismi,int uye_sayisi) {
        super( Bolum_id, Bolum_ismi, uyelik_ucreti);
        this. Egitmen_ismi = Egitmen_ismi;
        this.uye_sayisi=uye_sayisi;
    }

    public String getEgitmen_ismi() {
        return Egitmen_ismi;
    }

    public void setEgitmen_ismi(String Egitmen_ismi) {
        this.Egitmen_ismi = Egitmen_ismi;
    }

    public int getUye_sayisi() {
        return uye_sayisi;
    }

    public void setUye_sayisi(int uye_sayisi) {
        this.uye_sayisi = uye_sayisi;
    }
    
    
    
    public double ucret_hesapla(int uyelik_ucreti) /*kendi kendine exercis yapmak */
    {
        return uyelik_ucreti;
    }
    public double ucret_hesapla(int uyelik_ucreti,int uye_sayisi) 
    {
        if(uye_sayisi >= 10)
        { uyelik_ucreti= 300;}
        else{uyelik_ucreti= 500;}
        return uyelik_ucreti;
    }
    

}
