public class Kucing extends Anabul{
    //atribut
    //method
    public Kucing(){
        super();
    }
    public Kucing(String nama){
        super.setNama(nama);
    }
    public void Gerak(){
        System.out.println("Kucing berjalan dan berlari dengan 4 kaki");
    }
    public void Bersuara(){
        System.out.println("Meong");
    }
    public void printInfoAnabul(){
        System.out.println("Hewan: Kucing");
        super.printInfoAnabul();
    }
}
