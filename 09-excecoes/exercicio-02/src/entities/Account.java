package entities;

import exceptions.WithdrawException;

public class Account {
    
    private Integer id;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    private static Integer idCount = 0;

    public Account() {
        idCount++;
        this.id = idCount;
    }

    public Account(String holder, Double balance, Double withdrawLimit) {
        idCount++;
        this.id = idCount;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws WithdrawException {
        if (amount > balance) {
            throw new WithdrawException("Amount higher than balance");
        } else if (amount > withdrawLimit){
            throw new WithdrawException("Amount higher than withdraw limit");
        } else {
            balance -= amount;
        }
    }
    

}
