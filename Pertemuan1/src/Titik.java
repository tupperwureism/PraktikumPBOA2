/*Nama File : Titik.java */
/*Deskkripsi : membuat atribut dan method dalam class titik */
/*Pembuat : Shalom Kurniawan */
/*Tanggal : 20 Februari 2026 
*/

public class Titik {
    /*ATRIBUT */
    double ordinat;
    double absis;

    /*METHOD */
    /*konstruktor titik (0,0) */
    Titik(){
        absis = 0;
        ordinat = 0;
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
        ordinat = ordinat + x;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} //end class titik
