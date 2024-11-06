package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;


public class CreateTaskPage {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "category_id")
    private WebElement categoria;

    @FindBy(how = How.ID, using = "summary")
    private WebElement resumo;

    @FindBy(how = How.ID, using = "description")
    private WebElement descricao;

    @FindBy(how = How.ID, using = "steps_to_reproduce")
    private WebElement passosReproducao;

    @FindBy(how = How.ID, using = "additional_info")
    private WebElement infosAdicionais;

    @FindBy(how = How.CSS, using = "input[value='Criar Nova Tarefa']")
    private WebElement criarNovaTarefa;


    public CreateTaskPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void categoria(int n) {
        Select objSelect = new Select(categoria);
        objSelect.selectByIndex(n);
    }

    public void resumo(String texto) {
        resumo.sendKeys(texto);
    }

    public void descricao(String texto) {
        descricao.sendKeys(texto);
    }

    public void passosReproducao(String texto) {
        passosReproducao.sendKeys(texto);
    }

    public void infosAdicionais(String texto) {
        infosAdicionais.sendKeys(texto);
    }

    public void criar() {
        criarNovaTarefa.click();
    }

    public void validateHomePage() throws InterruptedException {
        Thread.sleep(5000);
        String expectedUrl = "https://mantis-prova.base2.com.br/my_view_page.php";
        assertEquals(expectedUrl, driver.getCurrentUrl());
    }


}
