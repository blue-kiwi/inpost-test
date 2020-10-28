package suites;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (

        tags = "@automatyczny",
        plugin = {"pretty"},
        features = "src/test/resources/features/", glue = "kiwi.blue.stepdefinitions"

)
public class CucumberTestSuite {}
