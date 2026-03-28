package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.net.Urls;

public class Navigation_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
		     
		     // welcome page
		     driver.get("https://demowebshop.tricentis.com/");
		     Thread.sleep(2000);
		     
		     String title1 = driver.getTitle();
		        String url1 = driver.getCurrentUrl();

		        System.out.println("Welcome Page Title: " + title1);
		        System.out.println("Welcome Page URL: " + url1);
		        
		        if(title1.contains("Demo Web Shop")) {
		        	System.out.println("Pass the validation");
		        }else {
		        	System.out.println("Failed the validation");
		        }
		        
		        System.out.println("----------------------");
		        
		        //navigate the register page
		        driver.navigate().to("https://demowebshop.tricentis.com/register");
		        Thread.sleep(2000);
		        

		        String title2 = driver.getTitle();
		        String url2 = driver.getCurrentUrl();

		        System.out.println("Register Page Title: " + title2);
		        System.out.println("Register Page URL: " + url2);

		        if (title2.contains("Register")) {
		            System.out.println("Register Page validation PASSED");
		        } else {
		            System.out.println("Register Page validation FAILED");
		        }

		        System.out.println("----------------------");
		        
		        // 3. Login Page
		        driver.navigate().to("https://demowebshop.tricentis.com/login");
		        Thread.sleep(2000);

		        String title3 = driver.getTitle();
		        String url3 = driver.getCurrentUrl();

		        System.out.println("Login Page Title: " + title3);
		        System.out.println("Login Page URL: " + url3);

		        if (title3.contains("Login")) {
		            System.out.println("Login Page validation PASSED");
		        } else {
		            System.out.println("Login Page validation FAILED");
		        }

		      //close the browser  
		  driver.close();
	}
}
