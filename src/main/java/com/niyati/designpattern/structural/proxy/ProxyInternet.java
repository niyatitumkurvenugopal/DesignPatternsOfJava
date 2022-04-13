package com.niyati.designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet internet= new RealInternet();
    protected static final List<String> bannedSites;

    static {
        bannedSites=new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lmn.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception{
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access denied");
        }
        internet.connectTo(serverhost);
    }
}
