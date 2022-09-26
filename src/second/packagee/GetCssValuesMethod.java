package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValuesMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

		String data = "Welcome to KTCTC'Hello'";

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you connect')]"));
 
		String fontFam = text.getCssValue("font-family");
		System.out.println(fontFam);
		
		System.out.println(text.getCssValue("font-size"));
		
		System.out.println(text.getCssValue("color"));
		
		System.out.println(text.getCssValue("background-color"));
		
		
	}

}
