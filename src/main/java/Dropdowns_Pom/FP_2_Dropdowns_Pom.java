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

public class FP_2_Dropdowns_Pom
{

	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement School_District;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement School_District_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Former_School_Type;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[504]") private WebElement Former_School_Type_1;
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Name_Of_Former_School;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Previous_Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[513]") private WebElement Previous_Grade_1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public FP_2_Dropdowns_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set_School_District(WebDriver driver) throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("(//label[contains(.,'School District of Residence ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'School District of Residence ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'School District of Residence ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'School District of Residence ')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'School District of Residence ')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
	
	}
	
	public void set_Former_School_Type(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'Type of Former School (Other Than Pre-School)')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'Type of Former School (Other Than Pre-School)')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Type of Former School (Other Than Pre-School)')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Type of Former School (Other Than Pre-School)')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Type of Former School (Other Than Pre-School)')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
	
	}
	
	
	
	public void set_Previous_Grade(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'Previous Grade')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'Previous Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Previous Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Previous Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Previous Grade')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
	
	}
	
	
	
	
}
