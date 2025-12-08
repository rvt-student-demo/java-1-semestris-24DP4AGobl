package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return balance;
    }

    public void addMoney(double increase) {
        balance += increase;
    }

    public boolean takeMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }

        return false;
    }
}
