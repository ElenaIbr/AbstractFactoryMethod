package com.company;

import com.company.bankingproject.BankingTeamFactory;
import com.company.website.WebsiteTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {

        BankingTeamFactory bankingTeamFactory = new BankingTeamFactory();
        Developer developer = bankingTeamFactory.createDeveloper();
        Tester tester = bankingTeamFactory.createTester();
        ProductManager productManager = bankingTeamFactory.createPM();

        developer.writeCode();
        tester.testCode();
        productManager.manageProject();

    }
}
