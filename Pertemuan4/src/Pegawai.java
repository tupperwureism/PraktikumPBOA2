/*Nama File : Pegawai.java */
/*Deskkripsi : membuat atribut dan method untuk class Pegawai */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

// import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    //atribut
    private String NIP;
    private String nama;
    private LocalDate tanggal_lahir;
    private LocalDate TMT;
    private int gaji_pokok;
    private String jabatan;
    //masa kerja, tunjangan, tanggal pensiun/habis kontrak dianggap seprti keliling dan luas pada bangundatar; selalu ada tapi direalisasiakn di subclass nya
    
    //method
    public Pegawai(){
        NIP = "";
        nama = "";
        tanggal_lahir = LocalDate.now();
        TMT = LocalDate.now();
        gaji_pokok = 0;
        jabatan = "";
    }

    public Pegawai(String nip, String nama, LocalDate tanggal_lahir, LocalDate TMT, int gajipokok, String jabatan){
        this.NIP = nip;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.TMT = TMT;
        this.gaji_pokok = gajipokok;
        this.jabatan = jabatan;
    }

    public void setNIP(String nip){
        this.NIP = nip;
    }

    public String getNIP(){
        return this.NIP;
    }

    public String GetNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggallahir){
        this.tanggal_lahir = tanggallahir;
    }

    public LocalDate getTanggalLahir(){
        return this.tanggal_lahir;
    }

    public void setTMT(LocalDate tmt){
        this.TMT = tmt;
    }

    public LocalDate getTMT(){
        return this.TMT;
    }

    public int getGajiPokok(){
        return gaji_pokok;
    }

    public void setGajiPokok(int gajipokok){
        gaji_pokok = gajipokok;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggal_lahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + gaji_pokok);
        System.out.println("Jabatan: " + jabatan);
    }
}
