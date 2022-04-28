package com.niyati.designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    protected static final List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lmn.com");
    }

    private final Internet internet = new RealInternet();

    @Override
    public String connectTo(String serverhost) {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            return ("Access Denied");
        }
        return internet.connectTo(serverhost);

    }
}
