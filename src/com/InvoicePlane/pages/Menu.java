package com.InvoicePlane.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by prachi on 16/09/2016.
 */
public class Menu {

    WebDriver driver;

    public Menu(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (linkText = "Dashboard")
    WebElement lnkDashboard;

//    @FindBy (linkText = "Clients")
//    WebElement lnkClients;

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[2]/a/span")
    WebElement lnkClients;

    @FindBy (linkText = "Add Client")
    WebElement lnkAddClient;

    @FindBy (linkText = "View Clients")
    WebElement lnkViewClients;

    @FindBy (linkText = "Quotes")
    WebElement lnkQuotes;


    public void clickAddClient()
    {
        lnkClients.click();
        lnkAddClient.click();
    }

}
