public class Mahasiswa extends CivitasAkademika {
    //atribut
    private String NIM;
    private Dosen Dosenwali;
    //method
    public Mahasiswa(){
        super();
        NIM = "n/a";
        Dosenwali = new Dosen();
    }
    public Mahasiswa(String nama, String NIM, Dosen Dosenwali){
        super.setNama(nama);
        this.NIM = NIM;
        this.Dosenwali = Dosenwali;
    }
    public String getNomor(){
        return NIM;
    }
    public Dosen getWali(){
        return Dosenwali;
    }
    public void setWali(Dosen Dosenwali){
        this.Dosenwali = Dosenwali;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public String getNIM(){
        return NIM;
    }
    public Dosen getDosenWali(){
        return Dosenwali;
    }
    public void tampilDataMahasiswa(){
        System.out.println("Identitas Mahasiswa: ");
        super.printInfoCA();
        System.out.println("NIM : " + getNIM());
        System.out.println("Dosenwali: " + getDosenWali().getNama());
    }
}
