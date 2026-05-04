/*
Nama : Shalom Kurniawan
NIM ; 24060124120033
Kelas : A
Tanggal : 4 Mei 2026
*/

public abstract class Anabul {
    //atribut
    private String nama;
    private String panggilan;

    //method
    public Anabul(){
        nama = "n/a";
        panggilan = nama;
    }
    public Anabul(String nama, String panggilan){
        this.nama = nama;
        panggilan = nama;
        this.panggilan = panggilan;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public String getPanggilan(){
        return panggilan;
    }
    public abstract void Gerak();
    public abstract void Bersuara();
    public void printInfoAnabul(){
        System.out.println("Nama: " + getNama());
        System.out.println("Gerak:"); Gerak();
        System.out.println("Suara: "); Bersuara();
    }
}
