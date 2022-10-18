import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;

        String choice = "si";
        Scanner in = new Scanner(System.in);
        while(choice.equals("si")) {
            choice=in.next();
            if (playerAccount.getBalance() > 0 && choice.equals("si")) {
                predictedValue = in.nextInt();
                bet = in.nextDouble();
                Random random = new Random();
                actualValue = random.nextInt(1, 6);
                if (predictedValue == actualValue) {
                    if (casinoAccount.getBalance() > bet * 5) {
                        casinoAccount.withdraw(bet * 5);
                        playerAccount.deposit(bet * 5);
                    } else {
                        playerAccount.withdraw(bet);
                        casinoAccount.deposit(bet);
                    }
                }
            } else {
                System.out.println("non hai più saldo oppure hai scelto di non continuare");
            }
            System.out.println("Il tuo saldo è " + playerAccount.getBalance());
        }
    }
}