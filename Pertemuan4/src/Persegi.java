/*Nama File : Persegi.java */
/*Deskkripsi : membuat atribut dan method dalam class Persegi */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/

public class Persegi extends BangunDatar {
    //atribut
    private double sisi;

    //method
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(int side, String warna, String border){
        super(side, warna, border);
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

    public double getLuas(){
        return sisi * sisi;
    }

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
}
