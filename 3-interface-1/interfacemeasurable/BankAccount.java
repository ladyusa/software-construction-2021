package interfacemeasurable;

import java.io.Serializable;

public class BankAccount implements Measurable, Serializable {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    @Override
    public double getMeasure() {
        return balance;
    }
}
