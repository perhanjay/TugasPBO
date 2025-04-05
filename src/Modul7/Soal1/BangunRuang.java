package Modul7.Soal1;

public class BangunRuang {
    private String nama;

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    double hitungVolume(){
        return 0;
    }

    void tampilkanVolume(){
        System.out.println("Volume bangun ruang "+ nama + " adalah: " +  hitungVolume());
    }
}