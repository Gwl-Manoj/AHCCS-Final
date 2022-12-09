package Save_Your_Progress_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;

public class Save_Your_Progress_Test1 extends Achievement_Charter_Excel_Data_BaseClass
{
	int TCID;
	Pom_classes.Login_Pom login;
	Pom_classes.Home_Page_Pom Home_Page;
	Save_Your_Progress_POM.Form_Pom Form;
	Save_Your_Progress_POM.Form_Page_2_Pom Form2;
	Save_Your_Progress_POM.Form_Page_3_Pom Form3;
	Save_Your_Progress_POM.Form_Page_4_Pom Form4;
	Save_Your_Progress_POM.Form_Page_5_Pom Form5;
	Save_Your_Progress_POM.Form_Page_6_Pom Form6;
	Save_Your_Progress_POM.Form_Page_7_Pom Form7;
	Save_Your_Progress_POM.Form_Page_8_Pom Form8;
	Save_Your_Progress_POM.Form_Page_9_Pom Form9;
	Save_Your_Progress_POM.Form_Page_10_Pom Form10;
	Save_Your_Progress_POM.Form_Page_11_Pom Form11;
	Save_Your_Progress_POM.Form_Page_12_Pom Form12;
	Save_Your_Progress_POM.Form_Page_13_Pom Form13;
	Save_Your_Progress_POM.Form_Page_14_Pom Form14;
	Save_Your_Progress_POM.Form_Page_15_Pom Form15;
	
	
	
	@Parameters("browsername")
	@BeforeMethod
	public void OpenBrowser(String browsername) throws InterruptedException
	{
		open_browser(browsername);	
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Pom_classes.Home_Page_Pom(driver);
		Form = new 	Save_Your_Progress_POM.Form_Pom(driver);
		Form2 = new Save_Your_Progress_POM.Form_Page_2_Pom(driver);
		Form3 = new Save_Your_Progress_POM.Form_Page_3_Pom(driver);
		Form4 = new Save_Your_Progress_POM.Form_Page_4_Pom(driver);
		Form5 = new Save_Your_Progress_POM.Form_Page_5_Pom(driver);
		Form6 = new Save_Your_Progress_POM.Form_Page_6_Pom(driver);
		Form7 = new Save_Your_Progress_POM.Form_Page_7_Pom(driver);
		Form8 = new Save_Your_Progress_POM.Form_Page_8_Pom(driver);
		Form9 = new Save_Your_Progress_POM.Form_Page_9_Pom(driver);
		Form10 = new Save_Your_Progress_POM.Form_Page_10_Pom(driver);
		Form11 = new Save_Your_Progress_POM.Form_Page_11_Pom(driver);
		Form12 = new Save_Your_Progress_POM.Form_Page_12_Pom(driver);
		Form13 = new Save_Your_Progress_POM.Form_Page_13_Pom(driver);
		Form14 = new Save_Your_Progress_POM.Form_Page_14_Pom(driver);
		Form15 = new Save_Your_Progress_POM.Form_Page_15_Pom(driver);
		
		
		
	}
	
	
	
	@Test
	public void Verify_Fill_Form_Page_1_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		driver.close();
		
	}
	
	@Test
	public void Verify_Fill_Form_Page_2_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
//		driver.close();
	}
	
	@Test
	public void Verify_Fill_Form_Page_3_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
		
//		driver.close();
	}
	
	@Test
	public void Verify_Fill_Form_Page_4_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
