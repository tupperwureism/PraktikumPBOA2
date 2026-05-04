/*
Nama : Shalom Kurniawan
NIM ; 24060124120033
Kelas : A
Tanggal : 4 Mei 2026
*/

import java.util.*;

public class Piaraan {
    //atribut
    private int nbelm;
    private ArrayList<Anabul> Lanabul;

    //method
    public Piaraan(){
        nbelm = 0;
        Lanabul = new ArrayList<>();
    }

    public int getNbelm(){
        return nbelm;
    }

    public void enqueueAnabul(Anabul A){
        Lanabul.add(A);
        nbelm++;
    }

    public boolean isMember(Anabul A){
        for(Anabul B : Lanabul){
            if(B == A){
                return true;
            }
        }
        return false;
    }

    public Anabul getAnabul(){
        return Lanabul.get(0);
    }

    public void dequeueAnabul(){
        Anabul temp = getAnabul();
        if(Lanabul.size() < 1){
            System.out.println("Belum punya piaraan");
            return;
        }
        Lanabul.remove(0);
        System.out.println("Anabul dengan nama " + temp.getPanggilan() + " dibuang");
        System.out.println();
        nbelm--;
    }

    public void showAnabul(){
        for(Anabul A : Lanabul){
            System.out.println(A.getPanggilan());
            System.out.println();
        }
    }

    public int countKucing(){
        int temp = 0;
        for(Anabul A : Lanabul){
            if(A instanceof Kucing){
                temp++;
            }
        }
        return temp;
    }

    public int bobotKucing(){
        int temp = 0;
        for(Anabul A : Lanabul){
            if(A instanceof Kucing){
                temp += ((Kucing)A).getBobot();
            }
        }
        return temp;
    }

    public void showJenisAnabul(){
        for(Anabul A : Lanabul){
            System.out.println(A.getPanggilan());
            System.out.println(A.getClass());
            System.out.println();
        }
    }
}
