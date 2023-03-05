package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//Launch the chrome browser.
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement staticDropdown= driver.findElement(By.id("dropdown-class-example")/*StaticDropdown address*/);
		Select dropdown=new Select(staticDropdown);//Select is a class and we have created it's
		//obeject to use the select class's methods through their object reference, after creating the object of
		//select class, it will recruit a WebElement(i.e Static dropdown) as an argument. So before pass that
		//WebElement, we have to assign the address of the WebElement to a WebElement datatype/returntype variable(i.e
		// here staticDropdown).
		dropdown.selectByIndex(3);//Select class method
		System.out.println(dropdown.getFirstSelectedOption().getText()/*Select class method*/);
		dropdown.selectByVisibleText("Option2");/*Select class method*/
		System.out.println(dropdown.getFirstSelectedOption().getText()/*Select class method*/);
		dropdown.selectByValue("option1");
		System.out.println(dropdown.getFirstSelectedOption().getText()/*Select class method*/);
		
	}

}
