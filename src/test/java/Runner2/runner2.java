package Runner2;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "work2",
        glue = "StepDefinations2",
        plugin= {"pretty","html:target/cucumber-reports2"},
        monochrome = true,//monochrome true here shows that console output of the tests are much more readable
        publish = true)
public class runner2 {
}
