package org.bibhuti.structural.facade;

import java.math.BigDecimal;
import java.util.Random;

public class Chequing implements  Account{
    private BigDecimal initAmount;
    private int accountNumber = 0;

    public Chequing(BigDecimal initAmount) {
        System.out.println("Creating Chequing account with initial amount "+initAmount);
        this.initAmount = initAmount;
        ++accountNumber;
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Depositing amount in Chequing account");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing amount from Chequing account");
    }

    @Override
    public void transfer(Account toAccount, BigDecimal amount) {
        initAmount = initAmount.subtract(amount);
       System.out.println("Balance after transfer is "+initAmount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
