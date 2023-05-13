//Houzaifa Mahmoud
//20216729
package BankSystem;
public final class BankAccount {
    private double balance;

    public double getBalance() {
        return balance + (balance * 0.1);
    }

    public void setBalance(double balance) {
        if (balance >= 0 && balance <= 1000000) {
            this.balance += balance;
        }
    }

    public void setBalance(double value, double taxPercent) {
        double tax = value * (taxPercent / 100);
        this.balance += value - tax;
    }
}
