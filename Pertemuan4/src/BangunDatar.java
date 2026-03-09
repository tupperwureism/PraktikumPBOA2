/*Nama File : BangunDatar.java */
/*Deskkripsi : membuat atribut dan method dalam class Bangun Datar */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 9 Maret 2026 
*/
public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
        warna = "";
        border = "";
        jmlSisi = 0;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        counterBangunDatar++;
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlsisi){
        this.jmlSisi = jmlsisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public void printCounterBangunDatar(){
        System.out.println("Jumlah bangun datar yang ada: " + counterBangunDatar);
    }
}
