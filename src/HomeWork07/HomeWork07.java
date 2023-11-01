import java.util.Scanner;

public class HomeWork07 {

    public static void main(String[]args) {
        task2();
    }
        public static void task2(){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your Name");

        String A = scanner.nextLine();

        System.out.println("Enter your Surname ");

        String B = scanner.nextLine();

        System.out.println("Mr.or Ms." );

        String C = scanner.nextLine();

        System.out.println("Hello , " + C + " " + A + " " + B );

        scanner.close();

    }
}


