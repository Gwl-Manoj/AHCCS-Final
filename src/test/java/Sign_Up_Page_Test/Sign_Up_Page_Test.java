package Sign_Up_Page_Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Sign_Up_Page_POM.Sign_Up_Page_Pom;

public class Sign_Up_Page_Test extends Achievement_Charter_Excel_Data_BaseClass
{

	Sign_Up_Page_Pom Signup;
	
	@Parameters("browsername")
	@BeforeClass
	public void OpenBrowser(String browsername) throws InterruptedException
	{
		open_browser(browsername);	
		
		Signup = new Sign_Up_Page_Pom(driver);
	}
	
	@Test
	public void Login_With_multiple_data() throws InterruptedException, IOException
	{
		
		Signup.SignUp_With_Multiple_data(driver);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
}
