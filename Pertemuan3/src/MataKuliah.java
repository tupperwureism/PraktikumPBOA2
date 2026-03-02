/*Nama File : Matakuliah.java */
/*Deskkripsi : membuat atribut dan method dalam class MataKuliah */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 2 Maret 2026 
*/

public class MataKuliah {
    /*Atribut */
    private int SKS;
    private String idMatkul;
    private String nama;

    /*method */
    public MataKuliah(){
        SKS = 0;
        idMatkul = "";
        nama = "";
    }

    public MataKuliah(String idMatkul, int SKS, String nama){
        this.idMatkul = idMatkul;
        this.SKS = SKS;
        this.nama = nama;
    }

    public int getSKS(){
        return this.SKS;
    }

    public String getidMatkul(){
        return this.idMatkul;
    }

    public String getNama(){
        return this.nama;
    }

    public void setSKS(int sks){
        this.SKS = sks;
    }

    public void setidMatkul(String idmatkul){
        this.idMatkul = idmatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}
