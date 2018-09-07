package seleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailUnread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\sw\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		
		// get the count of all links on a webpage
		// display the text of each link it contain
		
		List<WebElement>  unread = driver.findElements(By.xpath(".//span[@class='zF']"));
		
		for(int i= 0;i < unread.size(); i++){
			
			System.out.println(" "  + unread.get(i).getText());
		}
			
		
				
	

	}

}
