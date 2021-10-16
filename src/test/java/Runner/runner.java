package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "work",
        glue = "StepDefinations",
        plugin= {"pretty","html:target/cucumber-reports"},
        monochrome = true,//monochrome true here shows that console output of the tests are much more readable
        publish = true)
        public class runner {


}
