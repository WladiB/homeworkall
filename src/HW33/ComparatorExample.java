package HW33;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java"};

        // Сравните строки по количеству гласных букв
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int vowelsInS1 = countVowels(s1);
                int vowelsInS2 = countVowels(s2);

                return vowelsInS1 - vowelsInS2;
            }

            private int countVowels(String s) {
                int vowels = 0;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (isVowel(c)) {
                        vowels++;
                    }
                }
                return vowels;
            }

            private boolean isVowel(char c) {
                return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
            }
        };

        Arrays.sort(strings, comparator);

        // Выведите отсортированный список строк
        for (String s : strings) {
            System.out.println(s);
        }
    }
}


