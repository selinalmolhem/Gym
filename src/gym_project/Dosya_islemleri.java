/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author hp
 */
public class Dosya_islemleri {

    private final ObservableList<Normal_Uye> dataList
            = FXCollections.observableArrayList();

    private final ObservableList<Ozel_Uye> dataList1
            = FXCollections.observableArrayList();
    String[] object = new String[1000];
    private static Scanner x;

    public void oku(String f1, String Class) throws IOException {

        String line;
        String Split = ",";

        try {

            BufferedReader br = new BufferedReader(new FileReader(f1));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                object = line.split(Split);
                if ("Normal_Uye".equals(Class)) {
                    Normal_Uye n = new Normal_Uye(Integer.parseInt(object[0]), object[1], object[2],
                            object[3], object[4], Integer.parseInt(object[5]));
                    dataList.add(n);
                }
                if ("Ozel_Uye".equals(Class)) {
                    Ozel_Uye oz = new Ozel_Uye(Integer.parseInt(object[0]), object[1], object[2],
                            object[3], Integer.parseInt(object[4]));
                    dataList1.add(oz);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void yaz(String content, String f1) throws IOException {
        try {
            FileWriter fw = new FileWriter(f1, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(content + ",");

            bw.close();
        } catch (IOException ex) {

        }
    }

    public void yaz1(String content, String f1) throws IOException {

        try {
            FileWriter fw = new FileWriter(f1, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(content + ",");
            bw.newLine();
            bw.close();
        } catch (IOException ex) {

        }

    }

    public void sil(String f1, String id) throws IOException {
        ArrayList<String> liste1 = storage(f1);
        ArrayList<String> liste2 = storage("file.txt");
        String[] data1;
        String[] data2;
        for (int i = 0; i < liste1.size(); i++) {
            data1 = liste1.get(i).split(",");
            if (data1[0].equals(id)) {
                liste1.remove(i);
                FileWriter f = new FileWriter(new File(f1));
                BufferedWriter w = new BufferedWriter(f);
                for (String x : liste1) {
                    w.write(x + "\r\n");
                }
                w.close();
            }

        }
    }

    public void guncelle(String f1, String id, String a, String b, String c, String d, String e) throws IOException {
        ArrayList<String> liste1 = storage(f1);
        String[] data1;
        for (int i = 0; i < liste1.size(); i++) {
            data1 = liste1.get(i).split(",");
            if (data1[0].equals(id)) {
                liste1.set(i, id + "," + a + "," + b + "," + c + "," + d + "," + e);
                FileWriter f = new FileWriter(new File(f1));
                BufferedWriter w = new BufferedWriter(f);
                for (String x : liste1) {
                    w.write(x + "\r\n");
                }
                w.close();
            }
        }

    }

    public void guncelle(String f1, String id, String a, String b, String c, String d) throws IOException {
        ArrayList<String> liste1 = storage(f1);
        String[] data1;
        for (int i = 0; i < liste1.size(); i++) {
            data1 = liste1.get(i).split(",");
            if (data1[0].equals(id)) {
                liste1.set(i, id + "," + a + "," + b + "," + c + "," + d);
                FileWriter f = new FileWriter(new File(f1));
                BufferedWriter w = new BufferedWriter(f);
                for (String x : liste1) {
                    w.write(x + "\r\n");
                }
                w.close();
            }
        }

    }

    public void guncelle(String f1, String id, String a, String b, String c, String d, String e, String h, String g) throws IOException {
        ArrayList<String> liste1 = storage(f1);
        String[] data1;
        for (int i = 0; i < liste1.size(); i++) {
            data1 = liste1.get(i).split(",");
            if (data1[0].equals(id)) {
                liste1.set(i, id + "," + a + "," + b + "," + c + "," + d + "," + e + "," + h + "," + g);
                FileWriter f = new FileWriter(new File(f1));
                BufferedWriter w = new BufferedWriter(f);
                for (String x : liste1) {
                    w.write(x + "\r\n");
                }
                w.close();
            }
        }

    }

    public static ArrayList<String> storage(String f1) {

        ArrayList<String> all_data = new ArrayList<>();
        String data;
        try {
            Scanner s = new Scanner(new File(f1));
            while (s.hasNext()) {
                data = s.nextLine();
                all_data.add(data);

            }
            return all_data;

        } catch (IOException ex) {
        }
        return null;

    }

    /*
    String f1 = "C:\\Users\\hp\\Desktop\\Dosya";

    public int dosyaSatirSayisi() throws IOException {
        int sayi = 0;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        while (br.readLine() != null) {
            sayi++;
        }
        return sayi;
    }*/

 /*  Object ob[] = new Object[dosyaSatirSayisi()];
        String str;
        int dt;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        for (int i = 0; i < dosyaSatirSayisi(); i++) {
            str = br.readLine();
            ob[i] = new Object();
            while ((str = br.readLine()) != null) {

                String[] o = str.split(",");

                System.out.println("Uye [code= " + o[4] + " , name=" + o[5] + "]");

            }

        } 
        return ob;
}     */
 /* public Kisi oku() throws IOException {
    /* Kisi ks[]= new Kisi[];
    String str;
    FileReader fr = new FileReader(f1);
    BufferedWriter bw = new BufferedWriter(fr) ;
    str= br.readLine();
    ks.isim=str.substring(str.indexof("/")+1,str.indexof("#"));
    System.out.println(ks.isim);
    return ks;}
    int dosyasatirsayisi(){int sayi ;
    FileReader fr = new FileReader(f1);
    BufferedWriter bw = new BufferedWriter(fr) ;
    while()}
    try{
    BufferedReader reader = new BufferedReader(new FileReader(
    "C:\\programs\\file.txt"));
    while (true) {
    String line = reader.readLine();
    if (line == null) {
    break;
    }
    String[] parts = line.split(",");
    }
    reader.close();
    }catch (IOException e){}
    }
    public void yaz(Kisi ks) throws IOException {
    try {
    /*FileWriter fw=new FileWriter(f1,true);
    BufferedWriter bw = new BufferedWriter(fw) ;
    bw.write("/"+ks.isim+"#"+ks.soyisim+"%"+ks.dt);
    bw.close();
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:/Users/hp/Documents/uygulama.txt"), true));
    bw.write(str);
    bw.newLine();
    bw.close();
    } catch (IOException e) {
    }
    }
     */
    public String[] getOb() {
        return object;
    }

    public ObservableList<Normal_Uye> getDataList() {
        return dataList;
    }

    public ObservableList<Ozel_Uye> getDataList1() {
        return dataList1;
    }

    public String[] getObject() {
        return object;
    }

    public void setObject(String[] object) {
        this.object = object;
    }

}
