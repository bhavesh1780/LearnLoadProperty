package com.LoadProperty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Dell on 22/04/2017.
 */
public class BrowserSelector extends BasePage {

    LoadProp loadProp = new LoadProp();
    //This statement will run from Intellij
    //    String browser = loadProp.getProperty("browser");
    //This statement will run with Jenkins
    String browser = System.getProperty("browser");
//    String browser= "ie";

    public void selectBrowser(String browser){

        if (browser.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\IdeaProjects\\LearnLoadProperty\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
                    driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Users\\Dell\\IdeaProjects\\LearnLoadProperty\\src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

//            DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); caps.setCapability("ignoreZoomSetting", true);
//            caps.setCapability("nativeEvents",false);
             driver = new  InternetExplorerDriver();

        }else {
            System.out.println("Browser Name is Wrong");
        }
    }
}
