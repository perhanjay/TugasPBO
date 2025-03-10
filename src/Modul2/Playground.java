package Modul2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Playground {

    public static void main(String[] args) throws IOException {
        String name;
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        System.out.println("Enter name: ");
//        name = br.readLine();
//        System.out.println("Name: "+name);

    name = JOptionPane.showInputDialog("Masukkan nama");
    String msg = "Selamat belajar "+name;
    JOptionPane.showMessageDialog(null, msg);
    double range;
    range = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan jari-jari Lingkaran", "Hitung Gacor", JOptionPane.PLAIN_MESSAGE));
    System.out.println("Range: " + range);
    }
}
