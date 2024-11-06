package Testes;

//import Drivers.Driver;
import PageObjects.CreateTaskPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.TaskPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class Testes_Tarefas {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Caminho para o WebDriver do Chrome (ou outro navegador)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","--no-sandbox");
        options.addEncodedExtensions()
        driver =new ChromeDriver(options);
        driver.get("http://mantis-prova.base2.com.br");



     //   driver = Driver.configurarChromeDriver();

//        Driver wdriver = new Driver();
//        driver = wdriver.Webdriver();
//        driver = ConfiguracaoWebDriver.configurarChromeDriver();
//        driver.get("http://mantis-prova.base2.com.br");
    }

    @Test
    public void Criar_tarefa() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        CreateTaskPage createTaskPage = new CreateTaskPage(driver);
        driver.get("http://mantis-prova.base2.com.br");
        loginPage.loginSucess("Victor_Costa", "vytor@123");
        homePage.validateHomePage();
        homePage.Criartarefa();
        createTaskPage.categoria(2);
        createTaskPage.resumo("Tarefa auto-teste");
        createTaskPage.descricao("Teste automatizado");
        createTaskPage.passosReproducao("1 - Criar teste\n2 - Rodar teste ");
        createTaskPage.infosAdicionais("Rodado com Selenium WebDriver");
        createTaskPage.criar();
    }

    @Test
    public void Ver_Tarefa() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        TaskPage taskPage = new TaskPage(driver);
        driver.get("http://mantis-prova.base2.com.br");
        loginPage.loginSucess("Victor_Costa", "vytor@123");
        homePage.validateHomePage();
        taskPage.verTarefa();
        //Clicar na tarefa exemplo!
        driver.findElement(By.xpath("//*[contains(text(), '0002065')]")).click();

        //Validar pagina
        String expectedUrl2 = "https://mantis-prova.base2.com.br/view.php?id=2065";
        assertEquals(expectedUrl2, driver.getCurrentUrl());

    }

    @Test
    public void Buscar_Tarefa_Valida() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        TaskPage taskPage = new TaskPage(driver);
        driver.get("http://mantis-prova.base2.com.br");
        loginPage.loginSucess("Victor_Costa", "vytor@123");
        homePage.buscarTarefa("0002067");

        // Numero de tarefa teste para visualizar
        driver.findElement(By.xpath("//*[contains(text(), '0002065')]")).click();

        //Validação de acesso a pagina
        String expectedUrl2 = "https://mantis-prova.base2.com.br/view.php?id=2065";
        assertEquals(expectedUrl2, driver.getCurrentUrl());

    }

    @Test
    public void Buscar_Tarefa_Invalida() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        TaskPage taskPage = new TaskPage(driver);
        driver.get("http://mantis-prova.base2.com.br");
        loginPage.loginSucess("Victor_Costa", "vytor@123");
        homePage.buscarTarefa("000207");
        homePage.alertaD();

    }

    @Test
    public void Buscar_Tarefa_Nome() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        TaskPage taskPage = new TaskPage(driver);
        driver.get("http://mantis-prova.base2.com.br");
        loginPage.loginSucess("Victor_Costa", "vytor@123");
        homePage.verTarefa();
        taskPage.filtroRedefinir();
        taskPage.buscar("teste");
        taskPage.aplicarFiltro();
        taskPage.validarBusca("teste");
    }


    @After
    public void tearDown() {
        // Fechar o navegador após o teste
        driver.quit();
    }
}
