public class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data() {
        @SuppressWarnings("unchecked")
        //tidak bisa ruang = new T[100];
        T[] temp = (T[]) new Object[100]; //typecasting untuk mengatasi error karena Java tidak mengizinkan pembuatan array generik secara langsung
        ruang = temp;
        banyak = 0;
    }
    public Data(T[] isibaru){
        ruang = isibaru;
        banyak = isibaru.length;
    }
    public T getIsi(int indeks){
        return ruang[indeks - 1];
    }
    public void setIsi(int indeks, T isinya){
        ruang[indeks-1] = isinya;
        banyak++;
    }
    public int getSize(){
        return banyak;
    }
}
