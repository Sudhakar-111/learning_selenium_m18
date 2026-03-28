package Search_Context_Interface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice_tasks {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.findElement(By.name("q")).sendKeys("mobile");
        driver.findElement(By.className("kV1UjG")).click();
        

        
        List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='nZIRY7']"));
        
        for(int i=0;i<24 && i<mobiles.size();i++ ) {
        	
        	 
        	
        	File source = mobiles.get(i).getScreenshotAs(OutputType.FILE);
        	
        	File destination = new File("./takescreenshots/mobileNo_"+ (i+1) + ".png");
        	
        	FileHandler.copy(source, destination);
        			}
}
}