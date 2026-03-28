package Search_Context_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_of_Webpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File("./takescreenshots/facebook.png");
		 
		 FileHandler.copy(source, destination);
	}

}
