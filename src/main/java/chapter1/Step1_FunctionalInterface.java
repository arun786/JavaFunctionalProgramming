package chapter1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Even {
    boolean isEven(int number);
}

/**
 * Created by Adwiti on 8/18/2018.
 */
public class Step1_FunctionalInterface {

    public static void main(String[] args) {

        Even even = num -> num % 2 == 0;
        System.out.println(even.isEven(10));

        /**
         * Comparator is a functional interface
         *
         * int compare(T ob1, T ob2)
         */

        Fruit f1 = new Fruit("Mango", 10);
        Fruit f2 = new Fruit("Apple", 100);
        Fruit f3 = new Fruit("Cherries", 50);
        Fruit f4 = new Fruit("Avocado", 30);
        Fruit f15 = new Fruit("Apple", 30);

        List<Fruit> fruits = Arrays.asList(f1, f2, f3, f4, f15);
        System.out.println(fruits);
        /*
        o/p will be
        [Fruit(name=Mango, size=10), Fruit(name=Apple, size=100), Fruit(name=Cherries, size=50), Fruit(name=Avocado, size=30), Fruit(name=Apple, size=30)]
         */

        /**
         * sort fruits using name, in ascending order
         */
        fruits.sort((f5, f6) -> f5.getName().compareTo(f6.getName()));
        System.out.println(fruits);
        /*
        [Fruit(name=Apple, size=100), Fruit(name=Apple, size=30), Fruit(name=Avocado, size=30), Fruit(name=Cherries, size=50), Fruit(name=Mango, size=10)]
         */
        System.out.println("----------------------------");
        /**
         * the above can also be written as
         */
        fruits.sort(Comparator.comparing(Fruit::getName));
        System.out.println(fruits);
        System.out.println("---------------------------");

        /**
         * sort fruits using name, in descending order
         */

        fruits.sort((f7, f8) -> f8.getName().compareTo(f7.getName()));
        System.out.println(fruits);
        /*
        [Fruit(name=Mango, size=10), Fruit(name=Cherries, size=50), Fruit(name=Avocado, size=30), Fruit(name=Apple, size=100), Fruit(name=Apple, size=30)]
         */

        fruits.sort(Comparator.comparing(Fruit::getName).reversed());
        System.out.println(fruits);
        System.out.println("===========================");

        /**
         * sorting by age ascending order
         */
        fruits.sort((f9, f10) -> f9.getSize() - f10.getSize());
        System.out.println(fruits);
        /*
        [Fruit(name=Mango, size=10), Fruit(name=Avocado, size=30), Fruit(name=Apple, size=30), Fruit(name=Cherries, size=50), Fruit(name=Apple, size=100)]
         */

        fruits.sort(Comparator.comparing(Fruit::getSize));
        System.out.println(fruits);

        /**
         * sorting by age descending order
         */
        fruits.sort((f11, f121) -> f121.getSize() - f11.getSize());
        System.out.println(fruits);

        /*
        [Fruit(name=Apple, size=100), Fruit(name=Cherries, size=50), Fruit(name=Avocado, size=30), Fruit(name=Apple, size=30), Fruit(name=Mango, size=10)]
         */
        System.out.println("++++++++++++++++++++");
        fruits.sort(Comparator.comparing(Fruit::getSize).reversed());
        System.out.println(fruits);
        /**
         * based on the size of the name of the fruits
         */
        fruits.sort((f5, f6) -> f5.getName().length() - f6.getName().length());
        System.out.println(fruits);
        /*
        [Fruit(name=Apple, size=100), Fruit(name=Apple, size=30), Fruit(name=Mango, size=10), Fruit(name=Avocado, size=30), Fruit(name=Cherries, size=50)]
         */

        /**
         * compare by name then compare by age
         */
        fruits.sort(Comparator.comparing(Fruit::getName).thenComparing(Fruit::getSize));
        System.out.println(fruits);
        /*
        [Fruit(name=Apple, size=30), Fruit(name=Apple, size=100), Fruit(name=Avocado, size=30), Fruit(name=Cherries, size=50), Fruit(name=Mango, size=10)]
         */


    }
}

@Getter
@AllArgsConstructor
@ToString
class Fruit {
    private String name;
    private int size;
}
