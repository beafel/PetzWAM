package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {
    // 1 - Mapeamento de Elementos
    @FindBy(id = "search")
    private WebElement txtInputSearch; // cria e dá um apelido para o Elemento

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;


    // 2 - Construtor
    public Home(WebDriver driver) {
        super(driver);
    }


    // 3 - Acoes dos Elementos
    public void search(String product) {
        txtInputSearch.click();              // clicar na caixa de pesquisa
        txtInputSearch.clear();              // limpar o conteudo da caixa de texto
        txtInputSearch.sendKeys(product);    // escrever na caixa de texto
    }
    // a variavel 'product'=) vem da Feature --> steps --> @SearchWith --> metodo search

    public void searchWithMagnifierButton(String product){
        search(product);
        btnSearch.click();                   // clicar na lupa
    }

    public void searchWithReturn(String product){
        search(product);
        txtInputSearch.sendKeys(Keys.RETURN); // da Enter
    }
}
