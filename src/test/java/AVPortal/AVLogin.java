package AVPortal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import pageObjects.AVLoginPage;

@Test
public class AVLogin extends BaseTest{

	@Test(dataProvider = "loginData",dataProviderClass = utils.ExcelDataProvider.class, groups= {"smoke","regression"})
	public void testLogin(String username, String password) {
		System.out.println("login: "+driver);
		driver.get("https://qa-av-portal.ticmeetings.com/");
        AVLoginPage loginPage = new AVLoginPage(driver);
		loginPage.login(username, password);
	}
}
