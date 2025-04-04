package Modul6;

class Bola extends BangunRuang {
    private double jariJari;

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
