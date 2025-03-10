//Buatlah program abstraksi sederhana yang dapat menghitung :
//a. Volume balok
//b. Volume bola
package Modul6;

abstract class BangunRuang{
    abstract double hitungVolume();
}

class Balok extends BangunRuang {
    private double panjangSisiAAlas;
    private double panjangSisiBAlas;
    private double tinggiBalok;

    public Balok(double panjangSisiAAlas, double panjangSisiBAlas, double tinggiBalok) {
        this.panjangSisiAAlas = panjangSisiAAlas;
        this.panjangSisiBAlas = panjangSisiBAlas;
        this.tinggiBalok = tinggiBalok;
    }

    public double getPanjangSisiAAlas() {
        return panjangSisiAAlas;
    }

    public void setPanjangSisiAAlas(double panjangSisiAAlas) {
        this.panjangSisiAAlas = panjangSisiAAlas;
    }

    public double getPanjangSisiBAlas() {
        return panjangSisiBAlas;
    }

    public void setPanjangSisiBAlas(double panjangSisiBAlas) {
        this.panjangSisiBAlas = panjangSisiBAlas;
    }

    public double getTinggiBalok() {
        return tinggiBalok;
    }

    public void setTinggiBalok(double tinggiBalok) {
        this.tinggiBalok = tinggiBalok;
    }

    double hitungVolume() {
        return panjangSisiAAlas * panjangSisiBAlas * tinggiBalok;
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungVolume() {
        return (4/3) * Math.PI * jariJari;
        }
    }

public class VolumeCalculator {
    public static void main(String[] args) {
        Balok rumahBalok = new Balok(1.5, 2.5, 3.0);
            System.out.println("Volume Rumah Balok: " + rumahBalok.hitungVolume());
        }
}

