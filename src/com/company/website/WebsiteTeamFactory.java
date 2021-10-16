package com.company.website;

import com.company.Developer;
import com.company.ProductManager;
import com.company.ProjectTeamFactory;
import com.company.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProductManager createPM() {
        return new WebsitePM();
    }
}
