package Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//Launch the chrome browser.
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		Thread.sleep(2000);
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();/*The "getWindowHandles()" method returns 
		set of strings(I.e parentwindowID string,childwindowID string) means it grab all the windows id*/
		Iterator<String> It=windows.iterator();/*the iterator() method will extract the above Set collection means the parentwindowID string,childwindowID string */
		String parentwindowID=It.next();/*The 1st next() method will grab the 0th index value*/
		String childwindowID=It.next();/*The  2st next() method will grab the 1th index value*/
		driver.switchTo().window(childwindowID); 
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());//(a paragraph of child window)
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
	
	}
}