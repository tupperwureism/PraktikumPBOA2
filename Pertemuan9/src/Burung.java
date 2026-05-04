/*
Nama : Shalom Kurniawan
NIM ; 24060124120033
Kelas : A
Tanggal : 4 Mei 2026
*/
public class Burung extends Anabul{
    //atribut
    //method
    public Burung(){
        super();
    }
    public Burung(String nama){
        super(nama, nama);
    }
    public void Gerak(){
        System.out.println("Burung terbang dengan dua sayap");
    }
    public void Bersuara(){
        System.out.println("Cicuit");
    }
    public void printInfoAnabul(){
        System.out.println("Hewan: Burung");
        super.printInfoAnabul();
    }
}
