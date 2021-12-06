package home.work19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook phoneBook = new MyPhoneBook();
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("1 - Add new contact\n" +
                "2 - Show all contacts\n" +
                "3 - Sort by name\n" +
                "4 - Sort by phone number\n" +
                "0 - Exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.print("Add name: ");
                    String name = scanner.nextLine();
                    System.out.print("Add phone number: ");
                    String phone = scanner.nextLine();
                    phoneBook.addPhoneNumber(name, phone);
                    break;
                case 2:
                    phoneBook.printPhoneBook(phoneBook.getPhoneNumbers());
                    break;
                case 3:
                    phoneBook.sortByName();
                    phoneBook.printPhoneBook(phoneBook.getPhoneNumbers());
                    break;
                case 4:
                    phoneBook.sortByPhoneNumber();
                    phoneBook.printPhoneBook(phoneBook.getPhoneNumbers());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("non-existent option");
            }
        }
    }
}