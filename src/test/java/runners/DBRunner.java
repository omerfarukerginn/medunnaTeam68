package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features/dataBaseFeatures",
        glue = "stepDefinitions/dataBaseStepDefinitions",
<<<<<<< HEAD
        tags = "@DB_007",
=======
<<<<<<< HEAD
        tags = "@US002_TC09",
=======
        tags = "@DB_009",
>>>>>>> main
>>>>>>> main
        dryRun = false
)
public class DBRunner {


<<<<<<< HEAD
}
=======
}
>>>>>>> main
