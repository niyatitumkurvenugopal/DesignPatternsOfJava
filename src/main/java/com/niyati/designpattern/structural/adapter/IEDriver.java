package com.niyati.designpattern.structural.adapter;

public class IEDriver {

    public static final String CLICK_ELEMENT_FROM_IEDRIVER = "click element from IEDriver";
    public static final String FIND_ELEMENT_FROM_IEDRIVER = "Find element from IEDriver";

    public String findElement() {
        return FIND_ELEMENT_FROM_IEDRIVER;

    }

    public String clickElement() {
        return CLICK_ELEMENT_FROM_IEDRIVER;
    }
}
