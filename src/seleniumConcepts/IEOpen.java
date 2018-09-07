package seleniumConcepts;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEOpen {
	
	
	       
	public static void main(String[] args) {
	              // TODO Auto-generated method stub
	              
	//
	              
	            DesiredCapabilities ieCapabilities = new DesiredCapabilities();
	              
	          //ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	               
	            ieCapabilities.setCapability("enablePersistentHover", false);
	            ieCapabilities.setCapability("nativeEvents", false);
	            ieCapabilities.setCapability("requireWindowFocus", true);
	            ieCapabilities.setCapability("ignoreZoomSetting", true);
	            ieCapabilities.setCapability("ie.ensureCleanSession", true);
	            ieCapabilities.setCapability("enableElementCacheCleanup", true);
	      
	            ieCapabilities.setCapability("allow-blocked-content", true);
	            ieCapabilities.setCapability("allowBlockedContent", true);
	    
	            //ieCapabilities.setPlatform(Platform.fromString("WINDOWS"));
	            //ieCapabilities.setVersion("10");
	         
	           System.out.println("capabilities--"+ ieCapabilities);
	               File file = new File("C:\\sw\\IEDriverServer.exe");
	               System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	               WebDriver driver = new InternetExplorerDriver(ieCapabilities);        
	               driver.get("http://aldvmweb01.siriusfs.com/CoreSIT/UI/component/base/htm/base_homePage.htm?systemID=CoreSIT");
	       }

	}



