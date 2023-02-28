package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggesion_In_Google {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("QSpiders");
		Thread.sleep(2000);

		List<WebElement> allsug=driver.findElements(By.xpath("//span[contains(text(),'QSpiders' )]"));
		int count=allsug.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text = allsug.get(i).getText();
			System.out.println(text);
		}
		
		allsug.get(count-1).click();
	}

}
