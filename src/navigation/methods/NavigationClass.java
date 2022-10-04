package navigation.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import property.file.PropertyHelper;

public class NavigationClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		PropertyHelper pHelp = new PropertyHelper("env.properties");	
		
		
		driver.get(pHelp.getPropertyValue("baseUrl")+"checkbox");
		
		//driver.navigate().to(pHelp.getPropertyValue("baseUrl")+"checkbox");
		
		driver.findElement(By.xpath("//*[contains(text(),'Radio Button')]")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();


	}

}
