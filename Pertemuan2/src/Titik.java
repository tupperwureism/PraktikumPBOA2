/*Nama File : Titik.java */
/*Deskkripsi : membuat atribut dan method dalam class titik */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 23 Februari 2026 
*/

public class Titik {
    /*ATRIBUT */
    double ordinat;
    double absis;
    static int counterTitik = 0;

    /*METHOD */
    /*konstruktor titik (0,0) */
    Titik(){
        this(0, 0);
        counterTitik++;
    }

    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }
    
    //mengembalikan nilai counter titik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset titik absis dengan nilai baru x
    double setAbsis(double x){
        return absis = x;
    }

    //mengembalikan titik ordinat dengan nila baru y
    double setOrdinat(double y){
        return ordinat = y;
    }

    //mengeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        } 
        else if (absis < 0 && ordinat < 0){
            return 3;
        } 
        else{
            return 4;
        }
    }

    int getJarakPusat(){
        double jarak = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        // System.out.println("Jarak titik (" + absis + "," + ordinat + ") ke pusat (0,0) adalah " + jarak);
        return (int) jarak;
    }

    int Jarak(Titik T){
        double jarak = Math.sqrt(Math.pow((absis - T.absis), 2) + Math.pow((ordinat - T.ordinat), 2));
        // System.out.println("Jarak antara titik (" + absis + "," + ordinat + ") dan titik (" + T.absis + "," + T.ordinat + ") adalah " + jarak);
        return (int) jarak;
    }

    void refleksiX(){
        this.ordinat = -this.ordinat;
    }
    
    void refleksiY(){
        this.absis = -this.absis;
    }

    Titik getRefleksiX(){
        Titik T2 = new Titik(this.absis, -this.ordinat);
        return T2;
    }

    Titik getRefleksiY(){
        Titik T2 = new Titik(-this.absis, this.ordinat);
        return T2;
    }
    
    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik); //ini gaboleh, karena this itu merujuk ke objek, padahal ini countertitik itu punya class
    }
} //end class titik
