package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public WebDriver driver;

	@BeforeMethod(groups = { "smoke", "regression" })

	protected void setUp() {

		// WebDriverManager.chromedriver().setup();
		System.out.println("Invoke");
		driver = new ChromeDriver();
		System.out.println("base: " + driver);
		driver.manage().window().maximize();
	}

	@AfterMethod

	public void tearDown() {
		if (driver != null) {
			// driver.quit();
		}
	}
}
