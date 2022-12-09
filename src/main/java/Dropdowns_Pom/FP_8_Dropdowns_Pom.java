package Dropdowns_Pom;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Library_Files.Utility;

public class FP_8_Dropdowns_Pom 
{
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Name;
	@FindBy (xpath = "(//input[@class='form-control'])[2]") private WebElement Case_Number;
	@FindBy(xpath = "(//div[@class='fs-label'])[1]") private WebElement People_Count;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[2]") private WebElement People_Count_1;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[3]") private WebElement People_Count_2;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[4]") private WebElement People_Count_3;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[5]") private WebElement People_Count_4;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[6]") private WebElement People_Count_5;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[7]") private WebElement People_Count_6;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[8]") private WebElement People_Count_7;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[9]") private WebElement People_Count_8;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[10]") private WebElement People_Count_9;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[11]") private WebElement People_Count_10;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Annual_Salary;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[14]") private WebElement Annual_Salary_1;


	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;

	public FP_8_Dropdowns_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void set_People_Count(WebDriver driver) throws InterruptedException
	{

		driver.findElement(By.xpath("/html/body/div/section/div/div[2]/div/form/div/div[5]/div/div[1]/div")).click();
		
		int length = driver.findElements(By.xpath("/html/body/div/section/div/div[2]/div/form/div/div[5]/div/div[2]/div[3]/div")).size();
		System.out.println(length);
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("(/html/body/div/section/div/div[2]/div/form/div/div[5]/div/div[2]/div[3]/div)["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("(/html/body/div/section/div/div[2]/div/form/div/div[5]/div/div[2]/div[3]/div)["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("/html/body/div/section/div/div[2]/div/form/div/div[5]/div/div[1]/div")).click();
			Thread.sleep(1000);
		}

	}

	public void set_Annual_Salary(WebDriver driver) throws InterruptedException
	{

		
		Actions act = new Actions(driver);
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_1).click().perform();
		Reporter.log("For People count 1", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
		
		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_2).click().perform();
		Reporter.log("For People count 2", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length1 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length1; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}

		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_3).click().perform();
		Reporter.log("For People count 3", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length2 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length2; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_4).click().perform();
		Reporter.log("For People count 4", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length3 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length3; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}


		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_5).click().perform();
		Reporter.log("For People count 5", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length4 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length4; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_6).click().perform();
		Reporter.log("For People count 6", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length6 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length6; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}

		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_7).click().perform();
		Reporter.log("For People count 7", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length7 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length7; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}

		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_8).click().perform();
		Reporter.log("For People count 8", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length8 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length8; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}

		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_9).click().perform();
		Reporter.log("For People count 9", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length9 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length9; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}

		
		act.moveToElement(People_Count).click().perform();
		act.moveToElement(People_Count_10).click().perform();
		Reporter.log("For People count 10", true);
		Reporter.log(" ", true);
		Thread.sleep(2000);
		
		driver.findElement(By.id("save_form")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length10 = driver.findElements(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length10; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'Annual Salary Range – Please Check One')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}



	}





}
