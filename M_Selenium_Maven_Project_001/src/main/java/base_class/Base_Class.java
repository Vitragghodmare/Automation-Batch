package base_class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_Class {
	
	public static WebDriver driver;  //globaly define 
	public static String projectpath = System.getProperty("user.dir");
	
	//dynamic code for launch browser
	
	public static void launch_browser(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver(); 
		 System.out.println("Launch Browser is:-" +browser);
		
	  }else if (browser.equalsIgnoreCase("Edge")) {
		   driver = new EdgeDriver(); 
		   System.out.println("Launch Browser is:-" +browser);
	  }
	  else if (browser.equalsIgnoreCase("firefox")) {
	    	 driver = new FirefoxDriver(); 
	    	 System.out.println("Launch Browser is:-" +browser);
	  }
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	//Dynamic code for Navigate URL
     public static void navigate(String url) {
    	driver.get(url);
     }
     
    	// Create Dynamic code of Screen Shot
    	
    	public static void takescreenshot(String screenshotname) throws IOException {
    	TakesScreenshot ts = (TakesScreenshot) driver;
	    File Source = ts.getScreenshotAs(OutputType.FILE);
	    File target = new File(projectpath+"\\ScreenShot\\"+screenshotname+".png");
		FileHandler.copy(Source, target);
    	}
		
	}


