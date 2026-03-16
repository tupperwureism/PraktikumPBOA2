import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

public class MManusia {
    public static void main(String[] args) {
        // Data diinput sebagai String agar bisa diproses
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000.0, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000.0, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000.0, "wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), 10000000.0, "198004212010041002");

        p2.setAlamat("Jln. Panorama 111 Tembalang");

        
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        
        DecimalFormat df = new DecimalFormat("#");

        System.out.println("Pajak PNS p1 = " + df.format(p1.hitungPajak()));
        System.out.println("Pajak Pengusaha pe1 = " + df.format(pe1.hitungPajak()));
        System.out.println("Pajak Petani pt1 = " + df.format(pt1.hitungPajak()));
        
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja() + " tahun");

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}