package Modul2;
//Dengan menggunakan 3 jenis cara membuat inputan (Scanner, BufferedReader,
//JoptionPane). Buatlah program sederhana yang memiliki inputan untuk menghitung :
//a. Keliling lingkaran
//b. Luas trapesium
//c. Luas prisma segitiga
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HitungGacorBuffered{
  public static void main(String[] args) throws IOException {
    LingkaranBuffered lingkaran = new LingkaranBuffered();
    System.out.println(lingkaran.HitungKeliling());
  }
}

class LingkaranBuffered {
  double range;

  public LingkaranBuffered() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.printf("Masukkan jari-jari lingkaran: ");
    range =Double.parseDouble(br.readLine());
  }

  double HitungKeliling(){
    return 2 * Math.PI * range;
  }
}

class TrapesiumBuffered{
  double bottomBase;
  double upperBase;
  double height;


  public TrapesiumBuffered() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.printf("Masukkan panjang alas: ");
    bottomBase = Double.parseDouble(br.readLine());

    System.out.printf("Masukkan panjang sisi atas: ");
    upperBase = Double.parseDouble(br.readLine());

    System.out.printf("Masukkan panjang tinggi: ");
    height = Double.parseDouble(br.readLine());
  }

  double HitungLuas(){
    return 0.5 * (bottomBase + upperBase) * height;
  }
}

class PrismaTegakSegitigaBuffered{
  double triangleBase;
  double triangleHeight;
  double height;

  public  PrismaTegakSegitigaBuffered() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.printf("Masukkan alas segitiga: ");
    triangleBase = Double.parseDouble(br.readLine());

    System.out.printf("Masukkan tinggi segitiga: ");
    triangleHeight = Double.parseDouble(br.readLine());

    System.out.printf("Masukkan tinggi prisma: ");
    height = Double.parseDouble(br.readLine());
  }

  double HitungLuas(){
    double triangleArea = 0.5 * triangleBase * triangleHeight;
    double trianglePerimeter = Math.pow(0.5 * triangleBase, 2);
    return (2 * triangleArea) +  height;
  }
}
