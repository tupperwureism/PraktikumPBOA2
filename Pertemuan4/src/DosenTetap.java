/*Nama File : Dosen Tetap.java */
/*Deskkripsi : membuat atribut dan method untuk class Dosen Tetap */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    //atribut
    private String NIDN;

    //method
    public DosenTetap(){
        NIDN = "";
        setJabatan("Dosen Tetap");
    }

    public DosenTetap(String nip, String nama, LocalDate tanggal_lahir, LocalDate TMT, int gajipokok,  String fakultas, String NIDN){
        super(nip, nama, tanggal_lahir, TMT, gajipokok, "Dosen Tetap", fakultas);
        this.NIDN = NIDN;
    }

    public void setJabatan(){
        setJabatan("Dosen Tetap");
    }

    public void setNIDN(String nidn){
        NIDN = nidn;
    }

    public String getNIDN(){
        return NIDN;
    }

    public LocalDate getTanggalPensiun(){
        return getTanggalLahir().plusYears(65).plusMonths(1).withDayOfMonth(1);
    }

    public double getTunjangan(){
        return (0.02 * getMasaKerjaTahun() * getGajiPokok());
    }

    public int getMasaKerjaTahun(){
        return Period.between(getTMT(), LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan(){
       return Period.between(getTMT(), LocalDate.now()).getMonths();
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Masa Kerja: " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun());
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
