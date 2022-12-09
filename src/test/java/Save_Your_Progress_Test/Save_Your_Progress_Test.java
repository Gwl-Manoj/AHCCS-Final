package Save_Your_Progress_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;

public class Save_Your_Progress_Test extends Achievement_Charter_Excel_Data_BaseClass
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
	@BeforeClass
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
		
		Home_Page.Click_Home_Page_Name_Link(driver);
		Home_Page.Click_StartEnrollmentBtn(driver);
	}
	
	
	@Test(priority=2)
	public void Form_Page() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form.Set_Student_FirstName(Utility.getdata(3,1));
		
		Form.Set_Student_PreferredName(Utility.getdata(4,1));
		
		Form.Set_Student_LastName(Utility.getdata(5,1));
		
		Form.Set_Student_MiddleInitialName(Utility.getdata(6,1));
		
		Form.setDateofBirth_Year(driver);
		
		Form.setDateofBirth_Month(driver);
		
		Form.setDateofBirth_Day(driver);
		
		Form.set_Sex(driver);
		
		Form.Set_Home_Address(Utility.getdata(7,1));
		
		Form.Set_City(Utility.getdata(8,1));
		
		Form.set_State(driver);
		
		Form.set_Country(driver);
		
		Form.Set_ZipCode(Utility.getdata(9,1));
		
		Form.Click_ChechBox();
		
		Form.Student_Mail_Mailing_address(Utility.getdata(7,1));
		
		Form.Set_City_Mailing_Address(Utility.getdata(8,1));
		
		Form.set_State_Mailing_address(driver);
		
		Form.set_Country_Mailing_Address(driver);
		
		Form.Set_ZipCode_Mailing_Address(Utility.getdata(9,1));		
		
		Form.Set_StudentPhone(Utility.getdata(10,1));
		
		Form.Set_StudentMail(Utility.getdata(11,1));
		
		Form.set_Grade(driver);
		
		Form.Click_Save_Your_Progress_Btn();
		
		Form.Click_Next_Btn();

			
	}
	
	@Test(priority=3)
	public void Form_Page_2() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form2.set_School_District(driver);
		
		Form2.set_Former_School_Type(driver);
		
		Form2.Set_Name_Of_Former_School(Utility.getdata(14,1));
		
		Form2.set_Previous_Grade(driver);
		
		Form2.Click_Save_Your_Progress_Btn();
		
		Form2.Click_Next_Btn();
	}
	
	@Test(priority=4)
	public void Form_Page_3() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form3.set_Child_Lives_with(driver);
		
		Form3.Set_Father_First_last_Name(Utility.getdata(17,1));
		
		Form3.Set_Home_address(Utility.getdata(18,1));
		
		Form3.Set_City(Utility.getdata(19,1));
		
		Form3.set_State(driver);
		
		Form3.Set_Zip_Code(Utility.getdata(20,1));
		
		Form3.Set_Cell_Number(Utility.getdata(21,1));
		
		Form3.Set_Work_Number(Utility.getdata(22,1));
		
		Form3.Click_Save_Your_Progress_Btn();
		
		Form3.click_Next_Btn(driver);
		
		
	}
	
	@Test(priority=5)
	public void Form_Page_4() throws InterruptedException, EncryptedDocumentException, IOException
	{
//		Form4.click_Checkbox_1();
//		
//		Form4.click_Checkbox_2();
//		
//		Form4.click_Checkbox_3();
//		
//		Form4.click_Checkbox_4();
		
		Form4.Click_Save_Your_Progress_Btn();
		
		Form4.Click_Next_Btn();
		
		
	}
	
	@Test(priority=6)
	public void Form_Page_5() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form5.Set_Year(Utility.getdata(25,1));
		
		Form5.set_Ethinicity(driver);
		
		Form5.set_Race(driver);
		
		Form5.set_State_Of_Birth(driver);
		
		Form5.Click_Save_Your_Progress_Btn();
		
		Form5.Click_Next_Btn();
	}
	
	@Test(priority=7)
	public void Form_Page_6() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form6.Set_Full_Name(Utility.getdata(28,1));
		
		Form6.Set_Primary_Parent_Email(Utility.getdata(29,1));
		
		Form6.Set_Primary_Parent_Phone(Utility.getdata(30,1));
		
		Form6.Set_Primary_Parent_Employeer(Utility.getdata(31,1));
		
		Form6.Set_Work_number(Utility.getdata(32,1));
		
		Form6.Set_Work_Email(Utility.getdata(33,1));
		
		Form6.set_Contact_Option(driver);
		
		Form6.Set_Contact_Language(Utility.getdata(34,1));
		
		Form6.Set_Name(Utility.getdata(35,1));
		
		Form6.Set_Email(Utility.getdata(36,1));
		
		Form6.Set_Relationship_With_Student(Utility.getdata(37,1));
		
		Form6.Set_Phone_Number(Utility.getdata(38,1));
		
		Form6.Set_Name1(Utility.getdata(39,1));
		
		Form6.Set_Email1(Utility.getdata(40,1));
		
		Form6.Set_Relationship_With_Student1(Utility.getdata(41,1));
		
		Form6.Set_Phone_Number1(Utility.getdata(42,1));
		
		Form6.Click_Save_Your_Progress_Btn();
		
		Form6.Click_Next_Btn();
		
		
	}
	
	@Test(priority=8)
	public void Form_Page_7() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form7.Set_Student_Name(Utility.getdata(45,1));
		
		Form7.set_Grade(driver);
		
		Form7.set_Year(driver);
		
		Form7.set_Month(driver);
		
		Form7.set_Day(driver);
		
