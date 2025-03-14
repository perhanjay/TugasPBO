package Modul8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringAcesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata kata anda: ");
        String text = sc.nextLine();

        System.out.print("Pilih huruf yang ingin di akses: ");
        int huruf = sc.nextInt();
        try{
            System.out.println(text.charAt(huruf));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tidak dapat menampilkan huruf, karakter diluar teks.");
            System.out.println(e.getMessage());
        }

    }
}
