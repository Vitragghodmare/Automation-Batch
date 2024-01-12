package launch_browser;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base_class.Base_Class;

public class Takescreenshot extends Base_Class{

	public static void main(String[] args) throws IOException {
		
		launch_browser("chrome");

		navigate("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("bags for men");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();

		// To get root directory
		String projectpath = System.getProperty("user.dir");

		// Take Screen Shot

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		// File Target = new
		// File("/M_Selenium_Maven_Project_001/ScreenShot/homepage.png");
		File target = new File(projectpath + "\\ScreenShot\\homepage.png");
		org.openqa.selenium.io.FileHandler.copy(Source, target);
		
	}
	
}
