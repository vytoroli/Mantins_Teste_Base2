package Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver configDriver() {
        // Caminho para o WebDriver do Chrome (ou outro navegador)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return  driver;
        //  System.setProperty("webdriver.chrome.driver", "selenium.webdriver");
        // System.setProperty("webdriver.chrome.driver", "/home/runner/work/Martins_Teste_Base2/Martins_Teste_Base2/src/test/java/Drivers/chromedriver");
        // WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
       // options.addArguments("--headless"); // Executa em modo headless
         // Necessário em alguns ambientes CI
     //   options.addArguments("--disable-dev-shm-usage"); // Evita problemas de memória compartilhada
        //options.addArguments("--disable-gpu"); // Desativa uso da GPU
       // options.addArguments("--window-size=1920,1080");
      /*  WebDriver driver = new ChromeDriver(options);
        driver.get("http://mantis-prova.base2.com.br");*/
//        WebDriverManager.chromedriver().setup();
//
//        options.addArguments("--headless");
//        driver =new ChromeDriver(options);
//        System.out.println("Depois que o chrome abrir");
//        driver.get("http://mantis-prova.base2.com.br");
//
    }
}

////
////package Drivers;
////import io.github.bonigarcia.wdm.WebDriverManager;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.chrome.ChromeOptions;
////
////public class Driver {
////    public static WebDriver Webdriver() {
////        // Configura o WebDriver Manager para baixar o ChromeDriver automaticamente
////        WebDriverManager.chromedriver().setup();
////
////        // Define opções do Chrome em modo headless
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--headless"); // Executa em modo headless
////        options.addArguments("--no-sandbox"); // Necessário em alguns ambientes CI
////        options.addArguments("--disable-dev-shm-usage"); // Evita problemas de memória compartilhada
////        options.addArguments("--disable-gpu"); // Desativa uso da GPU
////        options.addArguments("--window-size=1920,1080"); // Define o tamanho da janela
////
////        // Inicializa o ChromeDriver com as opções configuradas
////        return new ChromeDriver(options);
////    }
////
////
////}
//
