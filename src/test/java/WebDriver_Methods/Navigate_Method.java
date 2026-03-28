package WebDriver_Methods;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);

     driver.navigate().to("https://www.instagram.com/");
     Thread.sleep(3000);
     
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     
     URL url = new URL("https://www.flipkart.com/");
     driver.navigate().to(url);
     Thread.sleep(3000);
     
     driver.close();
     
     //any component is striked -> depricated(not is use)
     //in future update is will get remote
     
		}

}
