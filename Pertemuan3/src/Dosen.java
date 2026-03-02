/*Nama File : Dosen.java */
/*Deskkripsi : membuat atribut dan method dalam class Dosen */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 2 Maret 2026 
*/

public class Dosen {
    /*atribut */
    private String NIP;
    private String Nama;
    private String Prodi;

    /*method */
    public Dosen(){
        NIP = "";
        Nama = "";
        Prodi = "";
    }

    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi; 
    }

    public String getNIP(){
        return this.NIP;
    }

    public String getNama(){
        return this.Nama;
    }

    public String getProdi(){
        return this.Prodi;
    }

    public void setNIP(String nip){
        this.NIP = nip;
    }

    public void setNama(String nama){
        this.Nama = nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
}
