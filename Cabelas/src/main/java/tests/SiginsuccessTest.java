package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import pages.signInPage;

public class SiginsuccessTest {
	private WebDriver driver;
	signInPage signinpage;
	
	@BeforeTest
	public void beforeTest() {
		
		
	}
	
	@AfterTest
	  public void afterTest() {
		 // driver.close();
	  }	
	
	@Test(priority = 0)
	public void signinsuccess() throws InterruptedException {
		WebElement signlink = signinpage.signinlink();
		WebElement user = signinpage.emailUser();
		WebElement pass = signinpage.passwordUser();
		WebElement signbutton = signinpage.signbutton();
		
		signlink.click();
		user.sendKeys("maumoralestestapplaudo@gmail.com");
		pass.sendKeys("testapplaudo1pass");
		signbutton.click();
		
	}

}
