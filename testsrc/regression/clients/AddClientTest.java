package regression.clients;

import com.InvoicePlane.pages.Login;
import com.InvoicePlane.pages.Menu;
import com.InvoicePlane.pages.clients.AddClient;
import com.InvoicePlane.utilities.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import static com.InvoicePlane.utilities.TakeScreenShot.takeScreenshot;

/**
 * Created by prachi on 16/09/2016.
 */
public class AddClientTest {


    WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);


    @BeforeClass
    public void login()
    {
       // ExtentReports logger = new ExtentReports("E:\\InvoicePlane\\Extended-reports\\report.html", false);
     //   ExtentTest test = logger.startTest("Verify Page title", "to verify the page title");

        ResourceBundle rbUrl = ResourceBundle.getBundle("InvoicePlane");
        String url=rbUrl.getString("url");
        Login login = new Login(driver,url);
        login.setTxtUsername("prachib.321@gmail.com");
       // test.log(LogStatus.INFO, "UserName is set");

        login.setTxtPassword("prachibhosale");
       // test.log(LogStatus.INFO, "Password is set");

        login.clickLoginButton();
       // test.log(LogStatus.INFO, "Clicked on Login Button");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }


    @DataProvider
    public Object[][] getAddClientData() throws IOException
    {
        //Rows - Number of times your test has to be repeated.
        //Columns - Number of parameters in test data.


        FileInputStream fileInputStream = new FileInputStream("ExcelSheets/InvoicePlane1.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
        HSSFSheet worksheet = workbook.getSheet("AddClient");


        int rowCount = worksheet.getPhysicalNumberOfRows();

        String [][]data =new String[rowCount-1][16];

        for(int i=1; i<rowCount;i++)
        {
            HSSFRow row = worksheet.getRow(i);

//            DataFormatter format = new DataFormatter();

            HSSFCell userName = row.getCell(0);
            if(userName == null) {
                data[i-1][0] = "";
            }
            else {
                userName.setCellType(Cell.CELL_TYPE_STRING);
                 data[i-1][0] = userName.getStringCellValue();
            }


            HSSFCell streetAddress1 = row.getCell(1);
            if(streetAddress1 == null) {
                data[i-1][1] = "";
            }
            else {
                streetAddress1.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][1] = streetAddress1.getStringCellValue();
            }


            HSSFCell streetAddress2 = row.getCell(2);
            if(streetAddress2 == null)
                data[i-1][2] = "";
            else {
                streetAddress2.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][2] = streetAddress2.getStringCellValue();
            }


            HSSFCell city = row.getCell(3);
            if(city == null) {
                data[i-1][3] = "";
            }
            else {
                city.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][3] = city.getStringCellValue();
            }


            HSSFCell state = row.getCell(4);
            if(state == null) {
                data[i-1][4] = "";
            }
            else {
                state.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][4] = state.getStringCellValue();
            }


            HSSFCell zipCode = row.getCell(5);
            if (zipCode == null)
                data[i-1][5]="";
            else {
                zipCode.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][5] = zipCode.getStringCellValue();
            }


            HSSFCell country = row.getCell(6);
            if(country == null) {
                data[i-1][6] = "";
            }
            else {
                country.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][6] = country.getStringCellValue();
            }


            HSSFCell phoneNo = row.getCell(7);
            if(phoneNo == null) {
                data[i-1][7] = "";
            }
            else {
                phoneNo.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][7] = phoneNo.getStringCellValue();
            }


            HSSFCell faxNo = row.getCell(8);
            if(faxNo == null)
                data[i-1][8] ="";
            else {
                faxNo.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][8] = faxNo.getStringCellValue();
            }


            HSSFCell mobileNo = row.getCell(9);
            if(mobileNo == null)
                data[i-1][9] ="";
            else {
                mobileNo.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][9] = mobileNo.getStringCellValue();
            }

            HSSFCell email = row.getCell(10);
            if(email == null) {
                data[i-1][10] = "";
            }
            else {
                email.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][10] = email.getStringCellValue();
            }


            HSSFCell webAddress = row.getCell(11);
            if(webAddress == null) {
                data[i-1][11] = "";
            }
            else {
                webAddress.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][11] = webAddress.getStringCellValue();
            }


            HSSFCell vat = row.getCell(12);
            if(vat == null) {
                data[i-1][12] = "";
            }
            else {
                vat.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][12] = vat.getStringCellValue();
            }

            HSSFCell taxes = row.getCell(13);
            if(taxes == null) {
                data[i-1][13] = "";
            }
            else {
                taxes.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][13] = taxes.getStringCellValue();
            }


            HSSFCell expRes = row.getCell(14);
            if(expRes == null) {
                data[i-1][14]="";
            }
            else{

                DataFormatter fmt = new DataFormatter();
               // expRes.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][14] = fmt.formatCellValue(expRes);//expRes.getStringCellValue();
            }

            HSSFCell xpathActualRes = row.getCell(15);
            if(xpathActualRes == null) {
                data[i-1][15]="";
            }
            else{
                xpathActualRes.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][15] = xpathActualRes.getStringCellValue();
            }

        }

        return data;
    }



    // Data is accessed from ExcelSheet

    @Test(dataProvider = "getAddClientData")
    public void addclient(String userName, String streetAdd1, String streetAdd2,String city, String state, String zipCode,String country,String ph, String fax, String mobile,String email, String webAdd, String vat, String tax,String expectedResult, String xpathActualResult) throws IOException {
        ExtentReports logger = new ExtentReports("C:\\Users\\prachi\\IdeaProjects\\InvoicePlaneTesting\\Extended-reports\\report.html", false);

        ExtentTest test = logger.startTest("Test AddClient | Expected:" + expectedResult, "To test the Add client form | Expected Result:" + expectedResult);

        try {

            Menu menu = new Menu(driver);

            menu.clickAddClient();
            test.log(LogStatus.INFO, "Clicked on Add Client Link");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            AddClient addClient = new AddClient(driver);

            addClient.setTxtClientName(userName);
            test.log(LogStatus.INFO, "Username is set");

            addClient.setTxtStreetAddress(streetAdd1);
            test.log(LogStatus.INFO, "Street Address1 is set");

            addClient.setTxtStreetAddress2(streetAdd2);
            test.log(LogStatus.INFO, "StreetAddress2 is set");

            addClient.setTxtCity(city);
            test.log(LogStatus.INFO, "City is set");

            addClient.setTxtState(state);
            test.log(LogStatus.INFO, "State is set");

            addClient.setTxtZipCode(zipCode);
            test.log(LogStatus.INFO, "Zip Code is set");

            addClient.setCountry(country);
            test.log(LogStatus.INFO, "Country is set");

            addClient.setTxtPhoneNumber(ph);
            test.log(LogStatus.INFO, "Phone Number is set");

            addClient.setTxtFaxNumber(fax);
            test.log(LogStatus.INFO, "Fax Number is set");

            addClient.setTxtMobileNumber(mobile);
            test.log(LogStatus.INFO, "Mobile is set");

            addClient.setTxtEmailAddress(email);
            test.log(LogStatus.INFO, "Email is set");

            addClient.setTxtWebAddress(webAdd);
            test.log(LogStatus.INFO, "Web Address is set");

            addClient.setTxtVatId(vat);
            test.log(LogStatus.INFO, "VAT is set");

            addClient.setTxtTaxesCode(tax);
            test.log(LogStatus.INFO, "TAX is set");

            addClient.clickSaveButton();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

            String expectedStr = expectedResult;

            String actualResult = driver.findElement(By.xpath(xpathActualResult)).getText();
            try {

                Assert.assertEquals(actualResult,expectedStr);
            }
            catch (AssertionError e)
            {
                test.log(LogStatus.FAIL,"Test Fail "+e);
                test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));

            }
        }
        catch (Throwable t)
        {
            test.log(LogStatus.ERROR,"Script Error: "+t);
            test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));

        }
        logger.endTest(test);
        logger.flush();
        }

}
