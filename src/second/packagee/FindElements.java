package second.packagee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

String data = "Welcome to KTCTC'Hello'";

		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		List<WebElement> textBoxList = driver.findElements(By.xpath("//form//div/input"));
		
		
		for (int i=0;i<textBoxList.size();i++)
		{
			textBoxList.get(i).sendKeys("Welcome to KTCTC"+i);
			
		}
		
		for (WebElement each:textBoxList)
		{
			each.sendKeys("Welcome to KTCTC");
		}
		
		

	}

}
