package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption_Without_Duplication {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> dup=new HashSet<>();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///home/tamil/Desktop/food_menu.html");
		WebElement pat = driver.findElement(By.id("mtr"));
		Select sel=new Select(pat);
		 List<WebElement> col = sel.getOptions();
		 int count=col.size();
		 for(int i=0;i<count;i++)
		 {
			 String text=col.get(i).getText();
			 if(dup.add(text)==false)
			 {
				 System.out.println(text);
			 }
		 }
		 driver.close();
	}
}
