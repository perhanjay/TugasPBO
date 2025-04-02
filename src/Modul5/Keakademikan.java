//Buatlah program overloading method yang dapat menampilkan identitas mahasiswa
//dan prestasi akademiknya, seperti gambaran berikut :

package Modul5;

public class Keakademikan {
    String nama;
    int nim;
    String jurusan;
    String fakultas;
    double ipSemester;
    double ipKumulatif;
    String riwayatBeasiswa[];

    void tampilkanInfo(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\n");
    }

    void tampilkanInfo(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\n");
    }

    void tampilkanInfo(String nama, int nim, String jurusan, String fakultas){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\n");
    }

    void tampilkanInfo(String nama, double ipSemester){
        this.nama = nama;
        this.ipSemester = ipSemester;
        System.out.println("Nama: " + nama + "\nIP Semester: " + ipSemester + "\n");
    }

    void tampilkanInfo(String nama, double ipSemester, double ipKumulatif){
        this.nama = nama;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        System.out.println("Nama: " + nama + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\n");
    }


    void tampilkanInfo(String nama, double ipSemester, double ipKumulatif, String riwayatBeasiswa[]){
        this.nama = nama;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        this.riwayatBeasiswa = riwayatBeasiswa;
        System.out.println("Nama: " + nama + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\nRiwayat Beasiswa: ");
        for (String x : riwayatBeasiswa){
            System.out.println(x);
        }
        System.out.println();
    }

    void tampilkanInfo(String nama, int nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif, String riwayatBeasiswa[]){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        this.riwayatBeasiswa = riwayatBeasiswa;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\nRiwayat Beasiswa:");
        for (String x : riwayatBeasiswa){
            System.out.println(x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Keakademikan ferhan = new Keakademikan();
        ferhan.tampilkanInfo("Ferhan", 11241056, "JMTI", "FSTI");
        ferhan.tampilkanInfo("Ferhan", 3.39, 3.9, new String[]{"KIP", "BNI"});
        ferhan.tampilkanInfo("Ferhan", 11241056, "JMTI", "FSTI", 3.39, 3.39, new String[]{"KIP", "BNI"});
    }
}
