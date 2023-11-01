public class HomeWork10DepositWithInterest {

        public static void main(String[] args) {

            float DepositTotal = 100;
            int months = 5;
            float interest = 12;

            for (int month = 1; month <= months; month++) {
                DepositTotal += DepositTotal * (interest / 100);
            }

            System.out.println("Final deposit after the end of " + months + " month" + " " + DepositTotal);
        }
    }



