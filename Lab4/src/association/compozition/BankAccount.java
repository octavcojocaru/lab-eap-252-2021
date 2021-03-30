package association.compozition;

import java.math.BigDecimal;

public class BankAccount {

    BigDecimal money;

    public BankAccount(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void clear() {
        this.money = BigDecimal.ZERO;
    }
}
