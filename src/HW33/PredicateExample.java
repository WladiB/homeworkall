package HW33;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.Comparator;

public class PredicateExample {

    public static void main(String[] args) {
        int number = 16;

        // Создайте предикат, который проверяет, является ли целое число степенью двойки
        Predicate<Integer> predicate = n -> (n > 0) && (n - 1) == 0;

        // Проверить, является ли число степенью двойки
        System.out.println(predicate.test(number));

        // Проверить, не является ли число степенью двойки
        System.out.println(predicate.test(17));
    }
}

















