package Stepdefinations3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepdef3 {
    //making driver object
    WebDriver driver;

    @Given("open the browser")
    public void open_the_browser() {
        //WebDriverManager helps to automate the browser setup in the Selenium code
        // later we r creating chromedriver(); instance and storing it in a variable called driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("type a url")
    public void type_a_url() {

       // opening url
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

    }

    @Then("select the box")
    public void select_the_box() {

        //locating the webelement and storing itin the variable and performing click action --
        WebElement day = driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[4]/td/label"));
        day.click();
    }

    @Then("print the message at th end")
    public void print_the_message_at_th_end() {

        //printing the message ---
        System.out.println("box selected");
    }


}
