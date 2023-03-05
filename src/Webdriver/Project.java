package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	
	public void chrome() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();//Launch the chrome browser.
	driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
	driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
	driver.findElement(By.xpath("//*[@id=\'checkBoxOption1']")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1']")).isSelected());
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
	
//	System.out.println(driver.getTitle());//validate if you page title is correct
//	System.out.println(driver.getCurrentUrl());//validate if you are landed on correct URL.
//	System.out.println(driver.getPageSource());//print page source.
//	driver.get("https://www.yahoo.com/");
//	driver.navigate().back();//Go back in the browser.
//    driver.navigate().forward();//Go forward in the browser.
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Project p=new Project();
		p.chrome();
	}
}





/*public void udemy() {
driver.findElement(By.id("divpaxinfo")).click();
   Thread.sleep(2000L);
   int i=1;
   while(i<5){
 driver.findElement(By.id("hrefIncAdt")).click();//4 times
 i++;}
   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
   for(int i=1;i<5;i++){
 driver.findElement(By.id("hrefIncAdt")).click();}
 driver.findElement(By.id("btnclosepaxoption")).click();
 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
System.out.println(driver.findElement(By.id("divpaxinfo")).getText(
}

==================================================
import org.openqa.selenium.By;(Dynamic DropDown code)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Dropdown {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("http://spicejet.com"); //URL in the browser
//  //a[@value='MAA']  - Xpath for chennai
//  //a[@value='BLR']
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//a[@value='BLR']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
}
}

=======================================================(asserstion)
System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("http://spicejet.com"); //URL in the browser
Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
*/












