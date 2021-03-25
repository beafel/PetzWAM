package general;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue     = "steps",
        plugin   = { "pretty",
                     "html:target/relatoriosimples",
                     "json:target/relatoriosimples.json",
                     "com.vimalselvam.cucumber.listener.ExtentCucumberFormater:target/dashboard.html"
                    }
                )
public class Runner {
    // E possivel fazer personalizacoes do relatorio aqui
}
