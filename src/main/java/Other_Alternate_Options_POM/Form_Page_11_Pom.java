package Other_Alternate_Options_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_11_Pom 
{

	
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[2]") private WebElement Internet_Service_RadioBtn;		
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Service_Provider;
	@FindBy(xpath = "(//div[@class='fs-label'])") private WebElement Type_Of_Connection;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[4]") private WebElement Type_Of_Connection_1;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Internet_Speed;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Internet_access;
	@FindBy(name = "primary_access_internet") private WebElement primary_access_internet;
	@FindBy(name = "primary_avaliable_internet") private WebElement primary_avaliable_internet;
	@FindBy(xpath = "(//div[@class='custom-control custom-radio'])[1]") private WebElement Internet_Service_RadioBtn1;
	
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_11_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Internet_Service_RadioBtn() throws InterruptedException
	{
		Internet_Service_RadioBtn.click();
		Reporter.log("Internet_Service_RadioBtn No is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	
	public void Set_Service_Provider(String service_Provider) throws InterruptedException
	{
		Service_Provider.clear();
		Service_Provider.sendKeys(service_Provider);
		
		
		
	}
	
	public void set_Type_Of_Connection(WebDriver driver)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions act = new Actions(driver);
		act.moveToElement(Type_Of_Connection).click().perform();
		act.moveToElement(Type_Of_Connection_1).click().perform();
	
	}
	
	public void Set_Internet_Speed(String internet_Speed) throws InterruptedException
	{
		Internet_Speed.clear();
		Internet_Speed.sendKeys(internet_Speed);
		
	}
	
	public void Set_Internet_access(String internet_access) throws InterruptedException
	{
		Internet_access.clear();
		Internet_access.sendKeys(internet_access);
		
	}
	
	public void Set_primary_access_internet() throws InterruptedException
	{
		primary_access_internet.clear();
		primary_access_internet.sendKeys("In House");
		
	}
	
	public void Set_primary_avaliable_internet() throws InterruptedException
	{
		primary_avaliable_internet.clear();
		primary_avaliable_internet.sendKeys("All Time");
		
	}
	
	public void Click_Internet_Service_RadioBtn1() throws InterruptedException
	{
		Internet_Service_RadioBtn1.click();
		Reporter.log("Internet_Service_RadioBtn Yes is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
}
