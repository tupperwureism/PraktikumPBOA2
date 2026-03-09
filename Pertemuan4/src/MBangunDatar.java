/*Nama File : MBangunDatar.java */
/*Deskkripsi : membuat main class untuk class BangunDatar */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

public class MBangunDatar {
    public static void main(String[] args) {
        // Contoh penggunaan class BangunDatar
        BangunDatar bangundatar1 = new BangunDatar();
        bangundatar1.setJmlSisi(3);
        bangundatar1.setWarna("Merah");
        bangundatar1.setBorder("Solid");
        System.out.println("Informasi Bangun Datar:");
        bangundatar1.printInfo();
        
        //Contoh penggunaan persegi
        Persegi persegi1 = new Persegi(4, "Kuning", "Hitam");
        System.out.println("Informasi Persegi:");
        persegi1.printInfo();
        System.out.println("sisi: " + persegi1.getSisi());
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        System.out.println("Diagonal: " + persegi1.getDiagonal());

        //Contoh penggunaan Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(7, "Biru", "Dashed");
        System.out.println("Informasi Lingkaran:");
        System.out.println("jari jari; " + lingkaran1.getJariJari());
        lingkaran1.printInfo();
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());

        bangundatar1.printCounterBangunDatar();
    }
}
