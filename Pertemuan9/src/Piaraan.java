/*
Nama : Shalom Kurniawan
NIM  : 24060124120033
Kelas : A
Tanggal : 4 Mei 2026
*/

import java.util.*;

public class Piaraan {
    // atribut
    private int nbelm;
    private Queue<Anabul> Lanabul; 

    // method
    public Piaraan() {
        nbelm = 0;
        Lanabul = new LinkedList<>(); 
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul A) {
        Lanabul.add(A); // add() di queue otomatis ngantri
        nbelm++;
    }

    public boolean isMember(Anabul A) {
        return Lanabul.contains(A); 
    }

    public Anabul getAnabul() {
        return Lanabul.peek(); //ngambil elemen paling awal
    }

    public void dequeueAnabul() {
        if (Lanabul.isEmpty()) {
            System.out.println("Belum punya piaraan");
            return;
        }
        
        // poll() mengambil dan mengeluarkan elemen pertama dari antrean
        Anabul temp = Lanabul.poll();
        System.out.println("Anabul dengan nama " + temp.getNama() + " dibuang");
        System.out.println();
        nbelm--;
    }

    public void showAnabul() {
        for (Anabul A : Lanabul) {
            System.out.println(A.getNama());
            System.out.println();
        }
    }

    public int countKucing() {
        int temp = 0;
        for (Anabul A : Lanabul) {
            if (A instanceof Kucing) {
                temp++;
            }
        }
        return temp;
    }

    public int bobotKucing() {
        int temp = 0; // Menggunakan double agar sinkron dengan atribut bobot Kucing
        for (Anabul A : Lanabul) {
            if (A instanceof Kucing) {
                temp += ((Kucing) A).getBobot();
            }
        }
        return temp;
    }

    public void showJenisAnabul() {
        for (Anabul A : Lanabul) {
            System.out.println(A.getNama());
            System.out.println(A.getClass().getName()); 
            System.out.println();
        }
    }
}