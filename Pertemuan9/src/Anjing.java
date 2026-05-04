/*
Nama : Shalom Kurniawan
NIM ; 24060124120033
Kelas : A
Tanggal : 4 Mei 2026
*/
public class Anjing extends Anabul{
    //atribut
    //method
    public Anjing(){
        super();
    }
    public Anjing(String nama){
        super(nama, nama);
        // super.setNama(nama);
    }
    public void Gerak(){
        System.out.println("Anjing berjalan dan berlari dengan 4 kaki");
    }
    public void Bersuara(){
        System.out.println("Guk-guk");
    }
    public void printInfoAnabul(){
        System.out.println("Hewan: Anjing");
        super.printInfoAnabul();
    }
}
