package Pom_classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Form_Page_4_Pom
{
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-4'])[1]") private WebElement Checkbox_1;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-4'])[2]") private WebElement Checkbox_2;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-4'])[3]") private WebElement Checkbox_3;
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox mt-4'])[4]") private WebElement Checkbox_4;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	
	
	
	public Form_Page_4_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_Checkbox_1()
	{
		if(Checkbox_1.isSelected())
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
		if(Checkbox_2.isSelected())
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
		if(Checkbox_3.isSelected())
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
		if(Checkbox_4.isSelected())
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
	
	public void Fill_Form_Page_4() throws InterruptedException, EncryptedDocumentException, IOException
	{
		click_Checkbox_1();
		
		click_Checkbox_2();
		
		click_Checkbox_3();
		
		click_Checkbox_4();
		
		Click_Next_Btn();
		
		
	}
}
