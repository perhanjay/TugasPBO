package Modul3;
public class Playground {
    public static void main(String[] args) {
        System.out.println("Bilangan prima antara 1 - 100:");
        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Fungsi untuk mengecek apakah suatu bilangan adalah prima
    public static boolean isPrime(int num) {
        if (num < 2) return false; // 0 dan 1 bukan bilangan prima
        for (int i = 2; i * i <= num; i++) { // Mengecek faktor dari 2 hingga akar num
            if (num % i == 0) {
                return false; // Jika habis dibagi i, bukan prima
            }
        }
        return true;
    }
}
