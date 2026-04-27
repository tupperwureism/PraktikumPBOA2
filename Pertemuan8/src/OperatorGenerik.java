public class OperatorGenerik<T> {
    private T isi;

    public OperatorGenerik(){
        isi = null;
    }
    public OperatorGenerik(T isi){
        this.isi = isi;
    }
    public static <T> void tukar(Datum<T> t1, Datum<T> t2){
        System.out.println("sebelum tukar: arg1 = " + t1.getIsi() + ", arg2 = " + t2.getIsi());
        T temp = t1.getIsi();
        t1.setIsi(t2.getIsi());
        t2.setIsi(temp);
        System.out.println("sesudah tukar: arg1 = " + t1.getIsi() + ", arg2 = " + t2.getIsi());
    }

    public <T extends Kucing, U extends Kucing> int Bobot2(T k1, U k2){
        return k1.getBobot() + k2.getBobot();
    }
}
