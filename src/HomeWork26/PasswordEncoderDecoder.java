package HomeWork26;


    import java.util.Random;
import java.util.Scanner;

    public class PasswordEncoderDecoder {

        public static final int N = 6;

        public static String encodePassword(String password) {
            String encodedPassowrd = ""; // переменная, в которую пишем зашифрованный пароль

            for (int i = 0; i < password.length(); i++) {
                char originalChar = password.charAt(i);

                if (i % 2 == 0) {
                    encodedPassowrd += (char) (originalChar + 1000);
                } else {
                    encodedPassowrd += (char) (originalChar - 10);
                }
            }

            Random random = new Random();
            for (int i = 0; i < N; i++) {
                char randomChar = (char) random.nextInt(Character.MAX_CODE_POINT);
                encodedPassowrd += randomChar;
            }

            return encodedPassowrd;
        }

        public static String decodePassword(String password) {
            String result = "";

            for (int i = 0; i < password.length() - N; i++) {
                char encodedChar = password.charAt(i);

                if (i % 2 == 0) {
                    result += (char) (encodedChar - 1000);
                } else {
                    result += (char) (encodedChar + 10);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner consoleInput = new Scanner(System.in);

            System.out.println("Menu: ");
            System.out.println("1 - encode Password");
            System.out.println("2 - decode Password");

            String action = consoleInput.nextLine();
            int selectedAction = Integer.valueOf(action);

            if (selectedAction == 1) {
                System.out.println("Please, enter your password to encode: ");
                String userPassword = consoleInput.nextLine();

                String encodedUserPass = encodePassword(userPassword);

                System.out.println("Your encoded password is:  ");
                System.out.println(encodedUserPass);
            } else if (selectedAction == 2) {
                System.out.println("Please, enter your password to decode: ");

                String decodedUserPass = consoleInput.nextLine();
                String encodedUserPass = decodePassword(decodedUserPass);

                System.out.println("Your decoded password is:  ");
                System.out.println(encodedUserPass);
            } else {
                System.out.println("Error, this action not present");
            }
        }
    }













