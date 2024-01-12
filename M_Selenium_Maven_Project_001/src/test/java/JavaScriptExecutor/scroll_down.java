package JavaScriptExecutor;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_Class;

public class scroll_down extends Base_Class{

	public static void main(String[] args) throws IOException {
		launch_browser("chrome");
		navigate("https://www.redbus.in/");
		takescreenshot("Red bus before scroll page");
		
		//Scroll page as per give specific value
	    JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//		takescreenshot("red bus after scroll page");
		
         //Scroll page at bottom/end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight");
		takescreenshot("get a shot at the end");
	}

}
