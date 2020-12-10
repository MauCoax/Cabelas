package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import pages.signInPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SiginsuccessTest {
	private WebDriver driver;
	signInPage signinpage;
	
	@BeforeTest
	public void beforeTest() {
		signinpage = new signInPage(driver);
		driver = signinpage.driverChrome();
		
		
	}
	
	@AfterTest
	  public void afterTest() {
		  //driver.close();
	  }	
	
	@Test
	public void signinsuccess() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement signlink = signinpage.signinlink();
		signlink.click();
		
	
		WebElement user = signinpage.emailUser();
		user.sendKeys("maumoralestestapplaudo@gmail.com");
		
		WebElement pass = signinpage.passwordUser();
		pass.sendKeys("testapplaudo2pass");
		
		WebElement signbutton = signinpage.signbutton();
		signbutton.click();
		
		
		System.out.println("Usuario ingreso a su cuenta con exito");
		
	}
	

}
