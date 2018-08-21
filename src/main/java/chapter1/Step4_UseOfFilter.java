package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Adwiti on 8/20/2018.
 */
public class Step4_UseOfFilter {
    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four", "five", "six").filter(number -> number.length() < 4).forEach(System.out::println);

        filterWithMultipleConditions();
        useOfFilterAndMap();
        useOfFilterWithMap();
    }

    public static void filterWithMultipleConditions() {
        List<String> colors = Arrays.asList("red", "green", "yellow", "blue", "maroon", "yellow");
        final List<String> filteredColor = colors.stream().filter(color -> color.length() > 2 && color.length() < 5).collect(Collectors.toList());
        filteredColor.forEach(System.out::println);
    }

    public static void useOfFilterAndMap() {
        Stream.of(1, 2, 3, 4, 5, 6).map(n -> n * n).forEach(System.out::println);
    }

    public static void useOfFilterWithMap(){
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1,"one");
        numbers.put(2,"two");
        numbers.put(3,"three");
        numbers.put(4,"four");
        numbers.put(5,"five");
        numbers.put(6,"six");

        final Map<Integer, String> filteredMap = numbers.entrySet().stream().filter(number -> number.getKey().intValue() <= 4).collect(Collectors.toMap(n -> n.getKey(), n -> n.getValue()));
        System.out.println(filteredMap);
    }
}
