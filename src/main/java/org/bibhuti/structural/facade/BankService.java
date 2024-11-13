package org.bibhuti.structural.facade;

import java.math.BigDecimal;
import java.util.HashMap;


public class BankService {
    private HashMap<Integer, Account> bankAccounts;

    public BankService() {
        this.bankAccounts = new HashMap<>();
    }

    public int createNewAccount(String type, BigDecimal
            initAmount) {
        Account newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;

            default:
                System.out.println("Invalid account type");
                break;

        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(),
                    newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal
            amount) {
        Account toAccount = this.bankAccounts.get(to);
        Account fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }
}
