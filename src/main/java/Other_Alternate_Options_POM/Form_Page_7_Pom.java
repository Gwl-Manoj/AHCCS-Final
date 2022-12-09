package Other_Alternate_Options_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_7_Pom 
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
	
	
	@FindBy(xpath = "//div[@class='custom-control custom-checkbox mt-4']") private WebElement CheckBox;
	@FindBy(xpath = "//a[@class='remove_button']") private WebElement RemoveStudent;
	
	

	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	public Form_Page_7_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void Set_Student_Name(String student_Name) throws InterruptedException
	{
		Student_Name.clear();
		Student_Name.sendKeys(student_Name);
		
	}
	
	public void set_Grade(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions act = new Actions(driver);
		act.moveToElement(Grade).click().perform();
		act.moveToElement(Grade_1).click().perform();
		
	}
	
	public void set_Year(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
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
	
	public void Click_CheckBox() throws InterruptedException
	{
		CheckBox.click();
		Reporter.log("The checkBox is selected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void Click_Add_Student_Button(WebDriver driver) throws InterruptedException
	{
		Add_Student_Button.click();
		Reporter.log("The New Student is added", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	
	}
	
	public void Set_Student_Name1(String student_Name1) throws InterruptedException
	{
		Student_Name1.clear();
		Student_Name1.sendKeys(student_Name1);
		Reporter.log("Student Name is entered "+student_Name1, true);
		
	}
	
	public void set_Grade1(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Actions act = new Actions(driver);
		act.moveToElement(Grade1).click().perform();
		act.moveToElement(Grade_2).click().perform();
		
	}
	
	public void set_Year1(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Year1).click().perform();
		act.moveToElement(Year_2).click().perform();
		
	}
	
	public void set_Month1(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Month1).click().perform();
		act.moveToElement(Month_2).click().perform();
		
	}
	
	public void set_Day1(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(Day1).click().perform();
		act.moveToElement(Day_2).click().perform();
		
	}
	
	public void Click_CheckBox1() throws InterruptedException
	{
		CheckBox.click();
		Reporter.log("The checkBox is Deselected", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	public void Click_Remove_Student() throws InterruptedException
	{
		RemoveStudent.click();
		Reporter.log("The student is removed", true);
		Reporter.log("																", true);
		Thread.sleep(2000);
	}
	
	
	
	
	
	public void Click_CheckBoxes(WebDriver driver) throws InterruptedException
	{
		
		
		int length = driver.findElements(By.xpath("//label[@class='custom-control-label']")).size();
		
		System.out.println(length);
		for(int i=2; i<=length; i++)
		{
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])["+i+"]")).click();
			Reporter.log("The checkbox is selected"+i+" ", true);
			Reporter.log(" ", true);
			Thread.sleep(2000);
			Next_Btn.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='custom-control-label'])["+i+"]")).click();
			Reporter.log("The checkbox is Deselected"+i+" ", true);
			Reporter.log(" ", true);
			Thread.sleep(2000);
		}
		
		
	}
 
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	
	
	
}
