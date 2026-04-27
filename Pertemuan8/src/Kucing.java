public class Kucing extends Anabul{
    //atribut
    private int bobot;

    //method
    public Kucing(){
        bobot = 0;
        super();
    }
    public Kucing(String nama, int bobot){
        this.bobot = bobot;
        super.setNama(nama);
    }
    public void Gerak(){
        System.out.println("Kucing berjalan dan berlari dengan 4 kaki");
    }
    public void Bersuara(){
        System.out.println("Meong");
    }
    public void setBobot(int bobot){
        this.bobot = bobot;
    }
    public int getBobot(){
        return bobot;
    }
    public void printInfoAnabul(){
        System.out.println("Hewan: Kucing");
        super.printInfoAnabul();
        System.out.println("bobot: " + getBobot());
    }
}
