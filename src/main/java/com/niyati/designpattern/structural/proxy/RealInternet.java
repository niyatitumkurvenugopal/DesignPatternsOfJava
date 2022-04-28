package com.niyati.designpattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealInternet implements Internet {
    private static final Logger logger = LoggerFactory.getLogger(RealInternet.class);

    @Override
    public String connectTo(String serverhost) {
        logger.info("Connecting to {}", serverhost);
        return ("Access granted.");
    }
}
