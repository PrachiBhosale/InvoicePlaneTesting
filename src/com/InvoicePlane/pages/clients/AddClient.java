package com.InvoicePlane.pages.clients;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by prachi on 14/09/2016.
 */
public class AddClient {

    @FindBy(xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[2]/a/span")
    WebElement Clients;

    @FindBy (xpath = ".//*[@id='ip-navbar-collapse']/ul[1]/li[2]/ul/li[1]/a")
    WebElement lnkAddClient;

    @FindBy (xpath = ".//*[@id='headerbar']/h1")
    WebElement lblClientForm;

    @FindBy (xpath = ".//*[@id='content']/fieldset/legend")
    WebElement lblPersonalInformation;

    @FindBy (xpath = ".//*[@id='content']/fieldset/div/span")
    WebElement chkboxActive;

    @FindBy (xpath = ".//*[@id='client_name']")
    WebElement txtClientName;

    @FindBy (xpath = ".//*[@id='content']/div/div[1]/fieldset/legend")
    WebElement lblAddress;

    @FindBy (xpath = ".//*[@id='content']/div/div[1]/fieldset/div[1]/label")
    WebElement lblStreetAddress;

    @FindBy (xpath = ".//*[@id='client_address_1']")
    WebElement txtStreetAddress;

    @FindBy (xpath = ".//*[@id='content']/div/div[1]/fieldset/div[2]/label")
    WebElement lblStreetAddress2;

    @FindBy (xpath = ".//*[@id='client_address_2']")
    WebElement txtStreetAddress2;

    @FindBy (xpath = ".//*[@id='content']/div/div[1]/fieldset/div[3]/label")
    WebElement lblCity;

    @FindBy (xpath = ".//*[@id='client_city']")
    WebElement txtCity;

    @FindBy (xpath = ".//*[@id='content']/div/div[1]/fieldset/div[4]/label")
    WebElement lblState;

    @FindBy (xpath = ".//*[@id='client_state']")
    WebElement txtState;

    @FindBy (xpath = ".//*[@id='content']/div/div[1]/fieldset/div[5]/label")
    WebElement lblZipCode;

    @FindBy (xpath = ".//*[@id='client_zip']")
    WebElement txtZipCode;

    @FindBy (xpath = ".//*[@id='select2-client_country-container']")
    WebElement containerCountry;

    @FindBy (xpath = ".//*[@id='content']/div/div[1]/fieldset/div[6]/label")
    WebElement lblCountry;

    @FindBy (xpath = "//input[@class='select2-search__field' ]")
    WebElement inputCountry;


    @FindBy (xpath = ".//*[@id='content']/div/div[2]/fieldset/legend")
    WebElement lblContactInformation;

    @FindBy (xpath = ".//*[@id='content']/div/div[2]/fieldset/div[1]/label")
    WebElement lblPhoneNumber;

    @FindBy (xpath = ".//*[@id='client_phone']")
    WebElement txtPhoneNumber;

    @FindBy (xpath = ".//*[@id='client_phone']")
    WebElement lblFaxNumber;

    @FindBy (xpath = ".//*[@id='client_fax']")
    WebElement txtFaxNumber;

    @FindBy (xpath = ".//*[@id='client_fax']")
    WebElement lblMobileNumber;

    @FindBy(xpath = ".//*[@id='client_mobile']")
    WebElement txtMobileNumber;

    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/div[4]/label")
    WebElement lblEmailAddress;

    @FindBy(xpath = ".//*[@id='client_email']")
    WebElement txtEmailAddress;

    @FindBy(xpath = ".//*[@id='content']/div/div[2]/fieldset/div[5]/label")
    WebElement lblWebAddress;

    @FindBy(xpath = ".//*[@id='client_web']")
    WebElement txtWebAddress;

    @FindBy(xpath = ".//*[@id='content']/div/div[3]/fieldset/legend")
    WebElement lblTaxInformation;

    @FindBy(xpath = "//*[@id='content']/div/div[3]/fieldset/div[1]/label")
    WebElement lblVatId;

    @FindBy(xpath = ".//*[@id='client_vat_id']")
    WebElement txtVatId;

    @FindBy (xpath = ".//*[@id='content']/div/div[3]/fieldset/div[2]/label")
    WebElement lblTaxesCode;

    @FindBy (xpath = ".//*[@id='client_tax_code']")
    WebElement txtTaxesCode;

    @FindBy (xpath = ".//*[@id='btn-submit']")
    WebElement btnSave;

    @FindBy (xpath = ".//*[@id='btn-cancel']")
    WebElement btnCancel;

    @FindBy (xpath = ".//*[@id='ip-navbar-collapse']/ul[2]/li[4]/a/i")
    WebElement btnLogout;



    WebDriver driver;

    public AddClient(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);


        if(!lblClientForm.isDisplayed())
        {
            throw new IllegalStateException("This is not Add Client Page");
        }



    }

