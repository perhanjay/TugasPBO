package Modul4;

import java.util.Scanner;

public class Matriks {
    static int[][] matriks1 = new int[2][2];
    static int[][] matriks2 = new int [2] [2];
    static int[][] hasil = new int [2] [2];

    public static void main(String[] args) {
        System.out.println("Selamat datang pada program kalkulasi matriks dimensi 2");

        Scanner input = new Scanner(System.in);
        int pilihanPengguna = 0;

        while (pilihanPengguna != 4) {
            System.out.print("Pilih opsi untuk melanjutkan"
                    + "\n1. Masukkan nilai matriks"
                    + "\n2. Kalikan matriks"
                    + "\n3. Kurangkan matriks"
                    + "\n4. Hentikan program"
                    + "\n: ");
            pilihanPengguna = input.nextInt();
            switch (pilihanPengguna) {
                case 1:
                    masukkanMatriks();
                    break;
                case 2:
                    kaliMatriks();
                    break;
                case 3:
                    kurangMatriks();
                    break;
            }
        }
    }

    static void masukkanMatriks() {
        System.out.print("\nMasukkan nilai matriks: \n1.X\n2.Y\n3.Matriks X dan Y\n: ");
        Scanner input = new Scanner(System.in);
        int pilihanPengguna = input.nextInt();
        switch (pilihanPengguna) {
            case 1:
                isiMatriksX();
                break;
            case 2:
                isiMatriksY();
                break;
            case 3:
                isiMatriksX();
                isiMatriksY();
        }
    }

    static void isiMatriksX() {
        System.out.print("\nMatriks X\n");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matriks1.length ; i++) {
            for (int j = 0; j < matriks1.length; j++) {
                System.out.print("Matriks ["+ i +"]["+ j +"]: " );
                matriks1[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matriks1.length ; i++) {
            for (int j = 0; j < matriks1.length ; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]: " + matriks1[i][j]);
            }
        }
    }

    static void isiMatriksY() {
        System.out.print("\nMatriks Y\n");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2.length; j++) {
                System.out.print("Matriks ["+ i +"]["+ j +"]: " );
                matriks2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matriks2.length ; i++) {
            for (int j = 0; j < matriks2.length ; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]: " + matriks2[i][j]);
            }
        }
    }


    static void kaliMatriks() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matriks1[i][0] * matriks2[0][j] + matriks1[i][1] * matriks2[1][j];
            }
        }
        System.out.println("\nHasil Kali Matriks\n");
        System.out.println("[" + hasil[0][0]+ "]" + "[" + hasil[0][1]+ "]\n" +
                "[" + hasil[1][0]+ "]" + "[" + hasil[1][1]+ "]\n");

    }

    static void kurangMatriks() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j] ;
            }
        }
        System.out.println("\nHasil Pengurangan Matriks\n");
        System.out.println("[" + hasil[0][0]+ "]" + "[" + hasil[0][1]+ "]\n" +
                "[" + hasil[1][0]+ "]" + "[" + hasil[1][1]+ "]\n");
    }
}
