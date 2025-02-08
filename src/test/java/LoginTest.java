import org.junit.jupiter.api.Test;
import br.com.mobile.pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(50000);
        loginPage.login("testuser", "password123");

        // Adapte a asserção com base no seu app
        assertTrue(driver.getPageSource().contains("Bem-vindo"), "Erro: Login falhou!");
    }
}
