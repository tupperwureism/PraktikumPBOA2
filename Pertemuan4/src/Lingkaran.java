/*Nama File : Lingkaran.java */
/*Deskkripsi : membuat atribut dan method dalam class Lingkaran */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

public class Lingkaran extends BangunDatar {
    //atribut
    private double jariJari;

    //method
    public Lingkaran(){
        setJmlSisi(0);
        jariJari = 0;
    }

    public Lingkaran(double jariJari, String warna, String border){
        super(0, warna, border); //jangan letakkan di bawah karena akan menimpa nilai yang sudah di set di constructor BangunDatar
        // super.setWarna(warna);
        // super.setBorder(border);
        // super.setJmlSisi(0);
        this.jariJari = jariJari;
    }

    public double getJariJari(){
        return jariJari;
    }

    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }

    public double getLuas(){
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void printInfo(){
        // super.printInfo();
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + jariJari);
    }
}
