/*Nama File : Manusia.java */
/*Deskkripsi : membuat atribut dan method dalam class abstract Manusia */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 16 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    //constructor
    private String nama;
    private String alamat;
    private double Pendapatan;
    private LocalDate tgl_mulai_kerja;
    private static int counterMns = 0;

    //method
    public Manusia(){
        nama = "";
        alamat = "";
        Pendapatan = 0.0;
        tgl_mulai_kerja = LocalDate.now();
        counterMns++;
    }

    public Manusia(String nama, String alamat, double Pendapatan, LocalDate tglkerja){
        this.nama = nama;
        this.alamat = alamat;
        this.Pendapatan = Pendapatan;
        this.tgl_mulai_kerja = tglkerja;
        counterMns++;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setPendapatan(double gaji){
        Pendapatan = gaji;
    }

    
    public double getPendapatan(){
        return Pendapatan;
    }

    public void setAlamat(String almt){
        alamat = almt;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setTanggalMulaiKerja(LocalDate tglkerja){
        tgl_mulai_kerja = tglkerja;
    }

    public LocalDate getTanggalMulaiKerja(){
        return tgl_mulai_kerja;
    } 

    public static int getCounterMns(){
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("nama: " + getNama());
        System.out.println("pendapatan: " + getPendapatan());
        System.out.println("alamat: " + getAlamat());
        System.out.println("tanggal mulai kerja:" + getTanggalMulaiKerja());
    }

    public abstract int hitungMasaKerja();

}
