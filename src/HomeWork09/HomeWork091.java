

import java.util.Scanner;

public class HomeWork091 {

    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        while (count < 10) {
            if (i % 5 == 0) {
                System.out.println("Task" + " " + i);
                count++;
            }
            i++;
        }
    }
}