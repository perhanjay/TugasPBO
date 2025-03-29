//Buatlah program dengan menggunakan for-loop, while-loop, do-while loop untuk
//mencari :
//a. Bilangan prima antara 1-1000
//b. Bilangan ganjil dan genap antara 1-1000
package Modul3;
public class BilanganPrimaForLoop {
    public static void main(String[] args) {
        System.out.println("Bilangan prima antara 1 dan 1000 menggunakan For Loop:");

        for (int bilangan = 2; bilangan <= 1000; bilangan++) {
            boolean isPrima = true;
            for (int pembagi = 2; pembagi <= Math.sqrt(bilangan); pembagi++) {
                if (bilangan % pembagi == 0) {
                    isPrima = false;
                    break;
                }
            }

            if (isPrima) {
                System.out.println(bilangan);
            }
        }
    }
}