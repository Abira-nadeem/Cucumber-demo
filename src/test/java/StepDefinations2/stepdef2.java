package StepDefinations2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepdef2 {

    // making a driver object
    WebDriver driver;

    @Given("open browser")
    public void open_browser() {
    //WebDriverManager helps to automate the browser setup in the Selenium code
    // later we r creating chromedriver(); instance and storing it in a variable called driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //maximizing the screen --
        driver.manage().window().maximize();

    }

    @When("enter url")
    public void enter_url() {

        //opening url --

        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @Then("enter the username {string} and password {string}")
    public void enter_the_username_and_password(String usr, String pwd) {

        //defining path of the webelement and passing in the data --
        driver.findElement(By.id("txtUsername")).sendKeys(usr);

        //defining path of the webelement and passing in the data --
        driver.findElement(By.id("txtPassword")).sendKeys(pwd);

        //defining path of the webelement and performing the click action
        driver.findElement(By.id("btnLogin")).click();

    }
    @Then("verify login is a success")
    public void verify_login_is_a_success() {

        //defining the path of webelement and saving it in the variable -
        WebElement logo = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]"));

        // verifying the logo--
       boolean value =  logo.isDisplayed();

       // using assertion
       Assert.assertTrue(value);

       //printing the value --
        System.out.println(value);


    }
}
