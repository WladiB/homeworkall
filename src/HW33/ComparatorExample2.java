package HW33;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample2 {

    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java"};

        // Сравните строки по количеству согласных букв
        Comparator<String> comparator = (s1, s2) -> countConsonants(s1) - countConsonants(s2);

        Arrays.sort(strings, comparator);

        // Выведите отсортированный список строк
        for (String s : strings) {
            System.out.println(s);
        }
    }

    private static int countConsonants(String s) {
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isVowel(c)) {
                consonants++;
            }
        }
        return consonants;
    }

    private static boolean isVowel(char c) {

        return false;
    }
}




