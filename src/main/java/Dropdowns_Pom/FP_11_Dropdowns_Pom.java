package Dropdowns_Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FP_11_Dropdowns_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Service_Provider;
	@FindBy(xpath = "(//div[@class='fs-label'])") private WebElement Type_Of_Connection;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[4]") private WebElement Type_Of_Connection_1;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Internet_Speed;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Internet_access;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public FP_11_Dropdowns_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void set_Type_Of_Connection(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'Type of connection')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'Type of connection')])[1]//following-sibling::div/div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Type of connection')])[1]//following-sibling::div/div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Type of connection')])[1]//following-sibling::div/div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Type of connection')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
	}
	
	
}
