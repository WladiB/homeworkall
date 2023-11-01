import java.util.Random;


public class HomeWork11Random {
    int variable = 0;

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(50) + 1;

        //variable = randomNumber++;

        // Случайное число от 1 до 50

        System.out.println("Подсказка : Число находится в диапазоне от 0 до 50" + " и равно " + randomNumber);

        //System.out.println("Попробуйте угадать еще раз, следующее число будет" + variable + " предидущего.");
        System.out.println("Попробуйте угадать еще раз, следующее число будет " + "меньше" + " предидущего.");
    }
}
