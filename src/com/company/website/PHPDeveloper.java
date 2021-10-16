package com.company.website;

import com.company.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHPDeveloper writes website code...");
    }
}
