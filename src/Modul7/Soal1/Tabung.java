package Modul7.Soal1;

public class Tabung extends BangunRuang {
    double tinggi;
    double jariJari;

    public Tabung(String nama, double tinggi, double jariJari) {
        super(nama);
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }

    double hitungVolume(){
        return Math.PI*(jariJari*jariJari)*tinggi;
    }
}