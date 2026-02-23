/*Nama File : Garis.java */
/*Deskkripsi : membuat atribut dan method dalam class garis */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 23 Februari 2026 
*/
public class Garis {
    /*atribut */
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    /*method */
    Garis(){
        this.akhir = new Titik(1, 1);
        this.awal = new Titik(0, 0); 
        counterGaris++;
    }

    Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    Titik getAwal(){
        return this.awal;
    }

    Titik getAkhir(){
        return this.akhir;
    }

    void setAwal(Titik awal){
        this.awal = awal;
    }

    void setAkhir(Titik akhir){
        this.akhir = akhir;
    }

    int getCounterGaris(){
        return counterGaris;
    }

    double panjangGaris(){
        return awal.getJarak(akhir); //seolah" awal ini titik aslinya, dan akhir itu titik parameter
    }

    double getGradien(){
        return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
    }

    Titik getTitikTengah(){
        Titik T2 = new Titik();
        T2.setAbsis((awal.getAbsis() + akhir.getAbsis()) / 2);
        T2.setOrdinat((awal.getOrdinat() + akhir.getOrdinat()) / 2);
        return T2;
    }

    boolean isSejajar(Garis G){
        return G.getGradien() == this.getGradien();
    }

    boolean isTegakLurus(Garis G){
        if((G.getGradien() == 1.0 && this.getGradien() == 0.0) || (this.getGradien() == 1.0 && G.getGradien() == 0.0)){
            return true;
        }
        return G.getGradien() * (this.getGradien()) == -1.0;
    }

    void printGaris(){
        //gabisa langsung + this.titk karena bukan tipe data primitif murni
        System.out.println("Titik awal = "); 
        this.awal.printTitik();
        System.out.println("Titik akhir = ");
        this.akhir.printTitik();
    }

    void persamaanGaris(){
        double c = (this.awal.getOrdinat() - (this.getGradien() * this.awal.getAbsis()));
        System.out.println("y = " + this.getGradien() + "x + " + c);
    }





}
