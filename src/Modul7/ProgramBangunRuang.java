//Buatlah program pewarisan (inheritance) sederhana. Buatlah sebuah kelas induk yang
//bernama bangun ruang, dimana kelas induk ini memiliki turunan beberapa kelas
//sederhana seperti : kubus, balok, tabung, kerucut, limas, prisma, dan bola.
//Gunakanlah variabel-variabel yang tepat, serta cari dan tampilkanlah nilai volume
//tujuh bangun ruang tersebut.
package Modul7;

public class ProgramBangunRuang {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.panjangSisi = 5;
        kubus.tampilkanVolume();
    }
}

class BangunRuang {

    double hitungVolume(){
        return 0;
    }

    void tampilkanVolume(){
        System.out.println("Volume bangun ruang: " + hitungVolume());
    }
}

class Kubus extends BangunRuang {
    double panjangSisi;

    double hitungVolume(){
        return panjangSisi*panjangSisi*panjangSisi;
    }
}
class Balok extends BangunRuang {
    double panjangSisiAAlas;
    double panjangSisiBAlas;
    double tinggaBalok;

    double hitungVolume(){
        return panjangSisiAAlas*panjangSisiBAlas*tinggaBalok;
    }
}
class Tabung extends BangunRuang {
    double tinggi;
    double jariJari;

    double hitungVolume(){
        return Math.PI*(jariJari*jariJari)*tinggi;
    }
}
class Kerucut extends BangunRuang {
    double tinggi;
    double jariJari;

    double hitungVolume(){
        return (1/3)*Math.PI*(jariJari*jariJari)*tinggi;
    }
}

class LimasSegiEmpat extends BangunRuang {
    double panjangSisi;
    double tinggiLimas;

    double hitungVolume(){
        return (1/3)*(panjangSisi*panjangSisi)*tinggiLimas;
    }
}

class PrismaSegitiga extends BangunRuang {
    double panjangAlas;
    double tinggiAlas;
    double tinggiPrisma;

    double hitungVolume(){
        return (1/2 * panjangAlas * tinggiAlas)*tinggiPrisma;
    }
}

class Bola extends BangunRuang {
    double jariJari;

    double hitungVolume(){
        return 4/3*Math.PI*(jariJari*jariJari*jariJari);
    }
}
