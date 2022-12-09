package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_Page_10_Pom
{

@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_10_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
}
