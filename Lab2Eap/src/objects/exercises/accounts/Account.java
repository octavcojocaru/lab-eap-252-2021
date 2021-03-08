package objects.exercises.accounts;

public class Account {

    // se creaza o clasa Account cu 2 fielduri: name, balance
    // 1 constructor cu parametrul name

    // o clasa cu metoda main definiti un array de 3 Accounts (pasand name in constructor).
    // pentru fiecare element (Account) citi de la tastatura un parametru "balance" si asignati-l in balanta contului.
    // afisati balanta totala a conturilor


    private String name;
    private float balance;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
