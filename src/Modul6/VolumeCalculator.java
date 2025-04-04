//Buatlah program abstraksi sederhana yang dapat menghitung :
//a. Volume balok
//b. Volume bola
package Modul6;
public class VolumeCalculator {
    public static void main(String[] args) {
        Balok rumahBalok = new Balok();
        rumahBalok.setPanjangSisiAAlas(10);
        rumahBalok.setPanjangSisiBAlas(10);
        rumahBalok.setTinggiBalok(20);
        System.out.println("Volume Balok dengan panjang alas 1: " + rumahBalok.getPanjangSisiAAlas() + ", panjang alas 2: " + rumahBalok.getPanjangSisiBAlas()  +" dan tinggi: " + rumahBalok.getTinggiBalok() + "\nadalah "  + rumahBalok.hitungVolume());

        Bola bolaBasket = new Bola();
        bolaBasket.setJariJari(10);
        System.out.println("Volume Bola dengan jari jari " + bolaBasket.getJariJari() + " adalah " + bolaBasket.hitungVolume());
        }
}