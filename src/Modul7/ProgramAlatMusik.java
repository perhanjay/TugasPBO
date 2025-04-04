//Buatlah program polimorfisme (polymorphism) sederhana yang dapat menampilkan
//jenis-jenis alat musik seperti : piano, biola, gitar, drum, saxophone, dan trumpet.
//Gunakanlah variabel dan method yang tepat, agar konsep polimorfisme dapat
//diterapkan dengan baik.

package Modul7;

public class ProgramAlatMusik {
    public static void main(String[] args) {
    }
}

class AlatMusik {
    String namaAlat;

    void hasilkanBunyi(){
        System.out.println("Sebuah alat musik pasti dapat menghasilkan bunyi");
    }
}

class Piano extends AlatMusik{
    void hasilkanBunyi(){
        System.out.println("Piano Menghasilkan ting-ting");
    }
}

class Biola extends AlatMusik{
    void hasilkanBunyi(){
        System.out.println("Biola Menghasilkan skreek");
    }
}

class Gitar extends AlatMusik{
    void hasilkanBunyi(){
        System.out.println("Gitar Menghasilkan bunyi tik - tik - tik");
    }
}

class Drum extends AlatMusik{
    void hasilkanBunyi(){
        System.out.println("Drum Menghasilkan bum bum bum");
    }
}
class Saxophone extends AlatMusik{
    void hasilkanBunyi(){
        System.out.println("Saxophone Menghasilkan pfeet pfeet pfet");
    }
}
class trumpet extends AlatMusik{
    void hasilkanBunyi() {
        System.out.println("trumpet Menghasilkan bunyi pweeeet pweeet");
    }
}
