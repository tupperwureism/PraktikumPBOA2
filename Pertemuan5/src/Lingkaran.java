/*Nama File : Lingkaran.java */
/*Deskkripsi : membuat atribut dan method dalam class Lingkaran */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 16 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize {
    //atribut
    private double jariJari;

    //method
    public Lingkaran(){
        setJmlSisi(0);
        jariJari = 0;
    }

    public Lingkaran(double jariJari){
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

    @Override
    public double getLuas(){
        return Math.PI * jariJari * jariJari;
    }

    @Override
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

    @Override
    public void zoomIn(){
        jariJari = jariJari * 1.1;
    }

    @Override
    public void zoomOut(){
        jariJari = jariJari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jariJari = jariJari * (percent / 100);
    }


}
