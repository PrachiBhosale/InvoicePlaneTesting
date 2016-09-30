package com.InvoicePlane.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by prachi on 14/09/2016.
 */
public class Login {

    @FindBy (xpath=".//*[@id='email']")
    WebElement txtUsername;

    @FindBy (xpath = ".//*[@id='password']")
    WebElement txtPassword;

    @FindBy (xpath = ".//*[@id='login']/form/input")
    WebElement btnLogin;

    @FindBy (xpath = ".//*[@id='login']/div[2]/small/a")
    WebElement lnkForgetPassword;

    WebDriver driver;

    public Login(WebDriver driver, String url)
    {
        this.driver = driver;
        driver.get(url);


        PageFactory.initElements(driver, this);
        if (!btnLogin.isDisplayed()) {
            throw new IllegalStateException("This is not Login Page");
        }
    }



    public void clickLoginButton()
    {
        btnLogin.click();
    }

    public void clickForgotPassword()
    {
        lnkForgetPassword.click();
    }

    public void setTxtUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

}
