package HomeWork16_3;

public class Main {


        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("100", 150.58);
            System.out.println(bankAccount.getAccountNumber()); // 100
            bankAccount.setAccountNumber("5");
            System.out.println(bankAccount.getAccountNumber()); // 5

            System.out.println("Текущий баланс: " + bankAccount.getBalance());

            bankAccount.deposit(100.02);
            System.out.println("Текущий баланс после внесения суммы 100.2: " + bankAccount.getBalance()); // 250.60
            bankAccount.withdraw(250);
            System.out.println("Текущий баланс после снятия суммы 250.60: " + bankAccount.getBalance()); // 0.60

            bankAccount.withdraw(2000);
            System.out.println("Текущий баланс после снятия суммы 2000: " + bankAccount.getBalance()); // 0.60
        }
}
