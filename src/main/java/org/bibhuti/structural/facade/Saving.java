package org.bibhuti.structural.facade;

import java.math.BigDecimal;
import java.util.Random;

public class Saving implements  Account{
    private int accountNumber = 0;
    private BigDecimal initAmount ;
    public Saving(BigDecimal initAmount) {
        this.initAmount = initAmount;
        ++accountNumber;
        System.out.println("Saving Account created with initial amount "+initAmount);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Depositing amount in Saving Account");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing amount from Saving Account");
    }

    @Override
    public void transfer(Account toAccount, BigDecimal amount) {
        initAmount = initAmount.subtract(amount);
        System.out.println("Balance after transfer "+initAmount);
    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
