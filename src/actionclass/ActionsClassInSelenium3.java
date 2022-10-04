package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import property.file.PropertyHelper;

public class ActionsClassInSelenium3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[contains(text(),' 5000 ')]"));
		
		WebElement destinationElement = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceElement, destinationElement).perform();
		
		WebElement sourceElement1 = driver.findElement(By.xpath("//*[contains(text(),' BANK ')]"));
		WebElement destinationElement1 = driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		act.clickAndHold(sourceElement1).moveToElement(destinationElement1).release().perform();

	}

}
