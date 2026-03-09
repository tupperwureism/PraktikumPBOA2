/*Nama File : MPegawai.java */
/*Deskkripsi : membuat main class untuk class Pegawai */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;

public class MPegawai {
    public static void main(String[] args) {
        // Contoh penggunaan class Pegawai
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setNIP("123456789");
        pegawai1.setNama("John Doe");
        pegawai1.setTanggalLahir(LocalDate.of(1990, 5, 15));
        pegawai1.setTMT(LocalDate.of(2020, 1, 1));
        pegawai1.setGajiPokok(5000000);
        pegawai1.setJabatan("Dosen");
        
        System.out.println("Informasi Pegawai:");
        pegawai1.printInfo();

        // Contoh penggunaan class Dosen Tetap
        DosenTetap dosenTetap1 = new DosenTetap("987654321", "Jane Smith", LocalDate.of(1985, 8, 20), LocalDate.of(2010, 2, 1), 7000000, "Fakultas Teknik", "534612345");
        System.out.println("\nInformasi Dosen Tetap:");
        dosenTetap1.printInfo();
        // Contoh penggunaan class Tenaga Kependidikan
        Tendik tendik1 = new Tendik("555555555", "Alice Johnson", LocalDate.of(1980, 3, 10), LocalDate.of(2005, 6, 1), 4000000, "Administrasi");
        System.out.println("\nInformasi Tenaga Kependidikan:");
        tendik1.printInfo();
        // Contoh penggunaan class Dosen Tamu
        DosenTamu dosenTamu1 = new DosenTamu("111111111", "Bob Wilson", LocalDate.of(1988, 12, 5), LocalDate.of(2020, 1, 1), 6000000, "Fakultas Ekonomi", "234598765", 24);
        System.out.println("\nInformasi Dosen Tamu:");
        dosenTamu1.printInfo();
        //contoh penggunaan class Dosen
        Dosen dosen1 = new Dosen("222222222", "Charlie Brown", LocalDate.of(1982, 7, 25), LocalDate.of(2015, 3, 1), 6500000, "Dosen", "Fakultas Hukum");
        System.out.println("\nInformasi Dosen:");
        dosen1.printInfo();
    }
}
