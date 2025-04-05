package Modul7.Soal1;

public class Balok extends BangunRuang {
    double panjangSisiAAlas;
    double panjangSisiBAlas;
    double tinggiBalok;

    public Balok(String nama, double panjangSisiAAlas, double panjangSisiBAlas, double tinggiBalok) {
        super(nama);
        this.panjangSisiAAlas = panjangSisiAAlas;
        this.panjangSisiBAlas = panjangSisiBAlas;
        this.tinggiBalok = tinggiBalok;
    }

    double hitungVolume(){
        return panjangSisiAAlas*panjangSisiBAlas*tinggiBalok;
    }
}