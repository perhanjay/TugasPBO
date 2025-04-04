//Buatlah program overloading constructor yang dapat menampilkan identitas
//mahasiswa seperti gambaran berikut :
package Modul5;

public class ProfileMahasiswa {
    String nama;
    int nim;
    String jurusan;
    String fakultas;
    double ipSemester;
    double ipKumulatif;

    public ProfileMahasiswa(String nama){
        this.nama = nama;
        System.out.println("Identitas Mahasiswa\nNama: " + nama + "\n");
    }

    public ProfileMahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
        System.out.println("Identitas Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\n");
    }

    public ProfileMahasiswa(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        System.out.println("Identitas Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\n");
    }

    public ProfileMahasiswa(String nama, int nim, String jurusan, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        System.out.println("Identitas Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\n");
    }

    public ProfileMahasiswa(String nama, int nim, String jurusan, String fakultas, double ipSemester) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        System.out.println("Identitas Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\nIP Semester: " + ipSemester + "\n");
    }

    public ProfileMahasiswa(String nama, int nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        System.out.println("Identitas Mahasiswa\nNama: " + nama + "\nNIM: " + nim + "\nJurusan: " + jurusan + "\nFakultas: " + fakultas + "\nIP Semester: " + ipSemester + "\nIP Kumulatif: " + ipKumulatif + "\n");
    }

    public static void main(String[] args) {
        ProfileMahasiswa ferhan = new ProfileMahasiswa("Ferhan", 11241056, "JTEIB");
        ProfileMahasiswa andi = new ProfileMahasiswa("Andi", 11241014, "JTEIB", "FSTI", 3.55, 3.55);
    }
}
