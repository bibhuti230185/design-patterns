package org.bibhuti.structural.facade;

import java.math.BigDecimal;

public class Customer {
    public static void main(String[] args) {
        BankService myBankService = new BankService();
        int mySaving = myBankService.createNewAccount("saving", new BigDecimal("5000.00"));
        int myCurrent = myBankService.createNewAccount("chequing", new BigDecimal("2000.00"));

        myBankService.transferMoney(mySaving, myCurrent, new BigDecimal(300.00));
        myBankService.transferMoney(mySaving, myCurrent, new BigDecimal(300.00));


    }
}
