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
	
	@Test(priority = 0)
	public void signinsuccess() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		WebElement signlink = signinpage.signinlink();
		
		//WebElement user = signinpage.emailUser();
		//WebElement pass = signinpage.passwordUser();
		WebElement signbutton = signinpage.signbutton();
		
		signlink.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated((By) signbutton));
		//user.sendKeys("maumoralestestapplaudo@gmail.com");
		//pass.sendKeys("testapplaudo1pass");

		signbutton.click();
		
	}
	

}
