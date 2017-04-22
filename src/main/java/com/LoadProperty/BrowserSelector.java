package com.LoadProperty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Dell on 22/04/2017.
 */
public class BrowserSelector extends BasePage {

    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");


    public void selectBrowser(){

        if (browser.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\IdeaProjects\\LearnLoadProperty\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
                    driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Users\\Dell\\IdeaProjects\\LearnLoadProperty\\src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
                 driver = new InternetExplorerDriver();
        }else {
            System.out.println("Browser Name is Wrong");
        }
    }
}
