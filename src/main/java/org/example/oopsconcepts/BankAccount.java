package org.example.oopsconcepts;

public class BankAccount {
    private String bankAccount;
    private double balance;

    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccount='" + bankAccount + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String bankAccount, double balance) {
        this.bankAccount = bankAccount;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
