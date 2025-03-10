package Modul1;

public class LuasTabung {
    double radius;
    double height;

    public LuasTabung(double range, double height) {
        this.radius = range;
        this.height = height;
    }

    double hitungLuas() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public static void main(String[] args) {
        LuasTabung tabung = new LuasTabung(5, 10);
        System.out.println(tabung.hitungLuas());
    }
}
