package Multiple_data_POM;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class Form_Page_13_Excel_Data_Pom 
{
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Your_Reason;
	@FindBy (xpath = "(//input[@class='form-control'])[3]") private WebElement Adults_Name;
	@FindBy(id = "do_different") private WebElement Reason_For_change;
	@FindBy (xpath = "(//input[@class='form-control'])[5]") private WebElement Changes;
	@FindBy (xpath = "//div[@class='bootstrap-tagsinput']") private WebElement Hobbies;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement Preferred_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[8]") private WebElement Pronunciation;
	@FindBy(xpath = "(//input[@class='form-control'])[9]") private WebElement Pronouns;

	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-2'])[1]") private WebElement CheckBox1;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-2'])[3]") private WebElement CheckBox3;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-2'])[5]") private WebElement CheckBox5;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-2'])[9]") private WebElement CheckBox9;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-2'])[10]") private WebElement CheckBox10;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-2'])[12]") private WebElement CheckBox12;

	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;

	public Form_Page_13_Excel_Data_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Set_Your_Reason(WebDriver driver) throws InterruptedException, IOException
	{

		Sheet sh = Utility.getmultipledata("Form_Page_13");
		String your_Reason = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 0; j<row.getLastCellNum(); j++)
			{
			Cell cell = row.getCell(j);

				if(j==0)
				{
					your_Reason = cell.getStringCellValue();
				}
			}

			Your_Reason.clear();
			Your_Reason.sendKeys(your_Reason);

			Adults_Name.clear();
			String adults_Name = Utility.getdata(64,1);
			Adults_Name.sendKeys(adults_Name);

			Reason_For_change.clear();
			String reason_For_change = Utility.getdata(65,1);
			Reason_For_change.sendKeys(reason_For_change);

			Changes.clear();
			String changes=  Utility.getdata(66,1);
			Changes.sendKeys(changes);

			Preferred_Name.clear();
			String preferred_Name = Utility.getdata(68,1);
			Preferred_Name.sendKeys(preferred_Name);

			Pronunciation.clear();
			String pronunciation = Utility.getdata(69,1);
			Pronunciation.sendKeys(pronunciation);

			Pronouns.clear();
			String pronouns = Utility.getdata(70,1);
			Pronouns.sendKeys(pronouns);

			Next_Btn.click();
			Thread.sleep(2000);

			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("your_Reason  : "+your_Reason+"--->"+"your_Reason Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.id("reason")).clear();
					driver.findElement(By.id("reason")).sendKeys(Utility.getdata(63,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}

			catch(Exception e)
			{

			}

			try
			{
				Boolean Certification_and_Signature = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='14. Certification and Signature']")).isDisplayed();
				if(Certification_and_Signature==true)
				{
					result= "Pass";
					Reporter.log("your_Reason   : "+your_Reason+"--->"+"your_Reason Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}
			catch(Exception e)
			{


			}
		}







	}

	public void Set_Adults_Name(WebDriver driver) throws InterruptedException, IOException
	{


		Sheet sh = Utility.getmultipledata("Form_Page_13");
		String adults_Name = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
			Row row=sh.getRow(i);
			for(int j= 1; j<row.getLastCellNum(); j++)
			{
			Cell cell = row.getCell(j);

				if(j==1)
				{
					adults_Name = cell.getStringCellValue();
				}
			}

			Your_Reason.clear();
			String your_Reason = Utility.getdata(63,1);
			Your_Reason.sendKeys(your_Reason);

			Adults_Name.clear();
			Adults_Name.sendKeys(adults_Name);

			Reason_For_change.clear();
			String reason_For_change = Utility.getdata(65,1);
			Reason_For_change.sendKeys(reason_For_change);

			Changes.clear();
			String changes=  Utility.getdata(66,1);
			Changes.sendKeys(changes);

			Preferred_Name.clear();
			String preferred_Name = Utility.getdata(68,1);
			Preferred_Name.sendKeys(preferred_Name);

			Pronunciation.clear();
			String pronunciation = Utility.getdata(69,1);
			Pronunciation.sendKeys(pronunciation);

			Pronouns.clear();
			String pronouns = Utility.getdata(70,1);
			Pronouns.sendKeys(pronouns);

			Next_Btn.click();
			Thread.sleep(2000);

			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("adults_Name  : "+adults_Name+"--->"+"adults_Name Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.id("schoolwork_responsible")).clear();
					driver.findElement(By.id("schoolwork_responsible")).sendKeys(Utility.getdata(64,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}

			catch(Exception e)
			{

			}

			try
			{
				Boolean Certification_and_Signature = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='14. Certification and Signature']")).isDisplayed();
				if(Certification_and_Signature==true)
				{
					result= "Pass";
					Reporter.log("adults_Name   : "+adults_Name+"--->"+"adults_Name Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}
			catch(Exception e)
			{


			}
		}




	}

	public void Set_Reason_For_change(WebDriver driver) throws InterruptedException, IOException
	{

		Sheet sh = Utility.getmultipledata("Form_Page_13");
		String reason_For_change = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 2; j<row.getLastCellNum(); j++)
			{
				Cell cell = row.getCell(j);

				if(j==2)
				{
					reason_For_change = cell.getStringCellValue();
				}
			}

			Your_Reason.clear();
			String your_Reason = Utility.getdata(63,1);
			Your_Reason.sendKeys(your_Reason);

			Adults_Name.clear();
			String adults_Name = Utility.getdata(64,1);
			Adults_Name.sendKeys(adults_Name);

			Reason_For_change.clear();
			Reason_For_change.sendKeys(reason_For_change);

			Changes.clear();
			String changes=  Utility.getdata(66,1);
			Changes.sendKeys(changes);

			Preferred_Name.clear();
			String preferred_Name = Utility.getdata(68,1);
			Preferred_Name.sendKeys(preferred_Name);

			Pronunciation.clear();
			String pronunciation = Utility.getdata(69,1);
			Pronunciation.sendKeys(pronunciation);

			Pronouns.clear();
			String pronouns = Utility.getdata(70,1);
			Pronouns.sendKeys(pronouns);

			Next_Btn.click();
			Thread.sleep(2000);

			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("reason_For_change  : "+reason_For_change+"--->"+"reason_For_change Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.id("do_different")).clear();
					driver.findElement(By.id("do_different")).sendKeys(Utility.getdata(65,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}

			catch(Exception e)
			{

			}

			try
			{
				Boolean Certification_and_Signature = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='14. Certification and Signature']")).isDisplayed();
				if(Certification_and_Signature==true)
				{
					result= "Pass";
					Reporter.log("reason_For_change   : "+reason_For_change+"--->"+"reason_For_change Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}
			catch(Exception e)
			{


			}
		}


	}

	public void Set_Changes(WebDriver driver) throws InterruptedException, IOException
	{

		Sheet sh = Utility.getmultipledata("Form_Page_13");
		String changes = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 3; j<row.getLastCellNum(); j++)
			{
			Cell	cell = row.getCell(j);

				if(j==3)
				{
					changes = cell.getStringCellValue();
				}
			}

			Your_Reason.clear();
			String your_Reason = Utility.getdata(63,1);
			Your_Reason.sendKeys(your_Reason);

			Adults_Name.clear();
			String adults_Name = Utility.getdata(64,1);
			Adults_Name.sendKeys(adults_Name);

			Reason_For_change.clear();
			String reason_For_change = Utility.getdata(65,1);
			Reason_For_change.sendKeys(reason_For_change);

			Changes.clear();
			Changes.sendKeys(changes);

			Preferred_Name.clear();
			String preferred_Name = Utility.getdata(68,1);
			Preferred_Name.sendKeys(preferred_Name);

			Pronunciation.clear();
			String pronunciation = Utility.getdata(69,1);
			Pronunciation.sendKeys(pronunciation);

			Pronouns.clear();
			String pronouns = Utility.getdata(70,1);
			Pronouns.sendKeys(pronouns);

			Next_Btn.click();
			Thread.sleep(2000);

			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("changes  : "+changes+"--->"+"changes Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.id("school_work")).clear();
					driver.findElement(By.id("school_work")).sendKeys(Utility.getdata(66,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}

			catch(Exception e)
			{

			}

			try
			{
				Boolean Certification_and_Signature = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='14. Certification and Signature']")).isDisplayed();
				if(Certification_and_Signature==true)
				{
					result= "Pass";
					Reporter.log("changes   : "+changes+"--->"+"changes Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}
			catch(Exception e)
			{


			}
		}


	}

	//	public void Set_Hobbies(String hobbies) throws InterruptedException
	//	{
	//		Hobbies.clear();
	//		Thread.sleep(1000);
	//		Hobbies.sendKeys(hobbies);
	//		Reporter.log("The Hobbies are entered", true);
	//
	//	}



	public void Set_Preferred_Name(WebDriver driver) throws InterruptedException, IOException
	{

		Sheet sh = Utility.getmultipledata("Form_Page_13");
		String preferred_Name = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 4; j<row.getLastCellNum(); j++)
			{
			Cell	cell = row.getCell(j);

				if(j==4)
				{
					preferred_Name = cell.getStringCellValue();
				}
			}

			Your_Reason.clear();
			String your_Reason = Utility.getdata(63,1);
			Your_Reason.sendKeys(your_Reason);

			Adults_Name.clear();
			String adults_Name = Utility.getdata(64,1);
			Adults_Name.sendKeys(adults_Name);

			Reason_For_change.clear();
			String reason_For_change = Utility.getdata(65,1);
			Reason_For_change.sendKeys(reason_For_change);

			Changes.clear();
			String changes = Utility.getdata(66,1);
			Changes.sendKeys(changes);

			Preferred_Name.clear();
			Preferred_Name.sendKeys(preferred_Name);

			Pronunciation.clear();
			String pronunciation = Utility.getdata(69,1);
			Pronunciation.sendKeys(pronunciation);

			Pronouns.clear();
			String pronouns = Utility.getdata(70,1);
			Pronouns.sendKeys(pronouns);

			Next_Btn.click();
			Thread.sleep(2000);

			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("preferred_Name  : "+preferred_Name+"--->"+"preferred_Name Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.name("preferred_name")).clear();
					driver.findElement(By.name("preferred_name")).sendKeys(Utility.getdata(68,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}

			catch(Exception e)
			{

			}

			try
			{
				Boolean Certification_and_Signature = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='14. Certification and Signature']")).isDisplayed();
				if(Certification_and_Signature==true)
				{
					result= "Pass";
					Reporter.log("preferred_Name   : "+preferred_Name+"--->"+"preferred_Name Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}
			catch(Exception e)
			{


			}
		}


	}

	public void Set_Pronunciation(WebDriver driver) throws InterruptedException, IOException
	{

		Sheet sh = Utility.getmultipledata("Form_Page_13");
		String pronunciation = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 5; j<row.getLastCellNum(); j++)
			{
			Cell	cell = row.getCell(j);

				if(j==5)
				{
					pronunciation = cell.getStringCellValue();
				}
			}

			Your_Reason.clear();
			String your_Reason = Utility.getdata(63,1);
			Your_Reason.sendKeys(your_Reason);

			Adults_Name.clear();
			String adults_Name = Utility.getdata(64,1);
			Adults_Name.sendKeys(adults_Name);

			Reason_For_change.clear();
			String reason_For_change = Utility.getdata(65,1);
			Reason_For_change.sendKeys(reason_For_change);

			Changes.clear();
			String changes = Utility.getdata(66,1);
			Changes.sendKeys(changes);

			Preferred_Name.clear();
			String preferred_Name= Utility.getdata(68,1);
			Preferred_Name.sendKeys(preferred_Name);

			Pronunciation.clear();
			Pronunciation.sendKeys(pronunciation);

			Pronouns.clear();
			String pronouns = Utility.getdata(70,1);
			Pronouns.sendKeys(pronouns);

			Next_Btn.click();
			Thread.sleep(2000);

			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("pronunciation  : "+pronunciation+"--->"+"pronunciation Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.name("pronunciation")).clear();
					driver.findElement(By.name("pronunciation")).sendKeys(Utility.getdata(69,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}

			catch(Exception e)
			{

			}

			try
			{
				Boolean Certification_and_Signature = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='14. Certification and Signature']")).isDisplayed();
				if(Certification_and_Signature==true)
				{
					result= "Pass";
					Reporter.log("pronunciation   : "+pronunciation+"--->"+"pronunciation Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}
			catch(Exception e)
			{


			}
		}

	}

	public void Set_Pronouns(WebDriver driver) throws InterruptedException, IOException
	{


		Sheet sh = Utility.getmultipledata("Form_Page_13");
		String pronouns = null;

		for(int i =1; i<=sh.getLastRowNum(); i++)
		{
		Row	row=sh.getRow(i);
			for(int j= 6; j<row.getLastCellNum(); j++)
			{
			Cell	cell = row.getCell(j);

				if(j==6)
				{
					pronouns = cell.getStringCellValue();
				}
			}

			Your_Reason.clear();
			String your_Reason = Utility.getdata(63,1);
			Your_Reason.sendKeys(your_Reason);

			Adults_Name.clear();
			String adults_Name = Utility.getdata(64,1);
			Adults_Name.sendKeys(adults_Name);

			Reason_For_change.clear();
			String reason_For_change = Utility.getdata(65,1);
			Reason_For_change.sendKeys(reason_For_change);

			Changes.clear();
			String changes = Utility.getdata(66,1);
			Changes.sendKeys(changes);

			Preferred_Name.clear();
			String preferred_Name= Utility.getdata(68,1);
			Preferred_Name.sendKeys(preferred_Name);

			Pronunciation.clear();
			String pronunciation = Utility.getdata(69,1);
			Pronunciation.sendKeys(pronunciation);

			Pronouns.clear();
			Pronouns.sendKeys(pronouns);

			Next_Btn.click();
			Thread.sleep(2000);

			String result = null;
			try 
			{
				Boolean iserror = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).isDisplayed();

				if(iserror==true)
				{
					result = "Fail";

					Reporter.log("pronouns  : "+pronouns+"--->"+"pronouns Failed"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);


					driver.findElement(By.name("pronouns")).clear();
					driver.findElement(By.name("pronouns")).sendKeys(Utility.getdata(70,1));
					Next_Btn.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}

			catch(Exception e)
			{

			}

			try
			{
				Boolean Certification_and_Signature = driver.findElement(By.xpath("//div[@class='enrollforms']/h1[text()='14. Certification and Signature']")).isDisplayed();
				if(Certification_and_Signature==true)
				{
					result= "Pass";
					Reporter.log("pronouns   : "+pronouns+"--->"+"pronouns Success"+"--->"+result, true);
					Reporter.log("                                                                                                    ", true);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Back']")).click();
					Thread.sleep(2000);
				}



			}
			catch(Exception e)
			{


			}
		}

	}


}
