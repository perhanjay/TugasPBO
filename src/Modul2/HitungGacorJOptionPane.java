package Modul2;
//Dengan menggunakan 3 jenis cara membuat inputan (Scanner, BufferedReader,
//JoptionPane). Buatlah program sederhana yang memiliki inputan untuk menghitung :
//a. Keliling lingkaran
//b. Luas trapesium
//c. Luas prisma segitiga
import java.io.IOException;
import javax.swing.JOptionPane;

public class HitungGacorJOptionPane{
    public static void main(String[] args) throws IOException {
        LingkaranJOptionPane lingkaran = new LingkaranJOptionPane();
        lingkaran.HitungKeliling();
    }
}

class LingkaranJOptionPane{
    double range;

    public LingkaranJOptionPane() throws IOException {
        range = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan jari-jari Lingkaran", "Hitung Gacor", JOptionPane.PLAIN_MESSAGE));
    }

    void HitungKeliling(){
        double hasil = 2 * Math.PI * range;
        JOptionPane.showMessageDialog(null, hasil);
    }
}

class TrapesiumJOptionPane{
    double bottomBase;
    double upperBase;
    double height;


    public TrapesiumJOptionPane() throws IOException {
        bottomBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang alas", "Hitung Gacor", JOptionPane.PLAIN_MESSAGE));
        upperBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang alas", "Hitung Gacor", JOptionPane.PLAIN_MESSAGE));
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang alas", "Hitung Gacor", JOptionPane.PLAIN_MESSAGE));
    }

    void HitungLuas(){
        double hasil = 0.5 * (bottomBase + upperBase) * height;
        JOptionPane.showMessageDialog(null, hasil);
    }
}

class PrismaTegakSegitigaJOptionPane{
    double triangleBase;
    double triangleHeight;
    double height;

    public  PrismaTegakSegitigaJOptionPane() throws IOException {
        triangleBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang alas", "Hitung Gacor", JOptionPane.PLAIN_MESSAGE));
        triangleHeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang alas", "Hitung Gacor", JOptionPane.PLAIN_MESSAGE));
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang alas", "Hitung Gacor", JOptionPane.PLAIN_MESSAGE));
    }

    void HitungLuas(){
        double triangleArea = 0.5 * triangleBase * triangleHeight;
        double trianglePerimeter = Math.pow(0.5 * triangleBase, 2);
        double hasil = (2 * triangleArea) +  height;
        JOptionPane.showMessageDialog(null, hasil);
    }
}
