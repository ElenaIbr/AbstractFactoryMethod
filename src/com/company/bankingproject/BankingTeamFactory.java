package com.company.bankingproject;

import com.company.Developer;
import com.company.ProductManager;
import com.company.ProjectTeamFactory;
import com.company.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProductManager createPM() {
        return new BankingPM();
    }
}
