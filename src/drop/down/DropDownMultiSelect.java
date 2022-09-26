package drop.down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select sel = new Select(driver.findElement(By.id("fruits")));
		
		boolean flag = sel.isMultiple();
		System.out.println(flag);
		
		sel.selectByValue("apple");
		sel.selectByVisibleText("Orange");
		sel.selectByVisibleText("Grape");
		
		List<WebElement> allOptions = sel.getOptions();
		
		for (WebElement each:allOptions)
		{
			System.out.println(each.getText());
		}
		
		
		List<WebElement> allSelected = sel.getAllSelectedOptions();
		
		for (WebElement each:allSelected)
		{
			System.out.println(each.getText());
		}
		
		
		
		
		WebElement selOption = sel.getFirstSelectedOption();
		
		System.out.println(selOption.getText());
		
		sel.deselectByValue("orange");
		
		sel.deselectAll();
		
		
	}

}
