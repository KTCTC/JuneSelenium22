package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

		String data = "Welcome to KTCTC'Hello'";

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("KTCTC");
		driver.findElement(By.name("pass")).sendKeys("KT23234");

		driver.findElement(By.name("login")).submit();

	}

}
