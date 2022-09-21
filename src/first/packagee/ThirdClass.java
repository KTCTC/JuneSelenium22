package first.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ThirdClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		//By em = By.id("email");

		//WebElement emailTextBox = driver.findElement(By.id("email"));

		//emailTextBox.sendKeys("Welcome to KTCTC");
		driver.findElement(By.id("email")).sendKeys("Welcome to KTCTC");
		driver.findElement(By.id("email")).sendKeys("Welcome to KTCTC");

		//By ps = By.name("pass");
		
		WebElement passTestBox = driver.findElement(By.name("pass"));
		
		passTestBox.sendKeys("KT12345");
		passTestBox.sendKeys("Sample");
		
		
		
	 driver.findElement(By.name("login")).click();
	 
	
	

	}

}
