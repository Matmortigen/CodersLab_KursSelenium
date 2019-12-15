package tasks.aavtrainTestTask14;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/",
        plugin = {"pretty", "html:out"})

public class registrationAccountTest {

}
