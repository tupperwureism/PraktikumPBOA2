/*Nama File : Pengusaha.java */
/*Deskkripsi : membuat atribut dan method dalam class Pengusaha */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 16 Maret 2026
*/


import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    //atribut
    private String NPWP;
    private static int counterPengusaha = 0;

    //method
    public Pengusaha(){
        NPWP = "";
        counterPengusaha++;
    }

    public Pengusaha(String Nama, LocalDate tglkerja, String alamat, double Pendapatan, String NPWP){
        super(Nama, alamat, Pendapatan, tglkerja);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    public void setNPWP(String npwp){
        NPWP = npwp;
    }

    public String getNPWP(){
        return NPWP;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * 0.15;
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTanggalMulaiKerja(), LocalDate.now()).getYears() + 3;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + NPWP);
    }

}
