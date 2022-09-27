package synchronisation.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Welcome");
		driver.findElement(By.name("pass")).sendKeys("Welcome333");
		
		
		WebDriverWait wt = new WebDriverWait(driver, 15);
		
		
		wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("wefwewe"))));
		
		
		//driver.findElement(By.name("login")).click();
		
		
		driver.close();
		
		int z = sm();
		
		sample(sm());
		
		
		

	}
	
	public static int sm()
	{
		return 4;
	}
	
	public static void sample(int a)
	{
		System.out.println(a);
	}

}
