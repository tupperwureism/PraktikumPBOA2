/*Nama File : Tendik.java */
/*Deskkripsi : membuat atribut dan method untuk class Tendik */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    //atribut
    private String Bidang;

    //method
    public Tendik(){
        Bidang = "";
        setJabatan("Tenaga Kependidikan");
    }

    public Tendik(String nip, String nama, LocalDate tanggal_lahir, LocalDate TMT, int gajipokok, String bidang){   
        super(nip, nama, tanggal_lahir, TMT, gajipokok, "Tenaga Kependidikan");
        this.Bidang = bidang;
    }

    public LocalDate getTanggalPensiun(){
        return getTanggalLahir().plusYears(55).plusMonths(1).withDayOfMonth(1);
    }

    public void setBidang(String bidang){
        this.Bidang = bidang;
    }

    public String getBidang(){
        return Bidang;
    }

    public double getTunjangan(){
        return (0.01 * getMasaKerjaTahun() * getGajiPokok());
    }

    public int getMasaKerjaTahun(){
        return Period.between(getTMT(), LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan(){
        return Period.between(getTMT(), LocalDate.now()).getMonths();
    }

    public void setJabatan(){
        super.setJabatan("Tenaga Kependidikan");
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang: " + Bidang);
        System.out.println("Masa Kerja: " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun());
        System.out.println("Tunjangan: " + getTunjangan());
    }


}
