package Other_Alternate_Options_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_4_Pom
{
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]") private WebElement Instructions_1_Radio_Button;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]") private WebElement Instructions_2_Radio_Button;
	@FindBy(xpath = "((//div[@class='fs-label']))[1]") private WebElement Month;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement Month_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Day;
	@FindBy(xpath = "(//div[@class='fs-option g0'])[15]") private WebElement Day_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[47]") private WebElement Year_1;
	
	@FindBy(xpath = "((//div[@class='fs-label']))[4]") private WebElement Month1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[74]") private WebElement Month_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[5]") private WebElement Day1;
	@FindBy(xpath = "(//div[@class='fs-option g0'])[83]") private WebElement Day_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[6]") private WebElement Year1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[121]") private WebElement Year_2;
	
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-4'])[1]") private WebElement Checkbox_1;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-4'])[2]") private WebElement Checkbox_2;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-4'])[3]") private WebElement Checkbox_3;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-4'])[4]") private WebElement Checkbox_4;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	
	public Form_Page_4_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Instructions_2_Radio_Button() throws InterruptedException
	{
		Instructions_2_Radio_Button.click();
		Reporter.log("Instructions_2_Radio_Button selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void Instructions_1_Radio_Button() throws InterruptedException
	{
		Instructions_1_Radio_Button.click();
		Reporter.log("Instructions_1_Radio_Button selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	
	}
	
	public void set_Year(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Year).click().perform();
		act.moveToElement(Year_1).click().perform();
		Reporter.log("The Date of year is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void set_Month(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions act = new Actions(driver);
		act.moveToElement(Month).click().perform();
		act.moveToElement(Month_1).click().perform();
		Reporter.log("The Date of month is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void set_Day(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Day).click().perform();
		act.moveToElement(Day_1).click().perform();
		Reporter.log("The Date is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void set_Year1(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Year1).click().perform();
		act.moveToElement(Year_2).click().perform();
		Reporter.log("The Date of year is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void set_Month1(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Month1).click().perform();
		act.moveToElement(Month_2).click().perform();
		Reporter.log("The Date of month is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void set_Day1(WebDriver driver) throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Day1).click().perform();
		act.moveToElement(Day_2).click().perform();
		Reporter.log("The Date is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	
	
	public void click_Checkbox_1()
	{
		if(Checkbox_1.isSelected()==true)
		{
			Reporter.log("The checkbox is already selected", true);
			Reporter.log(" ", true);
		}
		else
		{
			Checkbox_1.click();
		}
//		Checkbox_1.click();
		
	}
	
	public void click_Checkbox_2()
	{
		if(Checkbox_2.isSelected()==true)
		{
			Reporter.log("The checkbox is already selected", true);
			Reporter.log(" ", true);
		}
		else
		{
			Checkbox_2.click();
		}
		
//		Checkbox_2.click();
		
	}
	
	public void click_Checkbox_3()
	{
		if(Checkbox_3.isSelected()==true)
		{
			Reporter.log("The checkbox is already selected", true);
			Reporter.log(" ", true);
		}
		else
		{
			Checkbox_3.click();
		}
		
//		Checkbox_3.click();
		
		
	}
	
	public void click_Checkbox_4()
	{
		if(Checkbox_4.isSelected()==true)
		{
			Reporter.log("The checkbox is already selected", true);
			Reporter.log(" ", true);
		}
		else
		{
			Checkbox_4.click();
		}
		
//		Checkbox_4.click();
	}

	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
}
