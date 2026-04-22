public abstract class CivitasAkademika {
    //atribut
    private String nama;
    //method
    public CivitasAkademika(){
        nama = "n/a";
    }
    public CivitasAkademika(String nama){
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public abstract String getNomor();
    public void printInfoCA(){
        System.out.println("Nama: " + getNama());
    }
}
