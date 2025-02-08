package br.com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "com.example:id/username")
    private WebElement usernameField;

    @FindBy(id = "com.example:id/password")
    private WebElement passwordField;

    @FindBy(id = "com.example:id/login_button")
    private WebElement loginButton;

    public LoginPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
