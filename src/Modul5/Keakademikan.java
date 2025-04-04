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
        System.out.println("Informasi Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\n");
    }

    void tampilkanInfo(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        System.out.println("Informasi Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\n");
    }

    void tampilkanInfo(String nama, int nim, String jurusan, String fakultas){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        System.out.println("Informasi Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\n");
    }

    void tampilkanInfo(String nama, double ipSemester){
        this.nama = nama;
        this.ipSemester = ipSemester;
        System.out.println("Prestasi Akademik\nNama: " + nama + "\nIP Semester: " + ipSemester + "\n");
    }

    void tampilkanInfo(String nama, double ipSemester, double ipKumulatif){
        this.nama = nama;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        System.out.println("Prestasi Akademik\nNama: " + nama + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\n");
    }


    void tampilkanInfo(String nama, double ipSemester, double ipKumulatif, String riwayatBeasiswa[]){
        this.nama = nama;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        this.riwayatBeasiswa = riwayatBeasiswa;
        System.out.println("Prestasi Akademik\nNama: " + nama + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\nRiwayat Beasiswa: ");
        if (riwayatBeasiswa != null){
            for (String x : riwayatBeasiswa){
                System.out.println(x);
            }
            System.out.println();
        }else{
            System.out.println("Riwayat beasiswa tidak ditemukan");
        }
    }

    void tampilkanInfo(String nama, int nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif, String riwayatBeasiswa[]){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        this.riwayatBeasiswa = riwayatBeasiswa;
        System.out.println("Informasi Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\nPrestasi Akademik\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\nRiwayat Beasiswa:");
        if (riwayatBeasiswa != null){
            for (String x : riwayatBeasiswa){
                System.out.println(x);
            }
            System.out.println();
        }else{
        System.out.println("Riwayat beasiswa tidak ditemukan");
    }
    }

    public static void main(String[] args) {
        Keakademikan ferhan = new Keakademikan();
        ferhan.tampilkanInfo("Muhammad Iqbal Ferhan", 11241056, "JTEIB", "FSTI");
        ferhan.tampilkanInfo("Muhammad Iqbal Ferhan",3.39,3.39, new String[]{"KIP", "Pertamina Foundation"});
        ferhan.tampilkanInfo("Muhammad Iqbal Ferhan", 11241056, "JTEIB", "FSTI" ,3.39,3.39, new String[]{"BCA", "BRI"});
    }
}
