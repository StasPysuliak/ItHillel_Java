package home.work16.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Options options = new Options();
        ArrayList<String> listArray = new ArrayList<>(List.of("ar_0", "ar_1", "ar_2", "ar_3", "ar_4", "ar_5", "ar_6", "ar_7", "ar_8", "ar_9"));
        LinkedList<String> listLink = new LinkedList<>();
        List<String> lst1;
        List<String> lst2 = new LinkedList<>();

        options.randomValues(listLink, 10);
        lst1 = options.throughOne(new LinkedList<>(), listArray.listIterator(listArray.size()), listLink.listIterator());
        lst2 = options.throughTwo(listLink.listIterator(), lst2, listArray.listIterator(listArray.size()));

        System.out.println("ArrayList: " + listArray);
        System.out.println("LinkedList: " + listLink);
        System.out.println("ArrayList + LinkedList: " + lst1);
        System.out.println("ArrayList + LinkedList: " + lst2);
    }
}
