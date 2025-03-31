package Modul1;

public class VolumeTabung {
    double radius;
    double height;

    public VolumeTabung(double range, double height) {
        this.radius = range;
        this.height = height;
    }

    double hitungVolume() {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        VolumeTabung tabung = new VolumeTabung(5, 10);
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
    }
}
