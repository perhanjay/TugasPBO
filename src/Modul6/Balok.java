package Modul6;

class Balok extends BangunRuang {
    private double panjangSisiAAlas;
    private double panjangSisiBAlas;
    private double tinggiBalok;


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