//		Form7.Click_Add_Student_Button(driver);
//		
//		Form7.Set_Student_Name1(Utility.getdata(46,1));
//		
//		Form7.set_Grade1(driver);
//		
//		Form7.set_Year1(driver);
//		
//		Form7.set_Month1(driver);
//		
//		Form7.set_Day1(driver);
//		
//		Form7.Click_CheckBoxes();
//		
		Form7.Click_Save_Your_Progress_Btn();
		
		Form7.Click_Next_Btn();
		
	}
	
	@Test(priority=9)
	public void Form_Page_8() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form8.Set_Name(Utility.getdata(59,1));
		
		Form8.Set_Case_Number(Utility.getdata(60,1));
		
		Form8.set_People_Count(driver);
		
		Form8.set_Annual_Salary(driver);
		
		Form8.Click_Save_Your_Progress_Btn();
		
		Form8.Click_Next_Btn();
	}
	
	@Test(priority=10)
	public void Form_Page_9() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form9.Set_Student_Language(Utility.getdata(48,1));
		
		Form9.Click_Save_Your_Progress_Btn();
		
		Form9.Click_Next_Btn();
		
	}
	
	@Test(priority=11)
	public void Form_Page_10() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form10.Click_Save_Your_Progress_Btn();
		
		Form10.Click_Next_Btn();
	}
	
	@Test(priority=12)
	public void Form_Page_11() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form11.Set_Service_Provider(Utility.getdata(53,1));
		
		Form11.set_Type_Of_Connection(driver);

		Form11.Set_Internet_Speed(Utility.getdata(51,1));
		
		Form11.Set_Internet_access(Utility.getdata(52,1));
		
		Form11.Click_Save_Your_Progress_Btn();
		
		Form11.Click_Next_Btn();
		
	}
	
	@Test(priority=13)
	public void Form_Page_12() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form12.Click_Save_Your_Progress_Btn();
		
		Form12.Click_Next_Btn();
	}
	
	@Test(priority=14)
	public void Form_Page_13() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Form13.Set_Your_Reason(Utility.getdata(63,1));
		
		Form13.Set_Adults_Name(Utility.getdata(64,1));
		
		Form13.Set_Reason_For_change(Utility.getdata(65,1));
		
		Form13.Set_Changes(Utility.getdata(66,1));
		
//		Form13.Set_Hobbies(Utility.getdata(67,1));
		
		Form13.Set_Preferred_Name(Utility.getdata(68,1));
		
		Form13.Set_Pronunciation(Utility.getdata(69,1));
		
		Form13.Set_Pronouns(Utility.getdata(70,1));
		
		Form13.Click_CheckBoxes();
		
		Form13.Click_Save_Your_Progress_Btn();
		
		
		Form13.Click_Next_Btn();
		
		
	}
	
	@Test(priority=15)
	public void Form_Page_14() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Form14.Set_Student_Name(Utility.getdata(55,1));
		
		Form14.Set_Parent_Name(Utility.getdata(56,1));
		
		Form14.Click_Save_Your_Progress_Btn();
		
		Form14.Click_Next_Btn();
		
		
	}
	

	
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}

}
