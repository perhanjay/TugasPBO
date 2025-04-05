package Modul7.Soal1;

public class Kerucut extends BangunRuang {
    double tinggi;
    double jariJari;

    public Kerucut(String nama, double tinggi, double jariJari) {
        super(nama);
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }

    double hitungVolume(){
        return (Math.PI*(jariJari*jariJari)*tinggi)/3;
    }

    public static void main(String[] args) {
        Kerucut kerucut = new Kerucut("Krucut", 20, 5);
        System.out.println(kerucut.hitungVolume());
    }
}