package home.work24.task2.task2;

import java.util.Arrays;

public class Runner {
    public void run() {
        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MyMixer<Integer> mixInt = new MyMixer<>(intArr);
        mixInt.shuffle();
        Arrays.stream(intArr)
                .forEach(System.out::println);

        System.out.println();

        String[] stringArr = {"One" , "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        MyMixer<String> mixString = new MyMixer<>(stringArr);
        mixString.shuffle();
        Arrays.stream(stringArr)
                .forEach(System.out::println);
    }
}
