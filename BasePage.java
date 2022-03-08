package com.nopCommerce.demo.basePage;

import com.sun.istack.internal.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;


    public WebDriver initialiseDriver(String browserName) {
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhris\\IdeaProjects\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver", "C:\\Users\\dhris\\IdeaProjects\\Selenium\\edgedriver.exe");
            driver= new EdgeDriver();

        } else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver"," C:\\Users\\dhris\\IdeaProjects\\Selenium\\geckodriver.exe");
            driver = new FirefoxDriver();

        }else {
            System.out.println(browserName + "Please enter correct browser name");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }
    public Properties initialiseProperties(){
        prop = new Properties();
        try {
            FileInputStream ip= new FileInputStream("C:\\Users\\dhris\\IdeaProjects\\untitled\\pageObjectModelFramework" +
                    "\\work\\src\\test\\TestData\\config.properties.properties");
            prop.load(ip);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
