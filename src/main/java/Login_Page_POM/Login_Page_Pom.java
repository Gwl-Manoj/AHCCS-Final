package Login_Page_POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Login_Page_Pom 
{
	
	public Login_Page_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login_With_Multiple_data(WebDriver driver) throws InterruptedException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Achievement Chart\\Achievement log in data.xlsx");
	    
//	     XSSFWorkbook wb = new XSSFWorkbook(file);
//	     XSSFSheet sh = wb.getSheet("Login");
//		 XSSFRow row = null;
//		 XSSFCell cell = null;
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Login");
		
		 String username = null;
		 String password = null;
		 
		 for(int i =1; i<=sh.getLastRowNum(); i++)
		 {
			 Row row=sh.getRow(i);
			 for(int j= 0; j<row.getLastCellNum(); j++)
			 {
				Cell cell = row.getCell(j);
				 
				 if(j==0)
				 {
					 username = cell.getStringCellValue();
				 }
				 if(j==1)
				 {
					 password = cell.getStringCellValue();
				 }
			 }
			 Thread.sleep(2000);
			 driver.findElement(By.id("email")).clear();
			 driver.findElement(By.id("email")).sendKeys(username);
			 
			 driver.findElement(By.id("password")).clear();
			 driver.findElement(By.id("password")).sendKeys(password);
			
			 driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
			 
			 
			 String result = null;
			 
			 try {
				 boolean emailerror = driver.findElement(By.id("email-error")).isDisplayed();
				 

				 if(emailerror==true)
				 {
					 result="Fail";
					 Reporter.log("User Name : "+username+"--->"+"password : "+password+"--->"+"Login Failed-- Please enter a valid email address. "+"--->"+result, true);
					 Reporter.log(" ", true);
				 }				
				
				 
				 }catch(Exception e)
				 {
					 
				 }
				 try
				 {
					 Boolean islogged = driver.findElement(By.xpath("//a[@href='https://enroll.grafik-stage.io/welcome/bzwo']")).isDisplayed();
					 if(islogged==true)
					 {
						 result= "Pass";
						 Reporter.log("User Name : "+username+"--->"+"password : "+password+"--->"+"Login Success  -- The Email ID & Password Matches "+"--->"+result,true);
						 Reporter.log(" ", true);
					 }

					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@href='https://enroll.grafik-stage.io/logout']")).click();
					 
					 
				 }

				 
				 
				 
				 catch(Exception e)
				 {
					 Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();
					 
					 if(iserror==true)
					 {
						 result = "Fail";
						 Reporter.log("User Name : "+username+"--->"+"password : "+password+"--->"+"Login Failed -- These credentials do not match our records."+"--->"+result,true);
						 Reporter.log(" ", true);
					 }
					 
					
					 

				 }
		 }
	}

}
