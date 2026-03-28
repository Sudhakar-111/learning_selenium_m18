package Learning_TestNG;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Properties_File {

	@Test(dataProvider = "logindataprovider")
	public void loginTest( ) throws Exception{
		
		FileInputStream fis =new FileInputStream("./src/main/resources/commomData.properties");
		Properties property= new Properties();
		property.load(fis);
		
		String url = property.getProperty("url");
		String email = property.getProperty("email");
		String password = property.getProperty("password");
		
	
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get(url);
	    driver.findElement(By.id("Email")).sendKeys(email);
	    driver.findElement(By.id("Password")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}

