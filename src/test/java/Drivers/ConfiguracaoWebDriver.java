package Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfiguracaoWebDriver {
    public static WebDriver configurarChromeDriver() {
        // Configura o WebDriver Manager para baixar e configurar o ChromeDriver automaticamente
        WebDriverManager.chromedriver().setup();

        // Define opções para o Chrome em modo headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Executa em modo headless
        options.addArguments("--no-sandbox"); // Necessário para CI, evita problemas de permissão
        options.addArguments("--disable-dev-shm-usage"); // Usa espaço de memória compartilhada
        options.addArguments("--disable-gpu"); // Desativa GPU, recomendado para ambientes CI
        options.addArguments("--window-size=1920,1080"); // Define um tamanho de janela padrão para evitar problemas com elementos fora da viewport
        WebDriver driver = new ChromeDriver();
        driver.get("http://mantis-prova.base2.com.br");
        // Inicializa o ChromeDriver com as opções configuradas
        return new ChromeDriver(options);
    }
}
