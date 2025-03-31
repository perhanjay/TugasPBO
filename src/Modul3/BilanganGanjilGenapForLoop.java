//Buatlah program dengan menggunakan for-loop, while-loop, do-while loop untuk
//mencari :
//a. Bilangan prima antara 1-1000
//b. Bilangan ganjil dan genap antara 1-1000
package Modul3;

public class BilanganGanjilGenapForLoop {

    static void cariGanjil(){
        System.out.println("Bilangan ganjil antara 1 - 1000 Menggunakan For Loop: ");
        for(int i = 1; i <= 1000; i++){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }
    static void cariGenap(){
        System.out.println("\nBilangan genap antara 1 - 1000 Menggunakan For Loop: ");
        for(int i = 1; i <= 1000; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        cariGanjil();
        cariGenap();
    }
}
