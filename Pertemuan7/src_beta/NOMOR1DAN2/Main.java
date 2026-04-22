package NOMOR1DAN2;
public class Main{
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
        Mahasiswa M1 = new Mahasiswa("13243577","Zubadijul","Analisis dan Strategi Algae");
        //b.
        M1.printInfoMhs();
        M1.setNIM("67");
        M1.setNama("Dinobenjut");
        M1.setProgramStudi("Manajemen Basis Datang");
        M1.printInfoMhs();
        //d.
        Mahasiswa M2 = new Mahasiswa();
        M2.printInfoMhs();
        //e.
        Mahasiswa M3 = new Mahasiswa(M1);
        M3.printInfoMhs();
    }
}

