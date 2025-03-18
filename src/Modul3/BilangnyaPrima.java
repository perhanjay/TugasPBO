//Buatlah program dengan menggunakan for-loop, while-loop, do-while loop untuk
//mencari :
//a. Bilangan prima antara 1-1000
//b. Bilangan ganjil dan genap antara 1-1000
package Modul3;

public class BilangnyaPrima {
    public static void main(String[] args) {
        cariBilanganPrima();
    }


    static void cariBilanganPrima() {
        for (int num = 2; num <= 1000; num++){
            for (int i = 2; i  * i <= num; i++){
                if (num % i == 0) {
                    break;
                } else{
                    System.out.println(num);
                }
            }
        }
    }
}



