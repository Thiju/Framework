package Scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLogin {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement value;
	
	public void TestLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	void value(String Thiju) {
		value.sendKeys(Thiju,Keys.ENTER);
	}
	

}

