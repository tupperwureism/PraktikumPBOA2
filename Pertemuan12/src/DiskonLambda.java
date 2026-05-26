/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author chloud
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}