//		driver.close();
		
	}
	
	@Test
	public void Verify_Fill_Form_Page_5_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		driver.close();
		
	}
	
	@Test
	public void Verify_Fill_Form_Page_6_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		driver.close();
	}
	
	@Test
	public void Verify_Fill_Form_Page_7_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.Fill_Form_Page_7(driver,  Utility.getdata(45,1));
		
		driver.close();
		
	}
	
	@Test
	public void Verify_Fill_Form_Page_8_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.Fill_Form_Page_7(driver,  Utility.getdata(45,1));
		
		Form8.Fill_Form_Page_8(driver, Utility.getdata(59,1), Utility.getdata(60,1));
		
		
	}
	
	@Test
	public void Verify_Fill_Form_Page_9_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.Fill_Form_Page_7(driver,  Utility.getdata(45,1));
		
		Form8.Fill_Form_Page_8(driver, Utility.getdata(59,1), Utility.getdata(60,1));
		
		Form9.Fill_Form_Page_9(Utility.getdata(48,1));
		
		
		
	}
	
	@Test
	public void Verify_Fill_Form_Page_10_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.Fill_Form_Page_7(driver,  Utility.getdata(45,1));
		
		Form8.Fill_Form_Page_8(driver, Utility.getdata(59,1), Utility.getdata(60,1));
		
		Form9.Fill_Form_Page_9(Utility.getdata(48,1));
		
		Form10.Click_Save_Your_Progress_Btn();
		
		Form10.Click_Next_Btn();
	}
	
	@Test
	public void Verify_Fill_Form_Page_11_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.Fill_Form_Page_7(driver,  Utility.getdata(45,1));
		
		Form8.Fill_Form_Page_8(driver, Utility.getdata(59,1), Utility.getdata(60,1));
		
		Form9.Fill_Form_Page_9(Utility.getdata(48,1));
		
		Form10.Click_Next_Btn();
		
		Form11.Fill_Form_Page_11(driver, Utility.getdata(53,1), Utility.getdata(51,1), Utility.getdata(52,1));
		
		
	}
	
	@Test
	public void Verify_Fill_Form_Page_12_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.Fill_Form_Page_7(driver,  Utility.getdata(45,1));
		
		Form8.Fill_Form_Page_8(driver, Utility.getdata(59,1), Utility.getdata(60,1));
		
		Form9.Fill_Form_Page_9(Utility.getdata(48,1));
		
		Form10.Click_Next_Btn();
		
		Form11.Fill_Form_Page_11(driver, Utility.getdata(53,1), Utility.getdata(51,1), Utility.getdata(52,1));
		
		Form12.Click_Save_Your_Progress_Btn();
		
		Form12.Click_Next_Btn();
	}
	
	@Test
	public void Verify_Fill_Form_Page_13_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.Fill_Form_Page_7(driver,  Utility.getdata(45,1));
		
		Form8.Fill_Form_Page_8(driver, Utility.getdata(59,1), Utility.getdata(60,1));
		
		Form9.Fill_Form_Page_9(Utility.getdata(48,1));
		
		Form10.Click_Next_Btn();
		
		Form11.Fill_Form_Page_11(driver, Utility.getdata(53,1), Utility.getdata(51,1), Utility.getdata(52,1));
		
		Form12.Click_Next_Btn();
		
		Form13.Fill_Form_Page_13(driver, Utility.getdata(63,1), Utility.getdata(64,1), Utility.getdata(65,1), Utility.getdata(66,1), Utility.getdata(68,1), Utility.getdata(69,1), Utility.getdata(70,1));
		
	}
	
	@Test
	public void Verify_Fill_Form_Page_14_Save_Progress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
				
		Form4.Fill_Form_Page_4();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.Fill_Form_Page_7(driver,  Utility.getdata(45,1));
		
		Form8.Fill_Form_Page_8(driver, Utility.getdata(59,1), Utility.getdata(60,1));
		
		Form9.Fill_Form_Page_9(Utility.getdata(48,1));
		
		Form10.Click_Next_Btn();
		
		Form11.Fill_Form_Page_11(driver, Utility.getdata(53,1), Utility.getdata(51,1), Utility.getdata(52,1));
		
		Form12.Click_Next_Btn();
		
		Form13.Fill_Form_Page_13(driver, Utility.getdata(63,1), Utility.getdata(64,1), Utility.getdata(65,1), Utility.getdata(66,1), Utility.getdata(68,1), Utility.getdata(69,1), Utility.getdata(70,1));
				
		Form14.Fill_Form_Page_14(Utility.getdata(55,1), Utility.getdata(56,1));
				
	}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}

}
