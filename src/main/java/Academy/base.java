package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class base {
	public WebDriver driver;
	
	public WebDriver initializeBrowser() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lija Jayan\\eclipse-workspace\\E2EProject\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lija Jayan\\Downloads\\Selenium_Pre_req\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if (browsername.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Lija Jayan\\Downloads\\edgedriver_win32\\msedgedriver.exe");
			driver = new EdgeDriver();
		
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
}
