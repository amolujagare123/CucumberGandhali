package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSD {
WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://stock.scriptinglogic.net");

    }

    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");

    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.name("submit")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("I should land up to home page")
    public void i_should_land_up_to_home_page() {

        String expected ="http://stock.scriptinglogic.net/dashboard.php1";
        String atual = driver.getCurrentUrl();

        Assert.assertEquals(atual,expected,"home page is not opened");

    }
}
