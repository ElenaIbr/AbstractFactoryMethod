package com.company.bankingproject;

import com.company.ProductManager;

public class BankingPM implements ProductManager {
    @Override
    public void manageProject() {
        System.out.println("JBankingPM manages banking project...");
    }
}
