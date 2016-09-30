package com.InvoicePlane.pages.clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by prachi on 15/09/2016.
 */
public class ViewClients {

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[2]/a/span")
    WebElement Clients;

    @FindBy (xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[2]/ul/li[2]/a")
    WebElement lnkViewClints;

    @FindBy (xpath = ".//*[@id='headerbar']/h1")
    WebElement lblClientForm;

    @FindBy (xpath = ".//*[@id='headerbar']/div[3]/ul/li[1]/a")
    WebElement btnActive;

    @FindBy (xpath = ".//*[@id='headerbar']/div[3]/ul/li[2]/a")
    WebElement btnInactive;

    @FindBy (xpath = ".//*[@id='headerbar']/div[3]/ul/li[3]/a")
    WebElement btnAll;

    @FindBy (xpath = ".//*[@id='headerbar']/div[2]/div")
    WebElement btnGroup;

    @FindBy (xpath = ".//*[@id='headerbar']/div[1]/a")
    WebElement btnNew;

    @FindBy (xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[1]")
    WebElement lblClientName;

    @FindBy (xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[2]")
    WebElement lblEmailAddress;

    @FindBy (xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[3]")
    WebElement lblPhoneNumber;

    @FindBy (xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[4]")
    WebElement lblBalance;

    @FindBy (xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[5]")
    WebElement lblActive;

    @FindBy (xpath = ".//*[@id='filter_results']/div/table/thead/tr/th[6]")
    WebElement lblOptions;



    WebDriver driver;
    public ViewClients(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        if(!lblClientForm.isDisplayed())
        {
            throw new IllegalStateException("Thos is not View Client Page");
        }
    }


    public String getClientName()
    {
        return lblClientName.getText();
    }

    public String getEmailAddress()
    {
        return lblEmailAddress.getText();
    }

    public String getPhoneNumber()
    {
        return lblPhoneNumber.getText();
    }

    public String getBalance()
    {
        return lblBalance.getText();
    }

    public String getActive()
    {
        return lblActive.getText();
    }

    public String getOptions()
    {
        return lblOptions.getText();
    }




}
