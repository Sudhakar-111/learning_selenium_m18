package WebDriver_Methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mangage_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chromedriver","./src/main/resources/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.instagram.com/");
     
     //Fetch the height of browser window
     Options options = driver.manage();
     Window window = options.window();
     Dimension size = window.getSize();    //toString() is overridden
     System.out.println(size);
     int height = size.getHeight();
     System.out.println(height);
     int width = size.getWidth();
     System.out.println(width);
     
     System.out.println("-----------------------------");
     
     
     int height2 = driver.manage().window().getSize().getHeight();
     int width2  = driver.manage().window().getSize().getWidth();
     System.out.println(height2);
     System.out.println(width2);
     System.out.println(size);
    		 
	}

}
