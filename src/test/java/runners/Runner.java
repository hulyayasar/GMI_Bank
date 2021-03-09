package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },

        features = "src\\test\\resources\u2028\\features",


        glue = "stepdefinitions",
        tags = "@us24_us27",
        dryRun = false

        )
public class Runner {

}

//"src/test/resources\u2028/features"

