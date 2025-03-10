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

    void identitasMahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
        System.out.println("Nama: " + nama + "\nNIM: " + nim);
    }
    void identitasMahasiswa(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan);
    }
    void identitasMahasiswa(String nama, int nim, String jurusan, String fakultas){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        System.out.println("Nama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas);
    }

    void prestasiAkademik(String nama, double ipSemester){
        this.nama = nama;
        this.ipSemester = ipSemester;
        System.out.println("Nama: " + nama + "\nIP Semester: " + ipSemester);
    }

    void prestasiAkademik(String nama, double ipSemester, double ipKumulatif){
        this.nama = nama;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        System.out.println("Nama: " + nama + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif);
    }


    void prestasiAkademik(String nama, double ipSemester, double ipKumulatif, String riwayatBeasiswa[]){
        this.nama = nama;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        this.riwayatBeasiswa = riwayatBeasiswa;
        System.out.println("Nama: " + nama + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\nRiwayat Beasiswa: ");
        for (String x : riwayatBeasiswa){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Keakademikan ferhan = new Keakademikan();
        ferhan.identitasMahasiswa("Ferhan", 11241056, "JMTI", "FSTI");
        ferhan.prestasiAkademik("Ferhan", 3.34, 3.5, new String[]{"KIP", "BNI"});
    }

}
