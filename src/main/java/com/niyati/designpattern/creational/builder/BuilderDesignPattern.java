package com.niyati.designpattern.creational.builder;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setOs("Iphone");
        phone.setRam(6);
        phone.setBattery(3000);
        System.out.println(phone);
    }

}
