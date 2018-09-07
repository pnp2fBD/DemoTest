package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\sw\\chromedriver.exe");
		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\sw\\IEDriverServer.exe");
		
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability("enablePersistentHover", false);
		ieCapabilities.setCapability("nativeEvents", false);
		ieCapabilities.setCapability("requireWindowFocus", true);
		ieCapabilities.setCapability("ignoreZoomSetting", true);
		ieCapabilities.setCapability("ie.ensureCleanSession", true);				
		ieCapabilities.setCapability("enableElementCacheCleanup", true);
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//ieCapabilities.setPlatform(Platform.fromString(platform));
//		
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.freecrm.com");
		
		driver.get("http://aldvmstweb02.siriusfs.com/EngagementCentre/servletcontroller");
		
		driver.findElement(By.xpath("//*[@id='C2__QUE_ED508ADA5C44080859323']")).sendKeys("AutoTestUser001");
		
		driver.findElement(By.xpath("//*[@id='C2__QUE_ED508ADA5C44080859331']")).sendKeys("Passw0rd");
		
		driver.findElement(By.xpath("//button[@id='C2__BUT_ED508ADA5C44080859357']")).click();;
		
				
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SunilKr");
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("freecrm@1234");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit'and @value='Login']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Babu Lal']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@type='checkbox' and @name='contact_id']")).click();
		
		Thread.sleep(3000);
				
		driver.close();
		
		driver.quit();
	}

}
