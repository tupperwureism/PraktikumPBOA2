public class OperatorGenerik<T> {
    private T isi;

    public OperatorGenerik(){
        isi = null;
    }
    public OperatorGenerik(T isi){
        this.isi = isi;
    }
    public <T> void tukar(T t1, T t2){
        System.out.println("sebelum tukar: arg1 = " + t1 + ", arg2 = " + t2);
        T temp;
        temp = t2;
        t2 = t1;
        t1 = temp;
        System.out.println("sebelum tukar: arg1 = " + t1 + ", arg2 = " + t2);
    }

    public <T extends Kucing, U extends Kucing> int Bobot2(T k1, U k2){
        return k1.getBobot() + k2.getBobot();
    }
}
