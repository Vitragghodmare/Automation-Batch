package Action_class_for_mouse_action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_class.Base_Class;

public class Mouse_action_MoveToElement extends Base_Class {

	public static void main(String[] args) throws IOException, InterruptedException {

		launch_browser("chrome");
		navigate("https://www.amazon.in/");
		takescreenshot("Amazon Home page");

		// Action class (create object of actions class)

		Actions act = new Actions(driver);

		// move toward element (1st way to used return type web element)
		WebElement link = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 icp-link-style-2']"));
		act.moveToElement(link).build().perform();
		Thread.sleep(2000);
		takescreenshot("move to curser language");

		// move to element (2nd way to used ref. variable and directly used methodname.MoveToElement)
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(2000);
		takescreenshot("move to curser account list");
		
		
		
		
	}

}
