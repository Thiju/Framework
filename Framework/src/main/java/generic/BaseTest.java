package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAuto_Constant{

	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	
	 void Start() {
		
		 driver = new ChromeDriver();
		System.setProperty(CHROME_KEY, VALUE);
		driver.get(URL);
		
		
	}
	
	@AfterMethod
	
	void Close()
	{
		driver.close();
	}
	
}
