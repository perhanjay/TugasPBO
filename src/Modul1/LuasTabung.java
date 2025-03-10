package Modul1;

public class LuasTabung {
    double range;
    double height;

    public LuasTabung(double range, double height) {
        this.range = range;
        this.height = height;
    }

    double hitungLuas() {
        return 2 * Math.PI * range * (range + height);
    }

    public static void main(String[] args) {
        LuasTabung tabung = new LuasTabung(5, 10);
        System.out.println(tabung.hitungLuas());
    }
}
