//Buatlah program overloading constructor yang dapat menampilkan identitas
//mahasiswa seperti gambaran berikut :
package Modul5;

import javax.swing.*;

public class ProfileMahasiswa {
    String nama;
    int nim;
    String jurusan;
    String fakultas;
    double ipSemester;
    double ipKumulatif;

    public ProfileMahasiswa(String nama){
        this.nama = nama;
        System.out.println("Nama: " + nama);
    }

    public ProfileMahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
        System.out.println("Nama: " + nama + "\nNIM: " + nim);
    }

    public ProfileMahasiswa(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan);
    }

    public ProfileMahasiswa(String nama, int nim, String jurusan, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas);
    }

    public ProfileMahasiswa(String nama, int nim, String jurusan, String fakultas, double ipSemester) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\nIP Semester: " + ipSemester);
    }

    public ProfileMahasiswa(String nama, int nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif);
    }

    public static void main(String[] args) {
        ProfileMahasiswa ferhan = new ProfileMahasiswa("Ferhan", 11241056, "JMTI");
    }
}
