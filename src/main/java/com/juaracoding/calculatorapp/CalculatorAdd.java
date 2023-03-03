package com.juaracoding.calculatorapp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class CalculatorAdd {
    private static AndroidDriver<MobileElement> driver;

    public static void logCap()  {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Infinix X6812B");
        capabilities.setCapability("udid","07326251A4001041");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","11.0");
        capabilities.setCapability("appPackage","com.google.android.calculator");
        capabilities.setCapability("deviceName","Infinix X6812B");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

        URL url = null;
        try {
            url = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver = new AndroidDriver<>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public static void locatorCalculator() {
        MobileElement one = driver.findElementById("com.google.android.calculator:id/digit_1");
        MobileElement plus = driver.findElementById("com.google.android.calculator:id/op_add");
        MobileElement two = driver.findElementById("com.google.android.calculator:id/digit_2");
        MobileElement equal = driver.findElementById("com.google.android.calculator:id/eq");
        one.click();
        plus.click();
        two.click();
        equal.click();
    }

    public static String textResult() {
        MobileElement result =driver.findElementById("com.google.android.calculator:id/result_final");
        return result.getText();
    }


    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closePageAdd(){
        driver.quit();
    }

}
