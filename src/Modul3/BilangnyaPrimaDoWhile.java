package Modul3;
public class BilangnyaPrimaDoWhile {
    public static void main(String[] args) {
        int bilangan = 2;
        System.out.println("Bilangan prima 1 - 1000 dengan menggunakan Do While");
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
                System.out.println(bilangan);
            }

            bilangan++;
        } while (bilangan <= 1000);
    }
}
