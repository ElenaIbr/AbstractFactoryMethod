package com.company.website;

import com.company.ProductManager;

public class WebsitePM implements ProductManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project...");
    }
}
