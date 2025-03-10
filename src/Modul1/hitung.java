package Modul1;

public class hitung {
    public static void main(String[] args) {
        LuasIsiTabung tabung = new LuasIsiTabung(10, 5);
//        LuasTrapesium trapesium = new LuasTrapesium();
    }
}

class LuasIsiTabung {
    double pi = Math.PI;
    double height;
    double radius;

    public LuasIsiTabung(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    double hitungLuas(){
        return 2 * Math.PI * radius * (radius + height);
    }
}

class LuasPersegiPanjang{
    double length;
    double width;

    public  LuasPersegiPanjang(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double hitungLuas(){
        return length * width;
    }
}

class LuasTrapesium{
    double height;
    double bottomBase;
    double upperBase;

    public LuasTrapesium(double height, double bottomBase, double upperBase) {
        this.height = height;
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
    }

    double hitungLuas(){
        return (bottomBase + upperBase) * 0.5 * height;
    }
}
