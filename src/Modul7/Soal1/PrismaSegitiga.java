package Modul7.Soal1;

public class PrismaSegitiga extends BangunRuang {
    double panjangAlas;
    double tinggiAlas;
    double tinggiPrisma;

    public PrismaSegitiga(String nama, double panjangAlas, double tinggiAlas, double tinggiPrisma) {
        super(nama);
        this.panjangAlas = panjangAlas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    double hitungVolume(){
        return (panjangAlas * tinggiAlas*tinggiPrisma)/2;
    }
}
