//Buatlah program pewarisan (inheritance) sederhana. Buatlah sebuah kelas induk yang
//bernama bangun ruang, dimana kelas induk ini memiliki turunan beberapa kelas
//sederhana seperti : kubus, balok, tabung, kerucut, limas, prisma, dan bola.
//Gunakanlah variabel-variabel yang tepat, serta cari dan tampilkanlah nilai volume
//tujuh bangun ruang tersebut.
package Modul7;

public class ProgramBangunRuang {
    public static void main(String[] args) {
        Kubus kubus = new Kubus("Kubus", 10);
        kubus.panjangSisi = 5;
        kubus.tampilkanVolume();
    }
}

class BangunRuang {
    public BangunRuang(String nama) {
        this.nama = nama;
    }
    private String nama;
    double hitungVolume(){
        return 0;
    }

    void tampilkanVolume(){
        System.out.println("Volume bangun ruang "  +  + hitungVolume());
    }
}

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

class Balok extends BangunRuang {
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

class Tabung extends BangunRuang {
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

class Kerucut extends BangunRuang {
    double tinggi;
    double jariJari;

    public Kerucut(String nama, double tinggi, double jariJari) {
        super(nama);
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }

    double hitungVolume(){
        return (1/3)*Math.PI*(jariJari*jariJari)*tinggi;
    }
}

class LimasSegiEmpat extends BangunRuang {
    double panjangSisi;
    double tinggiLimas;

    public LimasSegiEmpat(String nama, double panjangSisi, double tinggiLimas) {
        super(nama);
        this.panjangSisi = panjangSisi;
        this.tinggiLimas = tinggiLimas;
    }

    double hitungVolume(){
        return (1/3)*(panjangSisi*panjangSisi)*tinggiLimas;
    }
}

class PrismaSegitiga extends BangunRuang {
    double panjangAlas;

    public PrismaSegitiga(String nama, double panjangAlas, double tinggiAlas, double tinggiPrisma) {
        super(nama);
        this.panjangAlas = panjangAlas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    double tinggiAlas;
    double tinggiPrisma;

    double hitungVolume(){
        return (1/2 * panjangAlas * tinggiAlas)*tinggiPrisma;
    }
}

class Bola extends BangunRuang {
    public Bola(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    double jariJari;

    double hitungVolume(){
        return 4/3*Math.PI*(jariJari*jariJari*jariJari);
    }
}
