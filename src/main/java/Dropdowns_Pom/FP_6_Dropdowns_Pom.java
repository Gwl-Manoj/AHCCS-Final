package Dropdowns_Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FP_6_Dropdowns_Pom 
{

	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Full_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[3]") private WebElement Primary_Parent_Email;
	@FindBy(xpath = "(//input[@class='form-control'])[4]") private WebElement Primary_Parent_Phone;
	@FindBy(xpath = "(//input[@class='form-control'])[5]") private WebElement Primary_Parent_Employeer;
	@FindBy(xpath = "(//input[@class='form-control'])[6]") private WebElement Work_number;
	@FindBy(xpath = "(//input[@class='form-control'])[7]") private WebElement Work_Email;
	@FindBy(xpath = "(//div[@class='fs-label'])[2]") private WebElement Contact_Option;
	@FindBy(xpath = "(//div[@class='fs-option-label'])[27]") private WebElement Contact_Option_1;
	@FindBy(xpath = "(//input[@class='form-control'])[8]") private WebElement Contact_Language;
	@FindBy(xpath = "(//input[@class='form-control'])[9]") private WebElement Name;
	@FindBy(xpath = "(//input[@class='form-control'])[10]") private WebElement Email;
	@FindBy(xpath = "(//input[@class='form-control'])[11]") private WebElement Relationship_With_Student;
	@FindBy(xpath = "(//input[@class='form-control'])[12]") private WebElement Phone_Number;
	@FindBy(xpath = "(//input[@class='form-control'])[13]") private WebElement Name1;
	@FindBy(xpath = "(//input[@class='form-control'])[14]") private WebElement Email1;
	@FindBy(xpath = "(//input[@class='form-control'])[15]") private WebElement Relationship_With_Student1;
	@FindBy(xpath = "(//input[@class='form-control'])[16]") private WebElement Phone_Number1;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	public FP_6_Dropdowns_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	public void set_Contact_Option(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//label[contains(.,'How would you prefer to be contacted?')])[1]//following-sibling::div//div[@class='fs-label']")).click();
		
		int length = driver.findElements(By.xpath("(//label[contains(.,'How would you prefer to be contacted?')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index]")).size();
		
		for (int i = 2; i <= length; i++)
		{
		
			String option = driver.findElement(By.xpath("((//label[contains(.,'How would you prefer to be contacted?')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).getText();
			
			Reporter.log(option, true);
			Reporter.log(" ", true);
			
			driver.findElement(By.xpath("((//label[contains(.,'How would you prefer to be contacted?')])[1]//following-sibling::div/div[@class='fs-dropdown']//div[@data-index])["+i+"]")).click();
			Thread.sleep(1000);
			
			
			
			driver.findElement(By.id("save_form")).click();
			Thread.sleep(1000);
			
			
			driver.navigate().back();
			Thread.sleep(1000);
			// Its a fail-safe to make sure the dropdown is opened 
			driver.findElement(By.xpath("(//label[contains(.,'How would you prefer to be contacted?')])[1]//following-sibling::div//div[@class='fs-label']")).click();
			Thread.sleep(1000);
		}
		
	}
	
	
	
	
	
}
