//Buatlah program enkapsulasi sederhana yang dapat menampilkan biodata anda,
//seperti : nama, nim, jurusan, fakultas, universitas, alamat, email, pekerjaan, hobi,
//keahlian, dan karya.
package Modul6;

import Modul5.ProfileMahasiswa;

public class ProfilManusia {
    private String nama;
    private int nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String alamat;
    private String email;
    private String pekerjaan;
    private String hobi;
    private String keahlian;
    private String karya;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    public String getKarya() {
        return karya;
    }

    public void setKarya(String karya) {
        this.karya = karya;
    }

    void tampilkanBiodata(){
        System.out.println(
        "Nama: "+ nama +
        "\nNIM: "+ nim +
        "\nJurusan: " + jurusan +
        "\nFakultas: " + fakultas +
        "\nUniversitas: " + universitas +
        "\nAlamat: " + alamat +
        "\nEmail: " + email +
        "\nPekerjaan: " + pekerjaan +
        "\nHobi: " + hobi +
        "\nKeahlian: " + keahlian +
        "\nKarya: " + karya);
    }

    public static void main(String[] args) {
        ProfilManusia ferhan = new ProfilManusia();
        ferhan.setNama("Ferhan");
        ferhan.setNim(11241056);
        ferhan.setJurusan("JMTI");
        ferhan.setFakultas("FSTI");
        ferhan.setUniversitas("Institut Teknologi Kalimantan");
        ferhan.setAlamat("Kalimantan");
        ferhan.setEmail("11241056@itk.ac.id");
        ferhan.setPekerjaan("Mahasiswa");
        ferhan.setHobi("Membaca");
        ferhan.setKeahlian("Merenung");
        ferhan.setKarya("Lagu Absurd");
        ferhan.tampilkanBiodata();
    }
}
