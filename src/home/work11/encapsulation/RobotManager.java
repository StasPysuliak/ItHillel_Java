package home.work11.encapsulation;

public class RobotManager {

    public static void main(String[] args) {
        // Создаем объект для управления роботом
        RobotManager rm = new RobotManager();

        // Создаем объекта класса Robot
        Robot robot = new Robot();
        // Курс 45 градусов
        robot.setCourse(45);
        // Напечатать курс
        System.out.println(robot.getCourse());      // Здесь будет 45

        // вызываем метод и передаем туда робота
        rm.changeCourse(robot);

        // Напечатать курс
        System.out.println(robot.getCourse());      // Здесь будет 180
    }

    private void changeCourse(Robot robot) {
        robot.setCourse(180);
    }
}