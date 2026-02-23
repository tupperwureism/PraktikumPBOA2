/*Nama File : Titik.java */
/*Deskkripsi : membuat atribut dan method dalam class titik */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 23 Februari 2026 
*/

public class Mtitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); //membuat objek titik (0,0)
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1; //object reference, ini cuma meng-copy, makanya jumlah objek titik cuma 3 ngga 4
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3, 5);

        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik = " + T4.getCounterTitik()); //aslinya gaboleh karena getkonter punya class bukan objek

    }
}
