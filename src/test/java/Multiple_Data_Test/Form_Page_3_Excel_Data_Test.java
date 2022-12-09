package Multiple_Data_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;
import Multiple_data_POM.Form_Page_3_Excel_Data_Pom;
import Pom_classes.Form_Page_1_Pom;
import Pom_classes.Home_Page_Pom;

public class Form_Page_3_Excel_Data_Test extends Achievement_Charter_Excel_Data_BaseClass
{
	
	int TCID;
	Pom_classes.Login_Pom login;
	Home_Page_Pom Home_Page;
	Form_Page_1_Pom Form;
	Pom_classes.Form_Page_2_Pom Form2;
	Form_Page_3_Excel_Data_Pom Form3;
	
	
	@Parameters("browsername")
	@BeforeMethod
	public void OpenBrowser(String browsername) throws InterruptedException
	{
		open_browser(browsername);	
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Home_Page_Pom(driver);
		Form = new Form_Page_1_Pom(driver);
		Form2 = new Pom_classes.Form_Page_2_Pom(driver);
		Form3 = new Form_Page_3_Excel_Data_Pom(driver);
		
		
	}
		
	
		@Test
		public void Verify_Father_First_last_Name_Filed() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
		
			Form3.Set_Father_First_last_Name(driver);
			
		}
		
	
		
		@Test
		public void Verify_Home_address_Field() throws InterruptedException, EncryptedDocumentException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Set_Home_address(driver);

			
		}
		
		@Test
		public void Verify_City_Field() throws InterruptedException, EncryptedDocumentException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Set_City(driver);
			
		}
		
		@Test
		public void Verify_Zip_Code_Field() throws InterruptedException, EncryptedDocumentException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Set_Zip_Code(driver);
			
		}
		
		@Test
		public void Verify_Cell_Number_Field() throws InterruptedException, EncryptedDocumentException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Set_Cell_Number(driver);
			
		}
		
		@Test
		public void Verify_Work_Number_Field() throws InterruptedException, EncryptedDocumentException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Set_Work_Number(driver);
			
		}
		
		
		
		
		
		@AfterMethod
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close(); // Close the browser
			
			
		}

		
}






































