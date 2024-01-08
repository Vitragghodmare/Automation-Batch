package launch_browser;

import org.openqa.selenium.By;

import base_class.Base_Class;

public class Launch_browser_002 extends Base_Class{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("bags for men");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//img[@class=\"s-image\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
	}
	
}
