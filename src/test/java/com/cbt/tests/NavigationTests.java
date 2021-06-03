package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {


    public static void main(String[] args) {

        // Task : Automate the provided test case using 3 different browsers.
        testChrome();
        testFirefox();
        testSafari();
    }

    public static void testChrome(){
        //1. Open browser
        WebDriver driver= BrowserFactory.getDriver("chrome");
        //2. Go to website https://google.com
        driver.get("https://google.com");
        //3. Save the title in a string variable
        String titleGoogle = driver.getTitle();
        //4. Go to https://etsy.com
        driver.get("https://etsy.com");
        //5.Save the title in a string variable
        String titleEtsy = driver.getTitle();
        //6. Navigate back to previous page
        driver.navigate().back();
        //7. Verify that title is same is in step 3
        String titleGoogleBack = driver.getTitle();
        StringUtility.verifyEquals(titleGoogle,titleGoogleBack);
        //8. Navigate forward to previous page
        driver.navigate().forward();
        //9. Verify that title is same is in step 5
        String titleEtsyForward = driver.getTitle();
        StringUtility.verifyEquals(titleEtsy,titleEtsyForward);
        //Each test should close the browser after completion
        driver.quit();
    }

        public static void testFirefox() {

            WebDriver driver = BrowserFactory.getDriver("firefox");
            driver.get("https://google.com");
            String titleGoogle = driver.getTitle();
            driver.get("https://etsy.com");
            String titleEtsy = driver.getTitle();
            driver.navigate().back();
            String titleGoogleBack = driver.getTitle();
            StringUtility.verifyEquals(titleGoogle, titleGoogleBack);
            driver.navigate().forward();
            String titleEtsyForward = driver.getTitle();
            StringUtility.verifyEquals(titleEtsy, titleEtsyForward);
            driver.quit();
        }

    public static void testSafari() {

        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        String titleGoogleBack = driver.getTitle();
        StringUtility.verifyEquals(titleGoogle, titleGoogleBack);
        driver.navigate().forward();
        String titleEtsyForward = driver.getTitle();
        StringUtility.verifyEquals(titleEtsy, titleEtsyForward);
        driver.quit();
    }

}



