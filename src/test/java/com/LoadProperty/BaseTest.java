package com.LoadProperty;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple BasePage.
 */
public class BaseTest extends BasePage

    {
    BrowserSelector browserSelector = new BrowserSelector();

   @Parameters({"browser"})
   @BeforeMethod
    public void openBrowser(String browser){
       browserSelector.selectBrowser(browser);
       driver.manage().deleteAllCookies();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://demo.nopcommerce.com/");

   }

   @AfterMethod
    public void closeBrowser(){
        driver.quit();
   }
}
