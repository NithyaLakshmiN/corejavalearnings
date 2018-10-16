package uiActions;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven{
	WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
    
	 
    @BeforeTest
	public void TestSetup(){
	    // To set the path of the Chrome driver.
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		 driver = new ChromeDriver();
	     
	    // To launch Google
	    driver.get("https://www.google.com/");
	    // To maximize the browser
	    driver.manage().window().maximize();
	    // implicit wait
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("lst-ib")).sendKeys("Calculator");
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]")).click();
	    
    }
		  
	@Test
	public void ReadData() throws IOException, Exception{		
		
		// Import excel sheet.
		File src=new File("C:\\Users\\santhosh\\Documents\\Nithya\\TestData.xlsx");		  
		// Load the file.
		FileInputStream fis = new FileInputStream(src);
		// Load he workbook.
		workbook = new XSSFWorkbook(fis);
		// Load the sheet in which data is stored.
		sheet= workbook.getSheet("Sheet1");
		
		for(int i=1; i<=sheet.getLastRowNum(); i++){
			/*I have added test data in the cell A2 as "44" and B2 as "45"
			Cell A2 = row 1 and column 0. It reads first row as 0, second row as 1 and so on 
			and first column (A) as 0 and second column (B) as 1 and so on*/ 
		
			// Import data for Input1.
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			
			driver.findElement(By.cssSelector("div.cwtlotc")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.cssSelector("#cwbt46 .cwbts")).click();
			 
			// Import data for Input2.
			cell = sheet.getRow(i).getCell(1);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.cssSelector("div.cwtlotc")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.cssSelector(".cwbb-tpl > .cwbts")).click();

			//To write data in the excel
			FileOutputStream fos=new FileOutputStream(src);
			// Message to be written in the excel sheet
		    String message = "Pass";
		    // Create cell where data needs to be written.
		    sheet.getRow(i).createCell(2).setCellValue(message);
		        
		    // finally write content
		    workbook.write(fos);
			
			// close the file
			fos.close();
		        
		  
		        
			}
	}
}
