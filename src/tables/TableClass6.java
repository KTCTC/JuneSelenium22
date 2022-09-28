package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableClass6 {

	public static void main(String[] args) {
		
		String str = "Welcome"+"to"+" KTCTC";
		String str2 = "Hello";
		String str3 = str+str2;
		
		// This logic is not working on tables
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> allCNames = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
		
		for (int i=1;i<=allCNames.size();i++)
		{
			String cName = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[1]/a")).getText();
			System.out.println(cName);
			String cntPrice = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[4]")).getText();
			System.out.println(cntPrice);
		}
		System.out.println("After for loop");
		
		
		

		

	}

}
