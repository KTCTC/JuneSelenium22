package first.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ForthClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

String data = "Welcome to KTCTC'Hello'";

		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Facebook Lite")).click();
		
		driver.findElement(By.partialLinkText("Contact uploading and")).click();
		


	

	}

}
