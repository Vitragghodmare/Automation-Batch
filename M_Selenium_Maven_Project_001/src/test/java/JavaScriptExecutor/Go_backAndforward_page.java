package JavaScriptExecutor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_Class;

public class Go_backAndforward_page extends Base_Class{

	public static void main(String[] args) throws IOException {
		
		launch_browser("chrome");
		navigate("https://www.redbus.in/");
		takescreenshot("home page");
		driver.findElement(By.xpath("//li[@id='rail_tickets_vertical']")).click();
		takescreenshot("to next page rail tickets page");
		
		
		//go back page using back arrow <--
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");
		takescreenshot("after came on home page");
		
		// go forward page using forward arrow -->
		
		js.executeScript("window.history.forward()");
		takescreenshot("again go to rain ticket page");
		
		
	}

}
