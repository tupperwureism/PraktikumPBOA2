public class Datum<T> {
    //atribut
    private T isi;
    //method
    public Datum(){
        isi = null;
    }
    public Datum(T isi){
        this.isi = isi;
    }
    public T getIsi(){
        return isi;
    }
    public void setIsi(T isibaru){
        isi = isibaru;
    }
}
