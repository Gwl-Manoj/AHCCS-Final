package Dropdowns_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Dropdowns_Pom.FP_3_Dropdowns_Pom;
import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;
import Pom_classes.Form_Page_2_Pom;
import Pom_classes.Home_Page_Pom;

public class FP_3_Dropdown_Test extends Achievement_Charter_Excel_Data_BaseClass
{

	int TCID;
	Pom_classes.Login_Pom login;
	Home_Page_Pom Home_Page;
	Pom_classes.Form_Page_1_Pom Form;
	Form_Page_2_Pom Form2;
	FP_3_Dropdowns_Pom Form3;
	
	
	
	
	@Parameters("browsername")
	@BeforeMethod
	public void OpenBrowser(String browsername) throws InterruptedException
	{
		open_browser(browsername);	
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Home_Page_Pom(driver);
		Form = new 	Pom_classes.Form_Page_1_Pom(driver);
		Form2 = new Form_Page_2_Pom(driver);
		Form3 = new FP_3_Dropdowns_Pom(driver);
		
	}
	
	@Test
	public void Verify_Child_Lives_with_Both_Parents_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
	
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.set_Child_Lives_with_Both_Parents(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1), Utility.getdata(17,3), Utility.getdata(18,3), Utility.getdata(19,3), Utility.getdata(20,3), Utility.getdata(21,3), Utility.getdata(22,3));
	
		
	}
	
	@Test
	public void Verify_Child_Lives_with_Both_Parents_Alternately_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
	
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.set_Child_Lives_with_Both_Parents_Alternately(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1), Utility.getdata(17,3), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1) );
	}
	
	@Test
	public void Verify_Child_Lives_with_Mother_Only_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
	
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.set_Child_Lives_with_Mother_Only(driver, Utility.getdata(17,3), Utility.getdata(18,3), Utility.getdata(19,3), Utility.getdata(20,3), Utility.getdata(21,3), Utility.getdata(22,3));
	
	}
	
	@Test
	public void Verify_Child_Lives_with_Father_Only_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
	
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.set_Child_Lives_with_Father_Only(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
		
	}
	
	@Test
	public void Verify_Child_Lives_with_Legal_Guardian_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
	
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Child_Lives_with_Legal_Guardian(driver, Utility.getdata(17,5), Utility.getdata(18,5), Utility.getdata(19,5), Utility.getdata(20,5));
		
	}
	
	@Test
	public void Verify_Child_Lives_with_Foster_Parents_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
	
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Child_Lives_with_Foster_Parents(driver, Utility.getdata(17,5), Utility.getdata(18,5), Utility.getdata(19,5), Utility.getdata(20,5));
		
	}
	
	@Test
	public void Verify_Child_Lives_with_Other_Adult_Self_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
	
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Child_Lives_with_Other_Adult_Self(driver, Utility.getdata(17,5), Utility.getdata(18,5), Utility.getdata(19,5), Utility.getdata(20,5));
	}
	
	

	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
}

