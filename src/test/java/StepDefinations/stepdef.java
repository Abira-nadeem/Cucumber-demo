package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepdef {
    WebDriver driver;

    @Given("open browser")
    public void open_browser() {

        //webdriver helps to correspondingly provid e a setup for chromedriver and instantiate
        // a driver object
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //maximizing the screen
        driver.manage().window().maximize();

    }
    @When("type url")
    public void type_url() {

        //opening the url
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

    }
    @Then("type in the fields")
    public void type_in_the_fields() throws InterruptedException {

        //locating the webelements and typing in the field ---

        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("john");
        driver.findElement(By.id("RESULT_TextField-2")).sendKeys("doe");

        //a short pause to observe clearly
        Thread.sleep(10);

        //locating the webelements and inserting value--
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("12345");

        //a short pause to observe clearly --
        Thread.sleep(10);

        // locating the webelements and inserting vales --
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("US");
        driver.findElement(By.id("RESULT_TextField-5")).sendKeys("aspen");
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("qwe@test.com");
        Thread.sleep(10);

    }
    @Then("print a message")
    public void print_a_message() {

        //printing the message --
        System.out.println("input text fields filled");


    }

}
