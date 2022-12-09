package Multiple_Data_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;
import Pom_classes.Form_Page_15_Pom;
import Pom_classes.Home_Page_Pom;

public class Multiple_Data_Form_1_Test extends Achievement_Charter_Excel_Data_BaseClass
{
	
	Pom_classes.Login_Pom login;
	Home_Page_Pom Home_Page;
	Multiple_data_POM.Form_Page_1_Excel_Data_Pom Form;
	Form_Page_15_Pom Form15;
	
	
	@Parameters("browsername")
	@BeforeMethod
	public void OpenBrowser(String browsername) throws InterruptedException
	{
		open_browser(browsername);	
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Home_Page_Pom(driver);
		Form = new Multiple_data_POM.Form_Page_1_Excel_Data_Pom(driver);
		Form15 = new Form_Page_15_Pom(driver);
		
	}
	
		@Test
		public void Verify_FirstName_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{
			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Set_Student_FirstName(driver);

		}
		
//		@Test
//		public void Verify_PrefferedName_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_Student_PreferredName(driver);
//			
//			 
//		}
//		
//		@Test
//		public void Verify_LastName_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_Student_LastName(driver);
//			
//			 
//		}
//		
//		@Test
//		public void Verify_MiddleInitialName_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_Student_MiddleInitialName(driver);
//			
//			 
//		}
//		
//		@Test
//		public void Verify_Home_Address_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_Home_Address(driver);
//			
//			 
//		}
//		
//		@Test
//		public void Verify_City_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_City(driver);
//			
//			 
//		}
//		
//		@Test
//		public void Verify_ZipCode_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_ZipCode(driver);
//
//		}
//		
//		@Test
//		public void Verify_Mailing_address_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Student_Mail_Mailing_address(driver);
//			
//			 
//		}
//		
//		@Test
//		public void Verify_City_Mailing_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_City_Mailing_Address(driver);
//			
//		 
//		}
//		
//		@Test
//		public void Verify_ZipCode_Mailing_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_ZipCode_Mailing_Address(driver);
//			
//			 
//		}
//		
//		@Test
//		public void Verify_StudentMail_Field() throws EncryptedDocumentException, InterruptedException, IOException
//		{
//			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
//			
//			Home_Page.Home_Page(driver);
//			
//			Form.Set_StudentMail(driver);
//			
//			 
//		}
		
		
		@AfterMethod
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close(); // Close the browser
			
			
		}

}
