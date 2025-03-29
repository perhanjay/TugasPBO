//Buatlah program dengan menggunakan for-loop, while-loop, do-while loop untuk
//mencari :
//a. Bilangan prima antara 1-1000
//b. Bilangan ganjil dan genap antara 1-1000
package Modul3;
public class BilangnyaPrima {
    public static void main(String[] args) {
        System.out.println("Bilangan prima antara 1 dan 1000:");

        for (int num = 2; num <= 1000; num++) {
            boolean isPrima = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrima = false;
                    break;
                }
            }

            if (isPrima) {
                System.out.println(num + " ");
            }
        }
    }
}