/*Nama File : Garis.java */
/*Deskkripsi : membuat atribut dan method dalam class garis */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 23 Februari 2026 
*/

public class Mgaris {
    public static void main(String[] args){
        Garis G1 = new Garis();
        Garis G0 = new Garis();
        Titik awal = new Titik(5, 6);
        Titik akhir = new Titik(6, 5);
        G1.setAwal(awal);
        G1.setAkhir(akhir);
        System.out.println("panjang garis = " + G1.panjangGaris());

        Titik T1 = new Titik(2, 5);
        Titik T2 = new Titik(6, 9);
        Garis G2 = new Garis(T1, T2);
        Titik T3 = G2.getTitikTengah();
        System.out.println("titik tengah garis G2 : ");
        T3.printTitik();
        

        System.out.println("gradien G0 = " + G0.getGradien());
        System.out.println("gradien G1 = " + G1.getGradien());
        System.out.println("gradien G2 = " + G2.getGradien());

        System.out.println("apakah sejajar = " + G0.isSejajar(G2)); //harusnya true
        System.out.println("apakah tegak lurus = " + G1.isTegakLurus(G2)); //harusnya true

        G2.printGaris();

        G1.persamaanGaris();

        System.out.println("banyak garis = " + G1.getCounterGaris());
    }
}
