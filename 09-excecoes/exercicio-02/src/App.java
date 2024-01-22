import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.WithdrawException;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(holder, balance, withdrawLimit);

        System.out.println();

        System.out.println("Holder : " + account.getHolder());
        System.out.println("Balance: $" + String.format("%.2f", account.getBalance()));
        System.out.println("Withdraw Limit: $" + String.format("%.2f", account.getWithdrawLimit()));

        System.out.println();

        while (true) {
            try {
                System.out.print("Enter amount for withdraw: ");
                account.withdraw(sc.nextDouble());
                break;
            } catch (WithdrawException e) {
                System.out.println(e.getMessage() + "\n");
            }
        }
        
        sc.close();

    }
}
