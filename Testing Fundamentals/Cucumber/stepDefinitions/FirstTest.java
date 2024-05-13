package Dep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login page$")
    public void userIsOnGooglePage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @When("^User enters username and password$")
    public void userTypesInCheeseAndHitsENTER() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void showHowManySearchResultsWereShown() throws Throwable {
        driver.getTitle();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        String resultStats = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(resultStats);
    }

    @And("^Close the Browser$")
    public void closeTheBrowser() {
        driver.close();
    }
}