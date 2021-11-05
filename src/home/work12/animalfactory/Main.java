package home.work12.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value;
        Animal animal;

        for (; ; ) {
            value = scanner.next();
            animal = AnimalFactory.getAnimalByKey(value);
            if (animal != null) {
                System.out.println(animal.getName());
                break;
            }
            System.out.println("Не могу создать Animal");
        }
    }
}
