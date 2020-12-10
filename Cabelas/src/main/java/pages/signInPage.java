package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageFactory.*;

public class signInPage extends Base {
	
	By signinLink = By.xpath("//span[contains(text(),'Sign In')]");
	By email = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]");
	By password = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]");
	By signinButton = By.linkText("Sign In");
	

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

}
