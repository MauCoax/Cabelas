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

public class EmptyPassTest {
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
		user.sendKeys("maumoralestestapplaudo@gmail.com");
		
		
		WebElement signbutton = signinpage.signbutton();
		signbutton.click();
		
		WebElement error = signinpage.errormessage();
		boolean condition = error.isDisplayed();
		System.out.println(error.getText());
		Assert.assertTrue(condition);
		Assert.assertEquals(error.getText(), "Please provide a valid password.");
		System.out.println("Usuario no ha ingresado contrasena");
		
	}

}
