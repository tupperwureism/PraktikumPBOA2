public abstract class Anabul {
    //atribut
    private String nama;
    //method
    public Anabul(){
        nama = "n/a";
    }
    public Anabul(String nama){
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public abstract void Gerak();
    public abstract void Bersuara();
    public void printInfoAnabul(){
        System.out.println("Nama: " + getNama());
        System.out.println("Gerak:"); Gerak();
        System.out.println("Suara: "); Bersuara();
    }
}
