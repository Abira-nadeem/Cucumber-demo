package Runner3;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "work3",
        glue = "Stepdefinations3",
        plugin= {"pretty","html:target/cucumber-reports3"},
        monochrome = true,//monochrome true here shows that console output of the tests are much more readable
        publish = true)

public class runner3 {
}
