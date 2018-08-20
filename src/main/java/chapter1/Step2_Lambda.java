package chapter1;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Adwiti on 8/18/2018.
 */
public class Step2_Lambda {
    public static void main(String[] args) {

        String[] fruits = {"apple", "mango", "cherries", "banana", "avocado"};

        /**
         * use if Arrays.stream
         */
        Stream<String> stream = Arrays.stream(fruits);
        stream.forEach(fruit -> System.out.println(fruit));

        /**
         * Arrays.asList
         */
        final List<String> lstFruits = Arrays.asList(fruits);
        lstFruits.stream().forEach(fruit -> System.out.println(fruit));

        /**
         * use of set
         */
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        numbers.stream().forEach(number -> System.out.println(number));

        /**
         * use of Map
         */

        Map<Integer, String> numberMapping = new HashMap<>();
        numberMapping.put(1, "One");
        numberMapping.put(2, "Two");

        numberMapping.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        /**
         * use of String
         */

        String name = "You have to do it";
        name.chars().forEach(c -> System.out.println((char) c));
    }
}
