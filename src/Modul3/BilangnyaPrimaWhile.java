package Modul3;
public class BilangnyaPrimaWhile {
    public static void main(String[] args) {
        System.out.println("Bilangan prima antara 1 dan 1000:");
        int bilangan = 2;

        while (bilangan <= 1000) {
            boolean isPrima = true;

            int pembagi = 2;
            while (pembagi <= Math.sqrt(bilangan)) {
                if (bilangan % pembagi == 0) {
                    isPrima = false;
                    break;
                }
                pembagi++;
            }
            if (isPrima) {
                System.out.print(bilangan + " ");
            }
            bilangan++;
        }
    }
}