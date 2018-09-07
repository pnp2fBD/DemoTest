package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\sw\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody//tr"));
		
		System.out.println("Rows " + rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody//th"));
		
		
		System.out.println("Cols " +cols.size());

	}

}
