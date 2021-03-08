package objects.exercises.accounts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account[] accounts = {new Account("Marian"), new Account("Gigel"), new Account("Ana")};

        float totalBalances = 0.0f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Initializing account balances: ");
        for(Account account: accounts) {
            System.out.println("Setting balance for " + account.getName());
            float balance = scanner.nextFloat();
            account.setBalance(balance);
            System.out.println("Set account balance for " + account.getName() + ": " + account.getBalance());
            totalBalances += account.getBalance();
        }

        System.out.println("total balance of all accounts is: " + totalBalances);

    }
}
