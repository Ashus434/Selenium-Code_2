package Webdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\lib\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for(WebElement option :options)
		{
		    if(option.getText().equalsIgnoreCase("India"))
		       {
		         option.click();
		         break;
		       }

		}
		
		driver.get("https://www.google.com/");//hit URL on the browser.
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("ind");
	Thread.sleep(3000);
	List<WebElement> options2 =driver.findElements(By.xpath("//li[@class='sbct sbre']//span"));
		for(WebElement option: options2) {
			
			if(option.getText().equalsIgnoreCase("India Post")) {
				option.click();
				break;
		}
		
		}

	}

	}


