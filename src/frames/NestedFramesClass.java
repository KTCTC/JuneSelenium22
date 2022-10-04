package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFramesClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		
		/*
		 * WebDriverWait wt = new WebDriverWait(driver, 10);
		 * 
		 * wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame2"));
		 */
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']")));
		
		String chMsg = driver.findElement(By.xpath("//body//p")).getText();
		
		System.out.println(chMsg);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		
		

	}

}
