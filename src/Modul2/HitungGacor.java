package Modul2;
//Dengan menggunakan 3 jenis cara membuat inputan (Scanner, BufferedReader,
//JoptionPane). Buatlah program sederhana yang memiliki inputan untuk menghitung :
//a. Keliling lingkaran
//b. Luas trapesium
//c. Luas prisma segitiga
import java.util.Scanner;

public class HitungGacor{
  public static void main(String[] args) {
    Lingkaran lingkaran = new Lingkaran();
    System.out.println(lingkaran.HitungKeliling());
  }
}

class Lingkaran {
  double range;

  public Lingkaran(){
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Masukkan jari-jari lingkaran: ");
    range = scanner.nextDouble();
  }

  double HitungKeliling(){
    return 2 * Math.PI * range;
  }
}

class Trapesium{
  double bottomBase;
  double upperBase;
  double height;


  public Trapesium(){
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Masukkan panjang alas: ");
    bottomBase = scanner.nextDouble();

    System.out.printf("Masukkan panjang sisi atas: ");
    upperBase = scanner.nextDouble();

    System.out.printf("Masukkan panjang tinggi: ");
    height = scanner.nextDouble();
  }

  double HitungLuas(){
    return 0.5 * (bottomBase + upperBase) * height;
  }
}

class PrismaTegakSegitiga{
  double triangleBase;
  double triangleHeight;
  double height;


  public  PrismaTegakSegitiga(){
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Masukkan alas segitiga: ");
    triangleBase= scanner.nextDouble();

    System.out.printf("Masukkan tinggi segitiga: ");
    triangleHeight = scanner.nextDouble();

    System.out.printf("Masukkan tinggi prisma: ");
    height = scanner.nextDouble();
  }

  double HitungLuas(){
    double triangleArea = 0.5 * triangleBase * triangleHeight;
    double trianglePerimeter = Math.pow(0.5 * triangleBase, 2);
    return (2 * triangleArea) +  height;
  }
}
