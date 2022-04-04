package com.niyati.designpattern.structural.proxy;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("website.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
