package com.nopCommerce.demo.basePage;


import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;
    Utils utils;

    By email = By.id("Email");
    By pwd = By.id("Password");
    By login = By.className("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        utils = new Utils(driver);

    }
    public void doLogin(String emailId,String password){
        utils.doSendKeys(email,emailId);
        utils.doSendKeys(pwd,password);
        utils.doClick(login);

    }
}
