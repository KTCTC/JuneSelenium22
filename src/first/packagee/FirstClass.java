package first.packagee;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\edgedriver_win64 (2)\\msedgedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		EdgeDriver dri = new EdgeDriver();
		
		ChromeDriver dd = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		dri.get("https://demoqa.com/text-box");
		
		dd.get("https://demo.automationtesting.in/Register.html");
		
		driver.close();
		dri.close();
		dd.close();
		
		
		
		

	}

}
