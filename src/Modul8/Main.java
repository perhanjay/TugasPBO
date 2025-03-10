//Buatlah program sederhana yang menerapkan exception handling :
//a. ArithmeticException
//b. IndexOutOfBoundsException
package Modul8;

public class Main {
    public static void main(String[] args) {
        AritmatikaSederhana bilangan = new AritmatikaSederhana();
        System.out.println(bilangan.pembagian(10, 0));
    }
}

class AritmatikaSederhana{
    double hasil;
    double pembagian(int x, int y){
        try{
            hasil = x/y;
        } catch (ArithmeticException e){
            System.out.println("Error: Bilangan kedua tidak boleh 0");
        } finally{
            return hasil;
        }
    }
}