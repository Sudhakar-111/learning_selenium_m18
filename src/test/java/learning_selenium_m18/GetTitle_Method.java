package learning_selenium_m18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.instagram.com");
		
		//fetch the title of current web page
		String title = driver.getTitle();
		
		if(title.contains("long in")) {
			System.out.println("PASS-> Login Page is displayed successfully...");
		}else {
			System.out.println("FAIL-> Login Page not displayed...");
		}
		//driver.quit();
	}

}
