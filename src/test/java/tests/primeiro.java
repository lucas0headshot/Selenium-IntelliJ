package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class primeiro{

    @Test
    public void testPesquisar() {
        System.setProperty("webdriver.chrome.driver", "C://3-52//Marcos e Lucas Ronchi//lotaobolinha//LittleBallBombado//chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://www.codebrincosmasculinos.com.br/");
        navegador.findElement(By.id("auto-complete")).sendKeys("brincos");
        navegador.findElement(By.className("icon-search")).click();
        navegador.get("https://www.codebrincosmasculinos.com.br/brinco-masculino-argola-fantasma");
        navegador.findElement(By.className("comprar")).click();
        navegador.get("https://www.codebrincosmasculinos.com.br/buscar?q=brincos");
        navegador.get("https://www.codebrincosmasculinos.com.br/brinco-masculino-espada-par");
        navegador.findElement(By.className("comprar")).click();
        navegador.get("https://www.codebrincosmasculinos.com.br/carrinho/index");
        navegador.navigate().refresh();
    }
}
