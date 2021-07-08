package com.scentbird.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties properties;
    public void ReadConfig() {
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
        String url = properties.getProperty("baseURL");
        return url;
    }

    public String getUserName() {
        String userName = properties.getProperty("userName");
        return userName;
    }

    public String getUserEmail() {
        String userEmail = properties.getProperty("userEmail");
        return userEmail;
    }

    public String getChromePatch() {
        String chromepath = properties.getProperty("chromepath");
        return chromepath;
    }

    public String getFirefoxPath() {
        String firefoxpath = properties.getProperty("firefox");
        return firefoxpath;
    }

}
