/*Nama File : Persegi.java */
/*Deskkripsi : membuat atribut dan method dalam class Persegi */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 16 Maret 2026 
*/

public class Persegi extends BangunDatar implements IResize {
    //atribut
    private double sisi;

    //method
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(int side){
        // setJmlSisi(4);
        // setWarna(warna);
        // setBorder(border);
        this.sisi = side;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }
    @Override
    public void printInfo(){ //ini aslinya punya superclass, tapi isinya bisa diubah sama anaknya
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * (percent / 100);
    }




}
