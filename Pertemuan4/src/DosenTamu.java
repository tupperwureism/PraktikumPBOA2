/*Nama File : Dosen Tamu.java */
/*Deskkripsi : membuat atribut dan method untuk class Dosen Tamu */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    //atribut
    private String NIDK;
    private int lama_kontrak;

    //method
    public DosenTamu(){
        NIDK = "";
        setJabatan("Dosen Tamu");
        lama_kontrak = 0;
    }

    public DosenTamu(String nip, String nama, LocalDate tanggal_lahir, LocalDate TMT, int gajipokok,  String fakultas, String NIDK, int lamakontrak){
        super(nip, nama, tanggal_lahir, TMT, gajipokok, "Dosen Tamu", fakultas);
        this.NIDK = NIDK;
        this.lama_kontrak = lamakontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public int getLamaKontrak(){
        return lama_kontrak;
    }

    public void setLamaKontrak(int lamakontrak){
        this.lama_kontrak = lamakontrak;
    }

    public void setJabatan(){
        super.setJabatan("Dosen Tamu");
    }

    public double getTunjangan(){
        return (0.025  * getGajiPokok());
    }

    public LocalDate getTanggalPensiun(){
        return getTMT().plusMonths(lama_kontrak).withDayOfMonth(1);
    }

    public int getMasaKerjaBulan(){
        return Period.between(getTMT(), LocalDate.now()).getMonths();
    }

    public int getMasaKerjaTahun(){
        return Period.between(getTMT(), LocalDate.now()).getYears();
    }
    
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Masa Kerja: " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Habis Kontrak: " + getTanggalPensiun());
        System.out.println("Tunjangan: " + getTunjangan());
    }

}
