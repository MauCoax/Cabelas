package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import pages.signInPage;




public class SiginsuccessTest {
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
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement signlink = signinpage.signinlink();
		signlink.click();
			
		WebElement user = signinpage.emailUser();
		user.sendKeys("maumoralestestapplaudo@gmail.com");
		
		WebElement pass = signinpage.passwordUser();
		pass.sendKeys("passapplaudotest1");
		
		WebElement signbutton = signinpage.signbutton();
		signbutton.click();
		Assert.assertTrue(signinpage.myAccountHeader().isDisplayed());
		Assert.assertEquals(driver.getTitle(), "My Account");
		
		System.out.println("Titulo de la pagina:"+ driver.getTitle());
		System.out.println("Usuario ingreso a su cuenta con exito");
		
	}
	

}
