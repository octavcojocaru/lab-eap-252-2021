package association.compozition;

import java.math.BigDecimal;

public class Customer {

    private String name;
    private BankAccount bankAccount; // relatie 1-1 // HAS_A

    public Customer(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = new BankAccount(bankAccount.getMoney()); // cream o noua referinta de tip BankAccount, diferita de cea originala
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(BigDecimal.valueOf(4523.60));
        Customer customer = new Customer("Customer", bankAccount);

        customer.getBankAccount().clear();

        System.out.println(bankAccount.getMoney());

    }
}
