package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

		String data = "Welcome to KTCTC'Hello'";

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		String msg = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you connect')]")).getText();

		System.out.println(msg);
	}

}
