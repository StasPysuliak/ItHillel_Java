package home.work24.task2.task1;

import java.util.Arrays;

public class MyTestMethod {
    public static <E extends Comparable<E>> long calcNum(E[] arr, E value) {
        return Arrays.stream(arr)
                .filter(x -> x.compareTo(value) > 0)
                .count();
    }

    public static <E extends Number> long calcSum(E[] arr, E value) {
        return Arrays.stream(arr)
                .filter(x -> x.longValue() > value.longValue())
                .mapToLong(Number::longValue)
                .sum();
    }
}
