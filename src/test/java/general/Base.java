package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    //Objeto do Selenium WebDriver, vulgo bola
    protected WebDriver driver;
    // ^ - ao usar PageFactory mudar de public para protected (public WebDriver driver;)

    // v - criar um construtor e inicializar os elementos do PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
