import java.util.ArrayList;

public class Seminar {
    //atribut
    private String namaSeminar;
    private ArrayList<CivitasAkademika> peserta;
    private int banyakPeserta;

    //method
    public Seminar(){
        namaSeminar = "n/a";
        peserta = new ArrayList<>();
        banyakPeserta = 0;
    }
    public Seminar(String namaSeminar){
        this.namaSeminar = namaSeminar;
        this.peserta = new ArrayList<>();
        this.banyakPeserta = 0;
    }
    public void setNamaSeminar(String namaSeminar){
        this.namaSeminar = namaSeminar;
    }
    public String getNamaSeminar(){
        return namaSeminar;
    }
    public void registrasi(CivitasAkademika pesertum){
        peserta.add(pesertum);
        banyakPeserta++;
    }
    public int countPeserta(){
        return banyakPeserta;
    }
    public void tampilPeserta(){
        System.out.println("Nama dan nomor peserta: ");
        for(int i = 0; i < peserta.size(); i++){
            System.out.println(peserta.get(i).getNama() + ", " + peserta.get(i).getNomor());
        }
    }

    public int countMahasiswa(){
        int temp = 0;
        for(int i = 0; i < peserta.size(); i++){
            if(peserta.get(i) instanceof Mahasiswa){ temp++;}
        }
        return temp;
    }
}
