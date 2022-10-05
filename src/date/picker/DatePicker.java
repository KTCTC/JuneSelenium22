package date.picker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/date-picker");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select yerSel = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		
		yerSel.selectByVisibleText("2015");
		
		
		Select monSel = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		
		monSel.selectByVisibleText("February");
		
		driver.findElement(By.xpath("//*[@class='react-datepicker__month']//*[contains(@class,'017') and contains (@aria-label,'February')]")).click();
	}

}