    public String getPersonalInformation()
    {
        return lblPersonalInformation.getText();
    }

    public void setTxtClientName(String ClientName)
    {
        txtClientName.sendKeys(ClientName);
    }


    public String getAddress()
    {
        return lblAddress.getText();
    }


    public String getStreetAddress()
    {
        return txtStreetAddress.getText();
    }

    public void setTxtStreetAddress(String StreetAddress)
    {
        txtStreetAddress.sendKeys(StreetAddress);
    }


    public String getStreetAddress2()
    {
        return txtStreetAddress2.getText();
    }

    public void setTxtStreetAddress2(String StreetAddress2)
    {
        txtStreetAddress2.sendKeys(StreetAddress2);
    }


    public String getCity()
    {
        return txtCity.getText();
    }

    public void setTxtCity(String City)
    {
        txtCity.sendKeys(City);
    }


    public String getState()
    {
        return txtState.getText();
    }

    public void setTxtState(String State)
    {
        txtState.sendKeys(State);
    }


    public String getZipCode()
    {
        return txtZipCode.getText();
    }

    public void setTxtZipCode(String ZipCode)
    {
        txtZipCode.sendKeys(ZipCode);
    }


    public void setCountry(String country)
    {
         containerCountry.click();
        inputCountry.sendKeys(country);
    }


    public String getPhoneNumber()
    {
        return txtPhoneNumber.getText();
    }

    public void setTxtPhoneNumber(String PhoneNumber)
    {
        txtPhoneNumber.sendKeys(PhoneNumber);
    }


    public String getFaxNumber()
    {
        return txtFaxNumber.getText();
    }

    public void setTxtFaxNumber(String FaxNumber)
    {
        txtFaxNumber.sendKeys(FaxNumber);
    }


    public String getMobileNumber()
    {
        return txtMobileNumber.getText();
    }

    public void setTxtMobileNumber(String MobileNumber)
    {
        txtMobileNumber.sendKeys(MobileNumber);
    }


    public String getEmailAddress()
    {
        return txtEmailAddress.getText();
    }

    public void setTxtEmailAddress(String EmailAddress)
    {
        txtEmailAddress.sendKeys(EmailAddress);
    }


    public String getWebAddress()
    {
        return txtWebAddress.getText();
    }

    public void setTxtWebAddress(String WebAddress)
    {
        txtWebAddress.sendKeys(WebAddress);
    }


    public String getVatId()
    {
        return txtVatId.getText();
    }

    public void setTxtVatId(String VadId)
    {
        txtVatId.sendKeys(VadId);
    }


    public String getTaxesCode()
    {
        return txtTaxesCode.getText();
    }

    public void setTxtTaxesCode(String TaxesCode)
    {
        txtTaxesCode.sendKeys(TaxesCode);
    }


    public void clickSaveButton()
    {

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", btnSave);
       // btnSave.click();
    }

    public void clickCancelButton()
    {
        btnCancel.click();
    }
}
