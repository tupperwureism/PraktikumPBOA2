/*Nama File : Kendaraan.java */
/*Deskkripsi : membuat atribut dan method dalam class Kendaraan */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 2 Maret 2026 
*/

public class Kendaraan {
    /*atribut */
    private String noPlat;
    private String jenis; //antara motor atau mobil saja

    /*method */
    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noplat, String jenis){
        this.noPlat = noplat;
        this.jenis = jenis;
    }

    public String getnoPlat(){
        return this.noPlat;
    }

    public String getjenis(){
        return this.jenis;
    }

    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }
}


