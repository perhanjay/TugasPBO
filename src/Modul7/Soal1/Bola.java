package Modul7.Soal1;

public class Bola extends BangunRuang {
    public Bola(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    double jariJari;

    double hitungVolume(){
        return (4*Math.PI*(jariJari*jariJari*jariJari))/3;
    }
}
