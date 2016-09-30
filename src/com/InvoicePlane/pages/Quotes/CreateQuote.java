package com.InvoicePlane.pages.Quotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by prachi on 15/09/2016.
 */
public class CreateQuote {

    @FindBy (xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[3]/a/span")
    WebElement Quotes;

    @FindBy (xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[3]/ul/li[1]/a")
    WebElement lnkCreateQuote;

    @FindBy (xpath = ".//*[@id='create-quote']/form/div[1]/h3")
    WebElement lblCreateQuoteForm;

    @FindBy (xpath = ".//*[@id='create-quote']/form/div[1]/a/i")
    WebElement btnClose;

    @FindBy (xpath = ".//*[@id='create-quote']/form/div[2]/div[1]/label")
    WebElement lblClient;

    @FindBy (xpath = ".//*[@id='create-quote']/form/div[2]/div[1]/span/span[1]/span")
    WebElement drpdownClient;

    @FindBy (xpath = ".//*[@id='create-quote']/form/div[2]/div[2]/label")
    WebElement lblQuoteDate;

    @FindBy (xpath = ".//*[@id='quote_date_created']")
    WebElement txtQuoteDate;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[2]/th[2]")
    WebElement lnkMonthYear;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[2]/th[1]")
    WebElement btnPrev;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[2]/th[3]")
    WebElement btnNext;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[3]/th[1]")
    WebElement lblSunday;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[3]/th[2]")
    WebElement lblMonday;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[3]/th[3]")
    WebElement lblTuesday;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[3]/th[4]")
    WebElement lblWednesday;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[3]/th[5]")
    WebElement lblThursday;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[3]/th[6]")
    WebElement Friday;

    @FindBy (xpath = "html/body/div[5]/div[1]/table/thead/tr[3]/th[7]")
    WebElement Saturday;


    // Write for Days also??

//    @FindBy (xpath = "")
//    WebElement
//
//    @FindBy (xpath = "")
//            WebElement
//
//    @FindBy (xpath = "")
//    WebElement
//
//    @FindBy (xpath = "")
//            WebElement
//
//    @FindBy (xpath = "")
//    WebElement
//
//    @FindBy (xpath = "")
//            WebElement


    @FindBy (xpath = "html/body/div[5]/div[2]/table/thead/tr[2]/th[2]")
    WebElement lnkYear;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/thead/tr[2]/th[1]")
    WebElement btnPrev1;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/thead/tr[2]/th[3]")
    WebElement btnNext1;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[1]")
    WebElement lnkJanuary;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[2]")
    WebElement lnkFebruary;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[3]")
    WebElement lnkMarch;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[4]")
    WebElement lnkApril;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[5]")
    WebElement lnkMay;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[6]")
    WebElement lnkJune;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[7]")
    WebElement lnkJuly;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[8]")
    WebElement lnkAugust;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[9]")
    WebElement lnkSeptember;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[10]")
    WebElement lnkOctober;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[11]")
    WebElement lnkNovember;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tbody/tr/td/span[12]")
    WebElement lnkDecember;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tfoot/tr[1]/th")
    WebElement lnkToday;

    @FindBy (xpath = "html/body/div[5]/div[2]/table/tfoot/tr[1]/th")
    WebElement lblQuotePassword;

    @FindBy (xpath = ".//*[@id='quote_password']")
    WebElement txtQuotePassword;

    @FindBy (xpath = ".//*[@id='create-quote']/form/div[2]/div[4]/label")
    WebElement lblInvoiceGroup;

    @FindBy (xpath = ".//*[@id='invoice_group_id']")
    WebElement drpdownInvoiceGroup;

    @FindBy (xpath = ".//*[@id='create-quote']/form/div[3]/div/button[1]")
    WebElement btnCancel;

    @FindBy (xpath = ".//*[@id='quote_create_confirm']")
    WebElement btnSubmit;


    WebDriver driver;

    public CreateQuote(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);
        if(!lblCreateQuoteForm.isDisplayed())
        {
            throw new IllegalStateException("This is not Create Quote Page");
        }
    }


    public String getClient()
    {
        return lblClient.getText();
    }

   public void setDrpdownClient()
   {
   }








}
