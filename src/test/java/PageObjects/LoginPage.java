package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class LoginPage {
  //  private WebDriver driver;
  public static WebDriver driver=null;
    @FindBy(how = How.ID, using = "username")
    private WebElement username;

    @FindBy(how = How.CSS, using = "input[value='Entrar']")
    private WebElement Entrar;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    private WebElement alertaDesativado;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setUsername(String usuario) {
        username.sendKeys(usuario);
    }

    public void Entrar() {
        Entrar.click();
    }

    public void setPassword(String senha) {
        password.sendKeys(senha);
    }

    public void loginSucess(String user, String senha) throws InterruptedException {
        username.sendKeys(user);
        Entrar.click();
        password.sendKeys(senha);
        Entrar.click();
        Thread.sleep(5000);
    }


    public void alertaDesativado() {
        WebElement element = alertaDesativado;
        String texto = element.getText();
        assertEquals("Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.", texto);
    }


}
