package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",// this for feature files path
        glue = "renastech/stepDefinitions",  // this for steps path
        tags = "@TC100",  // test name
        // tags = "@LoginWithoutParams",  // test name - bunu da kullanbilrisin
        dryRun = false  // when it is true it will check if there is any undefined steps


)

public class TestRunner {
}
