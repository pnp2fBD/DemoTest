package seleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksOnPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\sw\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		// get the count of all links on a webpage
		// display the text of each link it contain
		
		List<WebElement>  lnkList = driver.findElements(By.tagName("a"));
		
		List<WebElement>  inputList = driver.findElements(By.tagName("input"));
		
		List<WebElement>  btnList = driver.findElements(By.tagName("button"));
		
		List<WebElement>  checkboxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		List<WebElement>  radioList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Total count of Links  " + lnkList.size());
		System.out.println("Total count of Input  " + inputList.size());
		System.out.println("Total count of Button " + btnList.size());
		System.out.println("Total count of Checkbox " + checkboxList.size());
		System.out.println("Total count of Radio " + radioList.size());
		
		/*	
	    System.out.println("********************Links*********************");
		for(int i=0; i< lnkList.size(); i++){
			System.out.println("Link Text is " + lnkList.get(i).getText());
		}*/
		
		System.out.println("********************Inputs*********************");
		for(int i=0; i< inputList.size(); i++){
			System.out.println("Input are " + inputList.get(i).getAttribute("name"));
		}
		
		System.out.println("********************Button*********************");
		for(int i=0; i< btnList.size(); i++){
			System.out.println("Button are " + btnList.get(i).getAttribute("name"));
		}
		
		System.out.println("********************Checkbox*********************");
		for(int i=0; i< checkboxList.size(); i++){
			System.out.println("CheckBox are " + checkboxList.get(i).getAttribute("value"));
			checkboxList.get(i).click();
		}
		
		System.out.println("********************Radio *********************");
		for(int i=0; i< radioList.size(); i++){
			System.out.println("Radio are " + radioList.get(i).getAttribute("value"));
			radioList.get(i).click();
		}
		
		/*driver.close();
		driver.quit();*/
	}

}
