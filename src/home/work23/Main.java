package home.work23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("G:\\Java\\JavaHomeWork\\src\\home\\work23\\text.txt"))
                .map(str -> str.split(" "))
                .map(List::of)
                .flatMap(Collection::stream)
                .map(String::toLowerCase)
                .map(letter -> letter.replaceAll("[^A-Za-zА-Яа-я]", ""))
                .filter(letter -> letter.length() > 0)
                .collect(Collectors.toList()).stream()
                .distinct()
                .collect(Collectors.groupingBy(x -> x.charAt(0)))
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList()).stream()
                .map(lst -> String.join(" ", lst))
                .forEach(System.out::println);
    }
}