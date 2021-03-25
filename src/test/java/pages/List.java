package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {
    // 1 - Mapeamentos
    @FindBy(css = "h2Categoria nomeCategoria")
    private WebElement lblResultBy;

    // getTitle nao precisa de mapeamento

    // 2 - Construtor
    public List(WebDriver driver) {
        super(driver);
    }


    // 3 - Metodos e funcoes baseados no Mapeamento

    // Le o titulo da guia e devolve o texto encontrado
    public String readTitleTab(){
        return driver.getTitle();
    }

    // Le a frase Resultado para "Produto" e manda para steps
    public String readResultBy(){
        return lblResultBy.getText();
    }

    // Clique no produto desejado
    public void clickAtDesiredProduct(String product){
        driver.findElement(By.xpath("//h3[contains(text(),'" + product + "')]")).click();
    }
}
