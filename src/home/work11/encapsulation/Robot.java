package home.work11.encapsulation;

public class Robot {
    // Текущий курс (в градусах)
    private double course = 0;

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}