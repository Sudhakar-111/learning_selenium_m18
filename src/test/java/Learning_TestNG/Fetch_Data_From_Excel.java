package Learning_TestNG;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_utilities.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetch_Data_From_Excel {

	@Test
	public void RegisterTest() throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/LoginData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row .getCell(0);
		//fetch the data from cell

		String gender =cell.toString();
		String firstName =row.getCell(1).getStringCellValue();
		String lastName= row.getCell(2).toString();
		String email = row.getCell(3).toString();
		String password= row.getCell(4).toString();
		String comfirmpassword=row.getCell(5).toString();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(File_Utility.getPropertyData("url"));

		driver.findElement(By.linkText("Register")).click();
		if (gender.equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
		} else {    driver.findElement(By.id("gender-female")).click();
	}

		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(comfirmpassword);
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
