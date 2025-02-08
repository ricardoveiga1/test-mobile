import br.com.mobile.core.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.net.MalformedURLException;

public class BaseTest {
    protected static AppiumDriver driver;

    @BeforeAll
    public static void setup() throws MalformedURLException {
        driver = DriverManager.initializeDriver("Android");  // "iOS" para testes no iPhone
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
