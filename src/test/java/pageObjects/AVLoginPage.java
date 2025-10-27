package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AVLoginPage {

    private WebDriver driver;

    @FindBy(id = "Email-email")
    private WebElement usernameInput;

    @FindBy(id = "Password-password")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div/form/button")
    private WebElement loginButton;

    public AVLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
