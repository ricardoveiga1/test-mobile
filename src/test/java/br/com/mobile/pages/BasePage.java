package br.com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected AppiumDriver driver;
    private WebDriverWait wait;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void waitForElementToBeVisible(org.openqa.selenium.WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
