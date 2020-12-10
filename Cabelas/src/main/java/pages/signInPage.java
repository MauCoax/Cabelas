package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageFactory.*;

public class signInPage extends Base {
	
	By signinLink = By.id("Header_GlobalLogin_signInQuickLink");
	By email = By.xpath("//input[@id='Header_GlobalLogin_WC_AccountDisplay_FormInput_logonId_In_Logon_1']");
	By password = By.xpath("//input[@id='Header_GlobalLogin_WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']");
	By signinButton = By.id("Header_GlobalLogin_WC_AccountDisplay_links_2");
	By errorMessage = By.xpath("//div[@id='bp-alert-textId']");
	

	public signInPage(WebDriver driver) {
		super(driver);
	}
	
	
	public WebElement signinlink() {
		
		WebElement signinlink = findElement(signinLink);
		
		return signinlink;
	}
	
	public WebElement emailUser() {
		
		WebElement emailUser = findElement(email);
		
		return emailUser;
	}
	
	public WebElement passwordUser() {
		
		WebElement passwordUser = findElement(password);
		
		return passwordUser;
	}
	
	public WebElement signbutton() {
		
		WebElement signbutton = findElement(signinButton);
		
		return signbutton;
	}
	
	public WebElement errormessage() {
		
		WebElement errormessage = findElement(errorMessage);
		
		return errormessage;
	}

}
