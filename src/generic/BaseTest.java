package generic;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners (Result.class)
public abstract class BaseTest implements IAutoConst {
	public WebDriver driver;
	public String url = utility.getPropertyValue(CONFIG_PATH, "URL");
	String ITO=utility.getPropertyValue(CONFIG_PATH,"ITO");
	public long duration=Long.parseLong(ITO); 
	static {
		System.setProperty(CHROME_KEY,CHROME_VALUE );
		System.setProperty(GECKO_KEY,GECKO_VALUE );
	}
	
	@BeforeMethod
	public void OpenTheAppln() {
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
        driver.get(url);
    }
	
	@AfterMethod
	public void CloseTheAppln() {
	driver.close();
	}
}



//Generic code for Open n close the Application