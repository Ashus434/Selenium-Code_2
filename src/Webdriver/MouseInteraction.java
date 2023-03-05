package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//Launch the chrome browser.
		driver.get("https://www.amazon.in/");
		WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a=new Actions(driver);/*Action is class and all kind of mouse, keyboard & user gesture can be done
		or can be automated with the help of action class in selenium webdriver*/
		/*Driver is being passed as an Argument so that Selenium is able to locate the element on the browser (driver).
		 Element is returned, so that an Action can be performed on it.*/
		a.moveToElement(move).build().perform();/*"moveToElement"
		is a method of action class. after writing the this method also bulid it and perform it with in a same statement*/
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("xbox").doubleClick().build().perform();
		/*The above method will enter the text in capital letter*/
		a.moveToElement(move).contextClick().build().perform();/*the contextClick() we are using for 
		right click on a webelement*/
	}
}
