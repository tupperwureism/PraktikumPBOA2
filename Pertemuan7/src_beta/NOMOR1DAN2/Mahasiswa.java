package NOMOR1DAN2;

//a.
public class Mahasiswa {
    //atribut
    private String NIM;
    private String nama;
    private String ProgramStudi;
    //method
    public Mahasiswa(){
        NIM = "-999";
        nama = "n/a";
        ProgramStudi = "n/a";
    }
    public Mahasiswa(String NIM, String nama, String ProgramStudi){
        this.NIM = NIM;
        this.nama = nama;
        this.ProgramStudi = ProgramStudi;
    }
    public Mahasiswa(Mahasiswa m){
        this.NIM = m.getNIM();
        this.nama = m.getNama();
        this.ProgramStudi = m.getProgramStudi();
    }
    public String getNIM(){
        return this.NIM;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getProgramStudi(){
        return this.ProgramStudi;
    }
    public void setProgramStudi(){
        ProgramStudi = "";
    }
    public void setProgramStudi(String ProgramStudi){
        this.ProgramStudi = ProgramStudi;
    }
    public void setProgramStudi(Mahasiswa mhs1){
        this.ProgramStudi = mhs1.getProgramStudi();
    }
    public void printInfoMhs(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNIM());
        System.out.println("Program Studi: " + getProgramStudi());
    }
}
