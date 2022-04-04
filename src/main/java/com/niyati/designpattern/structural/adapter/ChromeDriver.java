package com.niyati.designpattern.structural.adapter;

public class ChromeDriver implements WebDriver {
    @Override
    public void getElement() {
        System.out.println("Get element from chrome");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from chrome");
    }

}
