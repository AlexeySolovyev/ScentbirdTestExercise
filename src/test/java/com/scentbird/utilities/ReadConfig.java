package com.scentbird.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties properties;

    public ReadConfig() {
        File src = new File("./Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            properties = new Properties();
            properties.load(fis);
        } catch(Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    public String getURL() {
        return properties.getProperty("baseURL");
    }

    public String getChromePath() {
        return properties.getProperty("chromepath");
    }

    public String getFirefoxPath() {
        return properties.getProperty("firefox");
    }

}
