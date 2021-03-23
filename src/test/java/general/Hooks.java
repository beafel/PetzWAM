package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    // Objeto local para comunicacao com objeto da Classe extendida
    private Base base;

    //Construtor para a classe Base
    public Hooks(Base base) {
        super(base.driver);
        this.base = base;
    }

    //Before
    @Before
    public void setup(){
        //Onde esta o driver do Base
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver88.exe");
        //Instanciar o driver do Chrome
        base.driver = new ChromeDriver();
        //Maximizar a tela
        base.driver.manage().window().maximize();
        //Definir a espera implicita do SeleniumWebDriver para 1 minuto
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    //After
    @After
    public void tearDown(){
        base.driver.quit(); //Destruir o objeto do Selenium
    }
}
