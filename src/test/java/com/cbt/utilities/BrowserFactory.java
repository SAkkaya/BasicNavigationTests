package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;

public class BrowserFactory {

    //Task :

    /*  1. Create class BrowserFactory under utilities package.
        2. Create a public static method getDriver which takes a string argument.
        3. If you are using Windows, and if the String argument is `safari`, return null. If
    you are using Mac, and if the String argument is `edge`, return null.
    NOTE For this step, you need to research how to find out your operating
    system programmatically using Java.
         4. In all other cases, return a new WebDriver object for ChromeDriver,
    FirefoxDriver, EdgeDriver or SafariDriver based on the value of the string
    argument.
    NOTE For this exercise, you need to research how to launch Edge using
    Selenium if you are using Windows.
    NOTE For this exercise, you need to research how to launch Safari using
    Selenium if you are using Mac.
         5. Create class StringUtility under utilities package.
         6. Create a public static method verifyEquals which takes two string arguments,
    expected and actual.
         7. The method prints `PASS` if both strings are equals to each other. Else it prints
`FAIL` and it also prints the values of both arguments.


    //Write a static method that takes a  string parameter name : browserType
    //based on the value of parameter
    //it will setup the browser and
    // the method will return chromedriver or firefoxdriver object.
    // name of the method : getDriver

     */

    public static WebDriver getDriver(String browser) {

        WebDriver driver=null;

        if (browser.toLowerCase().equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            return driver;
            // return new ChromeDriver();     //==> lazy method

        }


        if (browser.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }


        if (browser.toLowerCase().equals("edge") && System.getProperty("os.name").contains("Windows")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }

        if (browser.toLowerCase().equals("safari") && System.getProperty("os.name").contains("Mac")) {
            ///WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        }else{
            return driver;
        }

    }
}


