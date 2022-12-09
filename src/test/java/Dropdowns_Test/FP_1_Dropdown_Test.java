package Dropdowns_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Dropdowns_Pom.FP_1_Dropdowns_Pom;
import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;
import Pom_classes.Home_Page_Pom;

public class FP_1_Dropdown_Test extends Achievement_Charter_Excel_Data_BaseClass
{

	int TCID;
	Pom_classes.Login_Pom login;
	Home_Page_Pom Home_Page;
	FP_1_Dropdowns_Pom Form;
	
	
	
	
	@Parameters("browsername")
	@BeforeMethod
	public void OpenBrowser(String browsername) throws InterruptedException
	{
		open_browser(browsername);	
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Home_Page_Pom(driver);
		Form = new 	FP_1_Dropdowns_Pom(driver);
		
	}
	
	@Test
	public void Verify_State_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.set_State(driver);
	}
	
//	@Test
//	public void Verify_DateofBirth_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//		
//		Home_Page.Home_Page(driver);
//		
//		Form.setDateofBirth_Year(driver);
//	}
	
	@Test
	public void Verify_Sex_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Verify_Sex(driver);
	}
	
	@Test
	public void Verify_County_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Set_country(driver);
	}
	
	@Test
	public void Verify_State_Mailing_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.set_State_Mailing_address(driver);

	}
	
	@Test
	public void Verify_Country_Mailing_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);

		Form.set_Country_Mailing_Address(driver);
	}
	
	@Test
	public void Verify_Grade_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);

		Form.set_Grade(driver);
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
}

