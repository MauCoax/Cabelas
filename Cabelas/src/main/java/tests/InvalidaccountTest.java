package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.signInPage;

public class InvalidaccountTest {
	private WebDriver driver;
	signInPage signinpage;
	
	@BeforeMethod
	public void beforeTest() {
		signinpage = new signInPage(driver);
		driver = signinpage.driverChrome();
		
		
	}
	
	@AfterMethod
	  public void afterTest() {
		  driver.close();
	  }	
	
	@Test
	public void signinsuccess() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement signlink = signinpage.signinlink();
		signlink.click();
		
	
		WebElement user = signinpage.emailUser();
		user.sendKeys("maumolestestapplaudo@gmail.com");
		
		WebElement pass = signinpage.passwordUser();
		pass.sendKeys("passapplaudotest1");
		
		WebElement signbutton = signinpage.signbutton();
		signbutton.click();
		
		WebElement error = signinpage.errormessage();
		boolean condition = error.isDisplayed();
		Assert.assertTrue(condition);
		System.out.println("Usuario con cuenta incorrecta");
		
	}
}
