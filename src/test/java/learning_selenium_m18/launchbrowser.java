package learning_selenium_m18;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowser {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.instagram.com");
		
	}	
	
	}
