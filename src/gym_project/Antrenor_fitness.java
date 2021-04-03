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
public class Antrenor_fitness extends Antrenorler{
  
    private float whieght;
      private int  gorev_suresi;
    private float yaş ;
private int groupsayisi ;

    public Antrenor_fitness(float whieght, int gorev_suresi, float yaş, int groupsayisi, int Antrenor_id, String Antrenor_ismi, String tel_numarasi, String E_mail, float maas) {
        super(Antrenor_id, Antrenor_ismi, tel_numarasi, E_mail, maas);
        this.whieght = whieght;
        this.gorev_suresi = gorev_suresi;
        this.yaş = yaş;
        this.groupsayisi = groupsayisi;
    }

    public Antrenor_fitness(float whieght, int gorev_suresi, float yaş, int groupsayisi) {
        this.whieght = whieght;
        this.gorev_suresi = gorev_suresi;
        this.yaş = yaş;
        this.groupsayisi = groupsayisi;
    }



    public Antrenor_fitness(float whieght, int gorev_suresi, float yaş) {
        this.whieght = whieght;
        this.gorev_suresi = gorev_suresi;
        this.yaş = yaş;
    }

    public Antrenor_fitness() {
    }

    public float getWhieght() {
        return whieght;
    }

    public void setWhieght(float whieght) {
        this.whieght = whieght;
    }

   

    public float getYaş() {
        return yaş;
    }

    public void setYaş(float yaş) {
        this.yaş = yaş;
    }

    public int getGorev_suresi() {
        return gorev_suresi;
    }

    public void setGorev_suresi(int gorev_suresi) {
        this.gorev_suresi = gorev_suresi;
    }


    @Override
    public float getMaas(int s) {
this.groupsayisi=s;
return s*500;    }
    
    
}
