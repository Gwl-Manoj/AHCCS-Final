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

public class FP_7_Dropdowns_Pom 
{
	

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Student_Name;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement Grade;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement Grade_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Year;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[11]") private WebElement Year_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[3]") private WebElement Month;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[35]") private WebElement Month_1;
	@FindBy(xpath = "(//div[@class='fs-label'])[4]") private WebElement Day;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[48]") private WebElement Day_1;
	
	@FindBy(xpath = "//a[@class='add_button']") private WebElement Add_Student_Button;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Student_Name1;
	@FindBy(xpath = "(//div[@class='fs-label'])[5]") private WebElement Grade1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[78]") private WebElement Grade_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[6]") private WebElement Year1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[87]") private WebElement Year_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[7]") private WebElement Month1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[101]") private WebElement Month_2;
	@FindBy(xpath = "(//div[@class='fs-label'])[8]") private WebElement Day1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[117]") private WebElement Day_2;
	
	
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[1]") private WebElement Earning_from_weges;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[3]") private WebElement Earning_from_weges1;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[5]") private WebElement Earning_from_weges2;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[9]") private WebElement Earning_from_weges9;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[13]") private WebElement Earning_from_weges13;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-3'])[15]") private WebElement Earning_from_weges15;
			
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public FP_7_Dropdowns_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void set_Grade(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'Grade')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Grade')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Grade')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
			
		}
		
		
	}
	
	public void set_Year(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Year).click().perform();
		act.moveToElement(Year_1).click().perform();
		
	}
	
	public void set_Month(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Month).click().perform();
		act.moveToElement(Month_1).click().perform();
		
	}
	
	public void set_Day(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Day).click().perform();
		act.moveToElement(Day_1).click().perform();
		
	}
	
	
	
	
	
}
