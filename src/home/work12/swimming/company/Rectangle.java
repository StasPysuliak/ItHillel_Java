package home.work12.swimming.company;

class Rectangle {
    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    double getArea() {
        return width * length;
    }
}
