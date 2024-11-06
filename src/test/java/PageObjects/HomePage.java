package PageObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

public class HomePage {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "username")
    private WebElement username;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    private WebElement alertaDesativado;

    @FindBy(how = How.CLASS_NAME, using = "padding-left-8")
    private WebElement criartarefa;

    @FindBy(how = How.XPATH, using = "//*[contains(text(), ' Ver Tarefas ')]")
    private WebElement verTarefa;

    @FindBy(how = How.NAME, using = "bug_id")
    private WebElement buscarTarefa;

    @FindBy(how = How.CLASS_NAME, using = "bigger-110")
    private WebElement alertaD;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setUsername(String usuario) {
        username.sendKeys(usuario);
    }

    public void validateHomePage() throws InterruptedException { //Aqui valida se a pagina foi carregada completamente para seguir com o teste
        Thread.sleep(5000);
        String expectedUrl = "https://mantis-prova.base2.com.br/my_view_page.php";
        assertEquals(expectedUrl, driver.getCurrentUrl());
    }

    public void Criartarefa() {
        criartarefa.click();
    }

    public void verTarefa() {
        verTarefa.click();
    }

    public void buscarTarefa(String texto) {
        buscarTarefa.sendKeys(texto + Keys.ENTER);
    }

    public void alertaD() {
        assertEquals("Acesso Negado.", alertaD.getText());
    }
}
