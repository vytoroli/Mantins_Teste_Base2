package Testes;

// import Drivers.Driver;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Testes_Login {
   // private WebDriver driver;
   public static WebDriver driver=null;
    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","--no-sandbox");
        driver =new ChromeDriver(options);
        System.out.println("Depois que o chrome abrir");


        // driver = Driver.configurarChromeDriver();

//        driver = new ChromeDriver.();
//        driver.get("http://mantis-prova.base2.com.br");
//        Driver wdriver = new Driver();
//        driver = wdriver.Webdriver();
        // driver = ConfiguracaoWebDriver.configurarChromeDriver();
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
        driver.quit();
    }
}
