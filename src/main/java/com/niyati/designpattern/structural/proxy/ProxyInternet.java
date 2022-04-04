package com.niyati.designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet internet= new RealInternet();
    private static List<String> bannedsites;

    static {
        bannedsites=new ArrayList<String>();
        bannedsites.add("abc.com");
        bannedsites.add("def.com");
        bannedsites.add("ijk.com");
        bannedsites.add("lmn.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception{
        if(bannedsites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access denied");
        }
        internet.connectTo(serverhost);
    }
}
