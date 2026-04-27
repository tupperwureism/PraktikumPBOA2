// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*1*/
        //a.
        int k = 65;
        char c = (char) k;
        double d = (double) k;
        String z = Integer.toString(k);
        System.out.println(c);
        System.out.println(d);
        System.out.println(z);
        //b.
        int t = (int) d;
        System.out.println(t);
        //c.
        String X = "1234"; String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println(S);
        System.out.println(Z);
        //d.
        String P = "12.34"; String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println(R);
        System.out.println(D);
        //e.
        int A = Integer.parseInt(S);
        System.out.println(A);
        //f.
        String T = Integer.toString(A);
        System.out.println(T);
        /*2*/
        //c.
        Mahasiswaa m1 = new Mahasiswaa("13243577","Zubadijul","Analisis dan Strategi Algae");
        //b.
        m1.printInfoMhs();
        m1.setNIM("67");
        m1.setNama("Dinobenjut");
        m1.setProgramStudi("Manajemen Basis Datang");
        m1.printInfoMhs();
        //d.
        Mahasiswaa m2 = new Mahasiswaa();
        m2.printInfoMhs();
        //e.
        Mahasiswaa m3 = new Mahasiswaa(m1);
        m3.printInfoMhs();
        System.out.println("/*--------------------------------------------------------------------------------------------------- */");
/*--------------------------------------------------------------------------------------------------- */
        //3.
        Anabul A1 = new Kucing("Yudi", 9);
        Kucing K1 = (Kucing) A1;
        Anabul A2 = new Anjing("Alan");
        Anjing An1 = (Anjing) A2;
        Burung B1 = new Burung("Yanto");
        K1.printInfoAnabul();
        An1.printInfoAnabul();
        B1.printInfoAnabul();
/*--------------------------------------------------------------------------------------------------- */
        System.out.println("/*--------------------------------------------------------------------------------------------------- */");
        //4.
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
/*------------------------------------------------------------------------------------------------------ */
        System.out.println("-------------------------------------------------------------------------");
        Datum<Anabul> datumAnabul = new Datum<>();

        Kucing oyen = new Kucing("oyen", 14);
        datumAnabul.setIsi(oyen);

        Anabul isiSaatIni = datumAnabul.getIsi();
        System.out.println("Suara dari objek anabul " + isiSaatIni.getNama() + " : ");
        isiSaatIni.Bersuara();

        Anjing pingping = new Anjing("PingPing");
        datumAnabul.setIsi(pingping);

        isiSaatIni = datumAnabul.getIsi();
        System.out.println("Suara dari objek anabul " + isiSaatIni.getNama() + " : ");
        isiSaatIni.Bersuara();

System.out.println("-------------------------------------------------------------------------");
        OperatorGenerik op = new OperatorGenerik();

        //tukar integer
        Integer a = 1;
        Integer b = 2;
        op.tukar(a, b);

        //tukar string
        String ng1 = "Abi"; String ng2 = "Iba";
        op.tukar(ng1, ng2);

        Anabul krose = new Anjing("Juti");
        Anabul krise = new Kucing("Likumahuwi", 18);
        Anabul kruse = new Kucing("Panduwidodo", 12);
        op.tukar(krose, krise);

        System.out.println("Bobot dari kucing " + krise.getNama() + " dan kucing " + kruse.getNama() + " adalah: "
        + op.Bobot2((Kucing)kruse, (Kucing)krise));

System.out.println("-------------------------------------------------------------------------");
        Data<Anabul> DataAnabul = new Data<>();

        Anabul bul1 = new Anjing("King");
        Anabul bul2 = new Kucing("Von", 19);
        Anabul bul3 = new Burung("Kicaumania");

        DataAnabul.setIsi(1, bul1);
        DataAnabul.setIsi(10, bul2);
        DataAnabul.setIsi(100, bul3);

        System.out.println("Isi di indeks 1: " + DataAnabul.getIsi(1).getNama());
        System.out.println("Isi di indeks 10: " + DataAnabul.getIsi(10).getNama());
        System.out.println("Isi di indeks 10: " + DataAnabul.getIsi(100).getNama());
        try {
            System.out.println("Isi di indeks 1000: " + DataAnabul.getIsi(11).getNama());
        } catch (Exception e) {
            System.out.println("Error: disini belum ada isinya");
        }
        System.out.println("Ukuran efektif elemen di array: " + DataAnabul.getSize());
    }
}
