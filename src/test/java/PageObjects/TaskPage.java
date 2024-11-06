package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class TaskPage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[contains(text(), ' Ver Tarefas ')]")
    private WebElement verTarefa;

    @FindBy(how = How.ID, using = "filter-search-txt")
    private WebElement buscar;

    @FindBy(how = How.CSS, using = "input[value='Aplicar Filtro']")
    private WebElement aplicarFiltro;

    @FindBy(how = How.CLASS_NAME, using = "column-summary")
    private WebElement validaBusca;

    @FindBy(how = How.CSS, using = "#filter > div.widget-body > div > div > div > div > a")
    private WebElement filtroRedefinir;

    //Adicionar anotação

    public TaskPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void verTarefa() {
        verTarefa.click();
    }

    public void buscar(String texto) {
        buscar.sendKeys(texto);
    }

    public void aplicarFiltro() {
        aplicarFiltro.click();
    }

    public void filtroRedefinir() {
        filtroRedefinir.click();
    }

    public void validarBusca(String texto) { //Aqui é realizado a validação de que será apresentado em tela o objeto de busca
        boolean resultado = false;
        List<WebElement> resultados = driver.findElements(By.className("column-summary"));
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(i + ": " + resultados.get(i).getText());
            String valorResult = resultados.get(i).getText().toLowerCase();

            if (valorResult.equalsIgnoreCase(texto)) {

            }
            if (valorResult.contains(texto)) {
                resultado = true;
            }
        }
    }

}
