package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    //Objeto do Selenium WebDriver, vulgo bola
    public WebDriver driver;
    // ^ - ao usar PageFactory mudar de public para protected e colocar o endereco do site e no steps colocar get(url)

    // v - criar um construtor e inicializar os elementos do PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // Separando mapeamento das acoes Contrutor precisa ter o super(base.driver)
    }
}
