package Testes;

import Drivers.ConfiguracaoWebDriver;
import Drivers.Driver;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testes_Login {
   private WebDriver driver;

    @Before
    public void setUp() {
//        Driver wdriver = new Driver();
//        driver = wdriver.Webdriver();
        driver = ConfiguracaoWebDriver.configurarChromeDriver();
        driver.get("http://mantis-prova.base2.com.br");
    }

    @Test
    public void testLogin_Sem_Sucesso() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("Victor_Costa");
        loginPage.Entrar();
        loginPage.setPassword("vytor@1234");
        loginPage.Entrar();
        loginPage.alertaDesativado();
    }

    @Test
    public void test_Login_Com_Sucesso() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.loginSucess("Victor_Costa", "vytor@123");
        homePage.validateHomePage();
    }

    @After
    public void tearDown() {
        // Fechar o navegador após o teste
        driver.quit();
    }
}
