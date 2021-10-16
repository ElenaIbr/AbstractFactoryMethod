package com.company;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createTester();
    ProductManager createPM();
}
