/*Nama File : Mahasiswa.java */
/*Deskkripsi : membuat atribut dan method dalam class Mahasiswa */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 2 Maret 2026 
*/

import java.util.ArrayList;

public class Mahasiswa {
    /*atribut */
    private String nama;
    private String prodi;
    private String nim;
    ArrayList<MataKuliah> listMatkul;
    private Dosen DosenWali;
    private Kendaraan kendaraan;

    /*method */
    public Mahasiswa(){
        nama = "";
        prodi = "";
        nim = "";
        this.DosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        this.listMatkul = new ArrayList<>();
    }

    public String getnama(){
        return this.nama;
    }
    
    public String getprodi(){
        return this.prodi;
    }

    public String getnim(){
        return this.nim;
    }

    public Dosen getDosenWali(){
        return this.DosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public ArrayList<MataKuliah> getMataKuliah(){
        return listMatkul;
    }

    public void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    public Mahasiswa(String nama, String prodi, String nim){
        this.nama = nama;
        this.prodi = prodi;
        this.nim = nim;
    }

    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i = 0; i < listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Dosen Wali: " + DosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getjenis());
    }

    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public int getJumlahSKS(){
        int i, a = 0;
        for(i = 0; i < listMatkul.size(); i++){
            a += listMatkul.get(i).getSKS();
        }
        return a;
    }

}
