package com.niyati.designpattern.creational.builder;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Phone p= new PhoneBuilder().setOs("Iphone").setRam(6).setBattery(3000).getPhone();
        System.out.println(p);
    }

}
