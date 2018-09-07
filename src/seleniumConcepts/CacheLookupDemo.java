package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CacheLookupDemo {
	
	
	@Test
	public void TestFirstandLastFields()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\sw\\chromedriver.exe");
		System.setProperty("webdriver.chrome.logfile", "TestLog.txt");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
	
		PractiseFormPageObject PageObj = PageFactory.initElements(driver, PractiseFormPageObject.class);

		PageObj.firstname.sendKeys("TestF");
		PageObj.lastname.sendKeys("TestL");
		
		//Read the Text box values
		
		long withoutCacheStartTime = System.currentTimeMillis();
		for(int i = 0 ; i<1000 ; i++)
		{
			PageObj.firstname.getText();
		}
		long withoutCacheEndTime = System.currentTimeMillis();
		System.out.println("Without Cache Time consumed is: " + (withoutCacheEndTime - withoutCacheStartTime));

		
		long withoutCacheStartTime2 = System.currentTimeMillis();
		for(int i = 0 ; i<1000 ; i++)
		{
			PageObj.firstnameCache.getText();
		}
		long withoutCacheEndTime2 = System.currentTimeMillis();
		System.out.println("With CacheLookup Time consumed is: " + (withoutCacheEndTime2- withoutCacheStartTime2));
		
		
		
		
		driver.close();
		
		driver.quit();
	}

	
}
