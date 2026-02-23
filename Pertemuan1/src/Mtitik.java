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
    }
}
