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

public class EmptyAccountTest {
	private WebDriver driver;
	signInPage signinpage;
	
	@BeforeMethod
	public void beforeTest() {
		signinpage = new signInPage(driver);
		driver = signinpage.driverFirefox();
		
		
	}
	
	@AfterMethod
	  public void afterTest() {
		  driver.close();
	  }	
	
	@Test
	public void signinsuccess() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		WebElement signlink = signinpage.signinlink();
		signlink.click();
		
		
		WebElement pass = signinpage.passwordUser();
		pass.sendKeys("passapplaudotest1");
		
		WebElement signbutton = signinpage.signbutton();
		signbutton.click();
		
		WebElement error = signinpage.errormessage();
		boolean condition = error.isDisplayed();
		Assert.assertTrue(condition);
		Assert.assertEquals(error.getText(), "Please provide an email address.");
		System.out.println(error.getText());
		System.out.println("Usuario no ha ingresado email");
		
	}
}
