package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	protected WebDriver driver;

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	// crear driver para navegadores
	// driver chrome
	public WebDriver driverChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		return driver;
	}

	// driver de firefox
	public WebDriver driverFirefox() {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		return driver;
	}

	// driver de IE
	public WebDriver driverIE() {
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		DesiredCapabilities cappabilities = DesiredCapabilities.internetExplorer();
		cappabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cappabilities.setCapability("platform", "WIN8");
		cappabilities.setCapability("version", "11");
		cappabilities.setCapability("browserName", "internet explorer");
		cappabilities.setCapability("ignoreProtectedModeSettings", 1);
		cappabilities.setCapability("nativeEvents", "false");
		cappabilities.setCapability("requireWindowFocus", "true");
		driver = new InternetExplorerDriver(cappabilities);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		return driver;
	}


}
