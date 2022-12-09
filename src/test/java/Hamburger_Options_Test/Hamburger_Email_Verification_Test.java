package Hamburger_Options_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Hamburger_Options.Home_Page_Email_Verification_Pom;
import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;

public class Hamburger_Email_Verification_Test extends Achievement_Charter_Excel_Data_BaseClass
{

	int TCID;
	Pom_classes.Login_Pom login;
	Home_Page_Email_Verification_Pom Home_Page;
	
	
	
	@Parameters("browsername")
	@BeforeClass
	public void OpenBrowser(String browsername) throws InterruptedException
	{
		open_browser(browsername);	
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Home_Page_Email_Verification_Pom(driver);
		
		
		
		
	}
	
	@Test()
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=1;
		login.setLogin_PomUsername(Utility.getdata(1, 1)); 
		login.setLogin_Pompassword(Utility.getdata(2, 1)); 
		login.clickLogin_Pombtn();
	}
	
	
	@Test(priority=1)
	public void Home_Page() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Home_Page.Verify_Email(driver);
		
		
	}
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}

}
