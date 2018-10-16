package homePage;


import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;
import uiActions.HomePage;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.*;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.util.logging.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.DataFormatter;
import excelReader.Excel_Reader;


public class TC003_TakinginputfromExcelandAddingtwonumbers extends TestBase {

    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    XSSFCell row;
    XSSFCell col;




public static final Logger log =Logger.getLogger(TC003_TakinginputfromExcelandAddingtwonumbers.class.getName());
HomePage homepage;
Excel_Reader excel_reader;

   @DataProvider(name="inputdata")
    public Object[][] getTestData() {
        String[][] testRecords =getData("TestData.xlsx","Sheet1");
       return testRecords;

    }

    @BeforeTest
    public void setUp() throws IOException{
        init();
    }

    @Test(dataProvider="inputdata")
    public void inputdata(int input1,int input2, String runMode){
        homepage = new HomePage(driver);

        if(runMode.equalsIgnoreCase("n")){
          throw new SkipException("user marked this record as no run");
        }
        try {
            log.info("*****Starting TC003 Test Case Exceution*******" );
            homepage.LandingPage();
            homepage. getwebpagetitle();
            captureScreen("Google ResultsPage");
            //homepage.getData("TestData.xlsx","InputTestData");



           homepage.inputfromExcel();

            captureScreen("Calculator ResultsScreen");
            log.info("*****Finished TC003 Test Case Exceution*******" );

        }
        catch(Exception e){
            log(e.fillInStackTrace().toString());
            captureScreen("FailedScreenshot");
        }
    }












}











































































































