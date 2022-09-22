package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

String data = "Welcome to KTCTC'Hello'";

		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		WebElement textBox = driver.findElement(By.xpath("//form//div/input"));
		
		textBox.sendKeys("Welcome to KTCTC");

	}

}
