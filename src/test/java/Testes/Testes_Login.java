package Testes;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testes_Login {
    private WebDriver driver;

    @Before
    public void setUp() { //Aqui é iniciado o navegador
        ChromeOptions options = new ChromeOptions();
        //Aqui é possivel configurar se o teste para o modo de navegador aberto para que o dev acompanhe os passos de forma visivel.
        //Basta remover o argumento "--headless",
        options.addArguments("--headless", "--no-sandbox", "--accept-lang=pt-BR");
        driver = new ChromeDriver(options);
        driver.get("http://mantis-prova.base2.com.br");
    }

    @Test
    public void testLogin_Sem_Sucesso() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("http://mantis-prova.base2.com.br");
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
        driver.get("http://mantis-prova.base2.com.br");
        loginPage.loginSucess("Victor_Costa", "vytor@123");
        homePage.validateHomePage();
    }

    @After
    public void tearDown() {
        // Fechar o navegador após o teste
        driver.close();
    }
}
