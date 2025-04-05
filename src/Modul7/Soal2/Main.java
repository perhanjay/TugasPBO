//Buatlah program polimorfisme (polymorphism) sederhana yang dapat menampilkan
//jenis-jenis alat musik seperti : piano, biola, gitar, drum, saxophone, dan trumpet.
//Gunakanlah variabel dan method yang tepat, agar konsep polimorfisme dapat
//diterapkan dengan baik.

package Modul7.Soal2;

public class Main{
    public static void main(String[] args) {
        AlatMusik alatMusik = new AlatMusik();
        alatMusik.hasilkanBunyi();

        Piano piano = new Piano();
        piano.hasilkanBunyi();

        Biola biola = new Biola();
        biola.hasilkanBunyi();

        Gitar gitar = new Gitar();
        gitar.hasilkanBunyi();

        Drum drum = new Drum();
        drum.hasilkanBunyi();

        Saxophone saxophone = new Saxophone();
        saxophone.hasilkanBunyi();

        Trumpet trumpet = new Trumpet();
        trumpet.hasilkanBunyi();
    }
}