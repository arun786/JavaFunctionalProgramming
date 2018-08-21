package chapter1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Adwiti on 8/20/2018.
 */
public class Step4_UseOfFilter {
    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four", "five", "six").filter(number -> number.length() < 4).forEach(System.out::println);

        filterWithMultipleConditions();
    }

    public static void filterWithMultipleConditions() {
        List<String> colors = Arrays.asList("red", "green", "yellow", "blue", "maroon", "yellow");
        final List<String> filteredColor = colors.stream().filter(color -> color.length() > 2 && color.length() < 5).collect(Collectors.toList());
        filteredColor.forEach(System.out::println);
    }
}
