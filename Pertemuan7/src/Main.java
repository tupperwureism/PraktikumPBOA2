import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CivitasAkademika C2 = new Dosen("Suparji", "675747");
        Dosen D1 = (Dosen) C2;
        Dosen D2 = new Dosen("Ambazing", "099");
        CivitasAkademika C4 = new Mahasiswa("Ahmad Figaro", "24577764", D1);
        Mahasiswa M1 = (Mahasiswa) C4;
        Mahasiswa M2 = new Mahasiswa("Yuma Sukehiro", "578797", D2);
        Mahasiswa M3 = new Mahasiswa("Naruto Simanjuntak", "1122435", D1);
        Mahasiswa M4 = new Mahasiswa("Nicol Jefruy", "6665554", D2);
        Mahasiswa M5 = new Mahasiswa("Shalom Uzumaki", "417779", D2);
        // ArrayList<CivitasAkademika> daftarPeserta = new ArrayList<>();
        // daftarPeserta.add(M1);
        // daftarPeserta.add(D1);
        Seminar S1 = new Seminar("Cara menjadi Ultraman");
        S1.registrasi(M1);
        S1.registrasi(M2);
        S1.registrasi(M3);
        S1.registrasi(M4);
        S1.registrasi(M5);
        S1.registrasi(D1);
        S1.registrasi(D2);
        System.out.println("Jumlah Peserta: " + S1.countPeserta());
        S1.tampilPeserta();
        System.out.println("Jumlah Mahasiswa: " + S1.countMahasiswa());
        System.out.println("Nama dosen wali M5 sebelum memakai setWali(): " + M5.getWali().getNama());
        M5.setWali(D1);
        System.out.println("Nama dosen wali M5 sesudah memakai setWali(): " + M5.getWali().getNama());
        M4.tampilDataMahasiswa();
    }    
}
