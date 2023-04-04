package study;

import javax.crypto.spec.PSource;

class Account {
    private String owner;
    private long balance;

    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long deposit(long amount) {
        balance += amount;
        return balance;

    }
    public long withdraw(long amount) {

        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return balance;
        }
        balance -= amount;
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
