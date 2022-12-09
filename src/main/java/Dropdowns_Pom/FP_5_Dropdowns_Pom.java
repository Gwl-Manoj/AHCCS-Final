package Dropdowns_Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class FP_5_Dropdowns_Pom 
{
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Ethinicity;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement Ethinicity_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Race;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[8]") private WebElement Race_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement State_Of_Birth;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[16]") private WebElement State_Of_Birth_1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	
	public FP_5_Dropdowns_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void set_Ethinicity(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("(//label[contains(.,'9. Ethnicity ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'9. Ethnicity ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'9. Ethnicity ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'9. Ethnicity ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'9. Ethnicity ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
	}
	
	public void set_Race(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'10. Race ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'10. Race ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'10. Race ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'10. Race ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'10. Race ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
	}
	
	public void set_State_Of_Birth(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'11. State of Birth ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'11. State of Birth ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'11. State of Birth ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'11. State of Birth ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'11. State of Birth ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
	}
	
	

	
}
