package seleniumConcepts;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PractiseFormPageObject {
	
	@FindBy(name = "firstname")
	public WebElement firstname;
	
	@FindBy(name = "firstname")
	@CacheLookup
	public WebElement firstnameCache;
	
	@FindBy(name = "lastname")
	public WebElement lastname;
	
	
	

}
