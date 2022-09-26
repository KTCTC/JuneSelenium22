package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CLearMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");

	

		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		WebElement emailTextBox = driver.findElement(By.id("email"));

		emailTextBox.sendKeys("Welcome to KTCTC");

		emailTextBox.clear();


		emailTextBox.sendKeys("Hello");
	}

}
