package Modul7.Soal1;

public class LimasSegiEmpat extends BangunRuang {
    double panjangSisi;
    double tinggiLimas;

    public LimasSegiEmpat(String nama, double panjangSisi, double tinggiLimas) {
        super(nama);
        this.panjangSisi = panjangSisi;
        this.tinggiLimas = tinggiLimas;
    }

    double hitungVolume(){
        return ((panjangSisi*panjangSisi)*tinggiLimas)/3;
    }
}
