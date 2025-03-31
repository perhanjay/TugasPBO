package Modul3;
public class BilanganPrimaDoWhile {
    public static void main(String[] args) {
        System.out.println("Bilangan prima 1 - 1000 dengan menggunakan Do While");
        int bilangan = 2;
        do {
            boolean isPrima = true;
            int pembagi = 2;

            do {
                if (bilangan % pembagi == 0) {
                    isPrima = false;
                }
                pembagi++;
            } while (isPrima && pembagi <= Math.sqrt(bilangan));

            if (isPrima) {
                System.out.print(bilangan + " ");
            }

            bilangan++;
        } while (bilangan <= 1000);
    }
}
