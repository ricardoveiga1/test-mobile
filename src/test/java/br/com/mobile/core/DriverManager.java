package br.com.mobile.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AppiumDriver driver;

    public static AppiumDriver initializeDriver(String platform) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", platform);

        if (platform.equalsIgnoreCase("Android")) {
            caps.setCapability("deviceName", "Nexus_5_API_33_2");
            caps.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/General-Store.apk");
            caps.setCapability("automationName", "UiAutomator2");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);
        } else if (platform.equalsIgnoreCase("iOS")) {
            caps.setCapability("deviceName", "iPhone Simulator");
            caps.setCapability("app", System.getProperty("user.dir") + "/apps/app.app");
            caps.setCapability("automationName", "XCUITest");
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), caps);
        }
       ///Users/ricardo/Documents/projects/teste-api/teste-api/mobile/src/test/resources/General-Store.apk
        return driver;
    }
}
