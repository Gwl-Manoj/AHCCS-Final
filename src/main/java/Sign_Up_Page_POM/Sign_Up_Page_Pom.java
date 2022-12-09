package Sign_Up_Page_POM;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Sign_Up_Page_Pom 
{
	
	public Sign_Up_Page_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SignUp_With_Multiple_data(WebDriver driver) throws InterruptedException, IOException 
	{
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		Thread.sleep(2000);

		Sheet sh = Utility.getmultipledata("SignUp");
		 String username = null;
		 String password = null;
		 String cpassword=null;
		 
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
				 if(j==2)
				 {
					 cpassword = cell.getStringCellValue();
				 }
			 }
			 Thread.sleep(2000);
			 driver.findElement(By.id("email")).clear();
			 driver.findElement(By.id("email")).sendKeys(username);
			 
			 driver.findElement(By.id("password")).clear();
			 driver.findElement(By.id("password")).sendKeys(password);
			 
			 driver.findElement(By.id("password-confirm")).clear();
			 driver.findElement(By.id("password-confirm")).sendKeys(cpassword);
			
			 driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
			 
			 
			 String result = null;
			 
			 try {
				 boolean emailerror = driver.findElement(By.id("email-error")).isDisplayed();
				 String text = driver.findElement(By.id("email-error")).getText();

				 if(emailerror==true)
				 {
					 result="Fail";
					 Reporter.log("User Name : "+username+"--->"+"password : "+password+" C Password : "+cpassword+" ---> "+text+"--->"+result, true);
					 Reporter.log(" ", true);
				 }				
				
				 
				 }catch(Exception e)
				 {
					 
				 }
				 try
				 {
					 Boolean islogged = driver.findElement(By.xpath("//a[text()='Start The Enrollment Process']")).isDisplayed();
					 if(islogged==true)
					 {
						 result= "Pass";
						 Reporter.log("User Name : "+username+"--->"+"password : "+password+" C Password : "+cpassword+"--->"+"Sign Up Success"+"--->"+result,true);
						 Reporter.log(" ", true);
					 }

					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//a[@href='https://enroll.grafik-stage.io/logout']")).click();
					 
					 
				 }

				 catch(Exception e)
				 {
					
				 }
				 
				 try
				 {
					 Boolean iserror = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).isDisplayed();
					 String text = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).getText();
					 
					 if(iserror==true)
					 {
						 result = "Fail";
						 Reporter.log("User Name : "+username+"--->"+"password : "+password+" C Password : "+cpassword+"--->"+text+" --> "+result,true);
						 Reporter.log(" ", true);
					 } 
				 }
				 catch(Exception e)
				 {
					

				 }
				 
				 try
				 {
					 Boolean iserror = driver.findElement(By.id("password-confirm-error")).isDisplayed();
					 String text = driver.findElement(By.id("password-confirm-error")).getText();
					 
					 if(iserror==true)
					 {
						 result = "Fail";
						 Reporter.log("User Name : "+username+"--->"+"password : "+" C Password : "+cpassword+"--->"+text+" --> "+"--->"+result,true);
						 Reporter.log(" ", true);
					 } 
				 }
				 catch(Exception e)
				 {
					

				 }
				 
		 }
	}


}
