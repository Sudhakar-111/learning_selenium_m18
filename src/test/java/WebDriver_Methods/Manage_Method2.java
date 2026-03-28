package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Method2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.instagram.com/");
       Thread.sleep(2000);
       
       //maximize
       driver.manage().window().maximize();
       Thread.sleep(2000);
       
       //fullscreen
       driver.manage().window().fullscreen();
       Thread.sleep(2000);
       
       //Fetch the size
       Dimension size2 = driver.manage().window().getSize();
       System.out.println(size2);
       
       //update the size
       driver.manage().window().setSize(new Dimension(1000,500));
        Thread.sleep(2000);
        driver.quit();
       }
	   
}

