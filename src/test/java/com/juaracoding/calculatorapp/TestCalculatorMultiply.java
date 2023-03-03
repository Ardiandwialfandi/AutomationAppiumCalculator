package com.juaracoding.calculatorapp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestCalculatorMultiply {
    public static AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() {
        CalculatorMultiply.logCalc();
    }

    @Test
    public void addTestingAutomation(){
//        driver.findElementById("com.google.android.calculator:id/digit_1").click();
//        driver.findElementById("com.google.android.calculator:id/op_add").click();
//        driver.findElementById("com.google.android.calculator:id/digit_2").click();
//        driver.findElementById("com.google.android.calculator:id/eq").click();
//        String result = driver.findElementById("com.google.android.calculator:id/result_final").getText(
        CalculatorMultiply.locatorCalculator();
        System.out.println("Hasil dari 3 X 4 = "+CalculatorMultiply.textResult());
        Assert.assertEquals(CalculatorMultiply.textResult(), "12");
    }

    @AfterClass
    public void quitDriver(){
        CalculatorMultiply.closePageMultiply();
        System.out.println("Thank you trainer");
        System.out.println("Test Case Success, System Quit");
    }
}
