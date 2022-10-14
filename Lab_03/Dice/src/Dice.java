import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;
        String choice = "no";
        Scanner in = new Scanner(System.in);
        predictedValue=in.nextInt();
        bet=in.nextDouble();

        Random random = new Random();
        random.nextInt(1,6);

        System.out.println("Il tuo saldo è " + playerAccount.getBalance());

    }
}