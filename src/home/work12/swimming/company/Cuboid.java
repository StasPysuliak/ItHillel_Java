package home.work12.swimming.company;

class Cuboid extends Rectangle {
    private double height;

    Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    double getHeight() {
        return height;
    }

    double getVolume() {
        return getArea() * height;
    }
}
