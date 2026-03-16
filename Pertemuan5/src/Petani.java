/*Nama File : Petani.java */
/*Deskkripsi : membuat atribut dan method dalam class Petani */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 16 Maret 2026
*/


import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    //atribut
    private String asal_kota;
    private static int counterPetani = 0;

    //method 
    public Petani(){
        asal_kota = "";
        counterPetani++;
    }

    public Petani(String Nama, LocalDate tglkerja, String alamat, double Pendapatan, String asal_kota){
        super(Nama, alamat, Pendapatan, tglkerja);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public double hitungPajak(){
        return 0.0;
    }
    
    @Override
    public int hitungMasaKerja(){
        return Period.between(getTanggalMulaiKerja(), LocalDate.now()).getYears() + 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}
