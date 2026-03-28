package Practice_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1_Flipkart {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		 // 🔹 Close login popup using try-catch
        try {
            WebElement closeBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='✕']")));
            closeBtn.click();
        } catch (Exception e) {
            System.out.println("Login popup not displayed");
        }
		
		driver.findElement(By.xpath("//input[@type='text' and @class='nw1UBF v1zwn25'][1]")).sendKeys("laptop");
		driver.findElement(By.className("XFwMiH")).click();
		
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling::div")).click();
	}
}
