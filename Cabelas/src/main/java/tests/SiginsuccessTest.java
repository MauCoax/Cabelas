package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import pages.signInPage;




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
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement signlink = signinpage.signinlink();
		signlink.click();
		
	
		WebElement user = signinpage.emailUser();
		user.sendKeys("maumoralestestapplaudo@gmail.com");
		
		WebElement pass = signinpage.passwordUser();
		pass.sendKeys("passapplaudotest1");
		
		WebElement signbutton = signinpage.signbutton();
		signbutton.click();
		
		System.out.println(driver.getTitle());
		System.out.println("Usuario ingreso a su cuenta con exito");
		
	}
	

}
