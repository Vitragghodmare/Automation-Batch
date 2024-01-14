package Action_class_for_mouse_action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_class.Base_Class;

public class Context_click extends Base_Class{

	public static void main(String[] args) throws IOException, InterruptedException{
		
		launch_browser("chrome");
		navigate("https://www.railyatri.in/");
		takescreenshot("home page rail yatri");
		
		Actions act = new Actions(driver);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='RY_vertical more_search hide_action']"));
		act.moveToElement(signin).contextClick().build().perform();
		Thread.sleep(2000);
		takescreenshot("Right click on more button from railyatri");
		
		
		
		
		
		
//		act.moveToElement(driver.findElement(By.xpath("//button[@id='btn_sign_in']"))).contextClick().build().perform();
//		Thread.sleep(2000);
//		takescreenshot("click on sign in button on jio mart");
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
