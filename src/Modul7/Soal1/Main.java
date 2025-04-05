//Buatlah program pewarisan (inheritance) sederhana. Buatlah sebuah kelas induk yang
//bernama bangun ruang, dimana kelas induk ini memiliki turunan beberapa kelas
//sederhana seperti : kubus, balok, tabung, kerucut, limas, prisma, dan bola.
//Gunakanlah variabel-variabel yang tepat, serta cari dan tampilkanlah nilai volume
//tujuh bangun ruang tersebut.
package Modul7.Soal1;

public class Main {
    public static void main(String[] args) {
        Kubus kubus = new Kubus("Kubus", 10);
        kubus.tampilkanVolume();

        Balok balok = new Balok("Balok", 10, 5, 10);
        balok.tampilkanVolume();

        Tabung tabung = new Tabung("Tabung", 20, 5);
        tabung.tampilkanVolume();

        Kerucut kerucut = new Kerucut("Kerucut", 20, 5);
        kerucut.tampilkanVolume();

        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat("Limas Segi Empat", 5, 20);
        limasSegiEmpat.tampilkanVolume();

        PrismaSegitiga prismaSegitiga = new PrismaSegitiga("Prisma Segitiga", 10, 5, 20);
        prismaSegitiga.tampilkanVolume();

        Bola bola = new Bola("Bola", 10);
        bola.tampilkanVolume();
    }
}












