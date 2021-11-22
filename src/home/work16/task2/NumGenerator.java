package home.work16.task2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class NumGenerator {
    private final int numberOfElements;
    private final int minNumber;
    private final int maxNumber;

    public NumGenerator(int numberOfElements, int minNumber, int maxNumber) {
        this.numberOfElements = numberOfElements;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public List<Integer> generateList() {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            lst.add((int) ((Math.random() * maxNumber) - minNumber));
        }
        return lst;
    }

    public Set<Integer> generateSet() {
        if (maxNumber - minNumber < numberOfElements) {
            throw new UnsupportedOperationException();
        }
        Set<Integer> set = new HashSet<>();
        while (set.size() < numberOfElements) {
            set.add(ThreadLocalRandom.current().nextInt(minNumber, maxNumber));
        }
        return set;
    }
}
