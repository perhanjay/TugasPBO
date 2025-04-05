package Modul8;

public class AritmatikaSederhana{
    double hasil;

    double pembagian(int x, int y){
        try{
            hasil = x/y;
        } catch (ArithmeticException e){
            System.out.println("Error: Bilangan kedua tidak boleh 0");
            hasil = 0;
        } finally{
            return hasil;
        }
    }

    public static void main(String[] args) {
        AritmatikaSederhana bilangan = new AritmatikaSederhana();
        System.out.println(bilangan.pembagian(10, 0));
    }
}