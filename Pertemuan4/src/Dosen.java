/*Nama File : Dosen.java */
/*Deskkripsi : membuat atribut dan method untuk class Dosen */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
    //atribut
    private String fakultas;

    //method
    public Dosen(){
        fakultas = "";
    }

    public Dosen(String nip, String nama, LocalDate tanggal_lahir, LocalDate TMT, int gajipokok, String jabatan,  String fakultas){
        super(nip, nama, tanggal_lahir, TMT, gajipokok, jabatan);
        this.fakultas = fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
