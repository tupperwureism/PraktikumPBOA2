/*Nama File : MBangunDatar.java */
/*Deskkripsi : membuat main class dari BangunDatar */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 16 Maret 2026 
*/

public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar() ; error ini, karena BangunDatar adalah abstract class, jadi tidak bisa diinstansiasi langsung
        BangunDatar B2 = new Persegi(10); // Example: Persegi with side 6
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        B2.printInfo();
        System.out.println("Luas Persegi: " + B2.getLuas());
        System.out.println("Keliling Persegi: " + B2.getKeliling());
        P2.printInfo();
        System.out.println("Luas Persegi: " + P2.getLuas());
        System.out.println("Keliling Persegi: " + P2.getKeliling());
        System.out.println("Diagonal Persegi: " + P2.getDiagonal());
        L1.printInfo();
        System.out.println("Luas Lingkaran: " + L1.getLuas());
        System.out.println("Keliling Lingkaran: " + L1.getKeliling());
        L2.printInfo();
        System.out.println("Luas Lingkaran: " + L2.getLuas());
        System.out.println("Keliling lingkaran: " + L2.getKeliling());

        System.out.println("Apakah keliling B2 dan L2 sama: " + B2.isEqualKeliling(L2));
        System.out.println("Apakah luas B2 dan L2 sama: " + B2.isEqualLuas(L2));
        System.out.println("Apakah keliling P2 dan L1 sama: " + P2.isEqualKeliling(L1));
        System.out.println("Apakah luas P2 dan L1 sama: " + P2.isEqualLuas(L1));

        System.out.println("Zoom in Persegi P2");
        P2.zoomIn();
        P2.printInfo();

        System.out.println("Zoom out persegi P2");
        P2.zoomOut();
        P2.printInfo();

        System.out.println("Zoom persegi P2 sebanyak 150%");
        P2.zoom(150);
        P2.printInfo();

        System.out.println("Zoom in lingkaran L2"); //NOTE: janga pake L1, karena dasarnya dia dari bangunDatar, dimana kita ga impelemts IResize
        L2.zoomIn();
        L2.printInfo();
        System.out.println("Zoom out lingkaran L2");
        L2.zoomOut();
        L2.printInfo();
        System.out.println("Zoom lingkaran L2 sebanyak 50%");
        L2.zoom(50);
        L2.printInfo();
    }
}
