public class Dosen extends CivitasAkademika {
    //atribut
    private String NIP;
    //method
    public Dosen(){
        super();
        NIP = "n/a";
    }
    public Dosen(String nama, String NIP){
        super.setNama(nama);
        this.NIP = NIP;
    }
    public String getNomor(){
        return NIP;
    }
    public String getNIP(){
        return NIP;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public void printInfoDosen(){
        System.out.println("Ini Dosen");
        super.printInfoCA();
        System.out.println("NIP: " + getNIP());
    }
}
