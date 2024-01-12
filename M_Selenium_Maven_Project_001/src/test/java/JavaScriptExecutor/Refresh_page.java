package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_Class;

public class Refresh_page extends Base_Class{

	public static void main(String[] args) {
	
		launch_browser("chrome");
		navigate("https://www.redbus.in/");
		
		//For refresh page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.go(0)");
		
		driver.findElement(By.xpath("//li[@id='cab_rental_vertical']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
