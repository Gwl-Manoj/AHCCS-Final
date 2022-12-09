package Hamburger_Options;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_All_Pages_URL_Pom 
{
	@FindBy (xpath="//a[@href='https://enroll.grafik-stage.io/welcome/bzwo']") private WebElement Home_Page_Name_Link;
	@FindBy (xpath="//a[@class='btn btn-primary btn-lg']") private WebElement StartEnrollmentBtn;
	@FindBy(xpath = "//span[@class='navbar-toggler-icon']") private WebElement Hamburger_Menu;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[1]") private WebElement Step_1;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[2]") private WebElement Step_2;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[3]") private WebElement Step_3;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[4]") private WebElement Step_4;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[5]") private WebElement Step_5;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[6]") private WebElement Step_6;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[7]") private WebElement Step_7;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[8]") private WebElement Step_8;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[9]") private WebElement Step_9;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[10]") private WebElement Step_10;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[11]") private WebElement Step_11;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[12]") private WebElement Step_12;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[13]") private WebElement Step_13;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[14]") private WebElement Step_14;
	@FindBy(xpath = "((//table[@class='table menu']//tr/td)/a)[15]") private WebElement Step_15;
//	@FindBy(xpath = "(//table[@class='table menu']//tr)[1]") private WebElement Step_1;
//	@FindBy(xpath = "(//table[@class='table menu']//tr)[1]") private WebElement Step_1;
//	@FindBy(xpath = "(//table[@class='table menu']//tr)[1]") private WebElement Step_1;
	
	
	public Home_Page_All_Pages_URL_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Home_Page_Name_Link(WebDriver driver) throws InterruptedException
	{
		String Home_page_URL_Actual = driver.getCurrentUrl();
		String Home_page_URL_Expected = "https://enroll.grafik-stage.io/home";
		System.out.println("The URL for home page is "+Home_page_URL_Actual);
		
		System.out.println("	");
		if(Home_page_URL_Actual.equals(Home_page_URL_Expected))
		{
			Home_Page_Name_Link.click();
			System.out.println("Click on student Name ");
			System.out.println(" ");
		}
		else
		{
			System.out.println("The New User no data found");
			System.out.println(" ");
		}
		Thread.sleep(2000);
	
		
	}
	
	public void Click_StartEnrollmentBtn(WebDriver driver) throws InterruptedException
	{
		
		StartEnrollmentBtn.click();
		System.out.println(" Click On Start Enrollment Button ");
		System.out.println(" ");
	
	
		Thread.sleep(2000);
	}
	
	public void Click_Form_Page_1(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_1.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/studentInformation/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 1 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 1 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}
	
	public void Click_Form_Page_2(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_2.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/addressInformation/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 2 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 2 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_3(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_3.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/guardianInformation/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 3 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 3 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_4(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_4.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/guardianStatement/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 4 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 4 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_5(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_5.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/verification/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 5 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 5 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_6(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_6.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/contactSheet/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 6 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 6 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_7(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_7.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/lunchForm/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 7 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 7 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_8(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_8.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/annualIncome/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 8 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 8 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_9(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_9.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/languageServey/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 9 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 9 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_10(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_10.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/photoRelease/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 10 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 10 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_11(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_11.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/internetAccess/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 11 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 11 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_12(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_12.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/computerAgreement/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 12 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 12 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_13(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_13.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/gettingToKnow/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 13 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 13 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_14(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_14.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/certificate/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 14 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 14 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Click_Form_Page_15(WebDriver driver) throws InterruptedException
	{
		Hamburger_Menu.click();
		Thread.sleep(2000);	
		Step_15.click();
		Thread.sleep(2000);	
		String ActualURL = driver.getCurrentUrl();
		
		String ExpectedURL = "https://enroll.grafik-stage.io/signature/bzwo";
		
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("The Actual and Expected URL's are Same for Form Page 15 "+ ActualURL);
			System.out.println("	 ");
			
		}
		
		else
		{
			System.out.println("The Actual and Expected URL's are Different for Form Page 15 "+ ActualURL);
			System.out.println("	 ");
		}
		
	}	
	
	public void Verify_All_Pages_URLs(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		
		Click_Home_Page_Name_Link(driver);
		
		Click_StartEnrollmentBtn(driver);
		
		Click_Form_Page_1(driver);
		
		Click_Form_Page_2(driver);
		
		Click_Form_Page_3(driver);
		
		Click_Form_Page_4(driver);
		
		Click_Form_Page_5(driver);
		
		Click_Form_Page_6(driver);
		
		Click_Form_Page_7(driver);
		
		Click_Form_Page_8(driver);
		
		Click_Form_Page_9(driver);
		
		Click_Form_Page_10(driver);
		
		Click_Form_Page_11(driver);
		
		Click_Form_Page_12(driver);
		
		Click_Form_Page_13(driver);

		Click_Form_Page_14(driver);
		
		Click_Form_Page_15(driver);
		
		
	}
	
}



