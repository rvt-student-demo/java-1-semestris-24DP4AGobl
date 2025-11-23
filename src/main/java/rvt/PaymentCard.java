package rvt;

public class PaymentCard {
    private double balance;
    private String name;

    public PaymentCard(double openingBalance, String name) {
        this.balance = openingBalance;
        this.name = name;
    }

    public void eatAffordably() {
        if (this.balance - 2.60 > 0){
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 > 0){
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (this.balance + amount > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }

    public String toString() {
        return name + ": The card has a balance of " + String.valueOf(balance) + " euros";
    }
}
