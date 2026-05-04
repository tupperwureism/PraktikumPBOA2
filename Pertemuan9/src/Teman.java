/*
Nama : Shalom Kurniawan
NIM ; 24060124120033
Kelas : A
Tanggal : 4 Mei 2026
*/
import java.util.*;

public class Teman {
    //atribut
    private int nbelm;
    private ArrayList<String> Lnama;

    //method
    public Teman(){
        nbelm = 0;
        Lnama = new ArrayList<>();
    }

    public int getNbelm(){
        return nbelm;
    }

    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama){
        for(int i = 0; i < Lnama.size(); i++){
            if(Lnama.get(i) == nama){
                Lnama.remove(i);
                nbelm--;
                // Lnama.set(i, "");
            }
        }
    }

    public boolean isMember(String nama){
        for(int i = 0; i < Lnama.size(); i++){
            if(Lnama.get(i) == nama){
                return true;
            }
        }
        return false;
    }

    public void gantiNama(String nama, String namabaru){
        for(int i = 0; i < Lnama.size(); i++){
            if(Lnama.get(i) == nama){
                Lnama.set(i, namabaru);
            }
        }
    }

    public int countNama(String nama){
        int temp = 0;
        for(String n : Lnama){
            if(n == nama){
                temp++;
            }
        }
        return temp;
    }

    public void showTeman(){
        for(int i = 0; i < Lnama.size(); i++){
            System.out.println(Lnama.get(i));
            System.out.println();
        }
        System.out.println("Banyak teman: " + getNbelm());
    }



}
