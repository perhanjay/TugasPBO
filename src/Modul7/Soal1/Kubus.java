package Modul7.Soal1;

class Kubus extends BangunRuang {
    double panjangSisi;

    public Kubus(String nama, double panjangSisi) {
        super(nama);
        this.panjangSisi = panjangSisi;
    }

    double hitungVolume(){
        return panjangSisi*panjangSisi*panjangSisi;
    }
}
