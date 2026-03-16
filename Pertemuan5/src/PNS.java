/*Nama File : Manusia.java */
/*Deskkripsi : membuat atribut dan method dalam class PNS */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 16 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    //atribut
    private String NIP;
    private static int counterPNS = 0;

    //method
    public PNS(){
        NIP = "";
        counterPNS++;
    }

    public PNS(String Nama, LocalDate tglkerja, double Pendapatan, String NIP){
        super(Nama, "", Pendapatan, tglkerja);
        this.NIP = NIP;
        counterPNS++;
    }

    public PNS(String Nama, LocalDate tglkerja, String alamat, double Pendapatan, String NIP){
        super(Nama, alamat, Pendapatan, tglkerja);
        this.NIP = NIP;
        counterPNS++;
    }

    public void setNIP(String nip){
        NIP = nip;
    }

    public String getNIP(){
        return NIP;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTanggalMulaiKerja(), LocalDate.now()).getYears() + 3;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * 0.1;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + NIP);
    }

}
