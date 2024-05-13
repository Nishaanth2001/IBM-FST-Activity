import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertNotEquals;

public class TestNG_3 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");

    }

    @Test
    public void equate() {
        WebElement un = driver.findElement(By.id("username"));
        un.sendKeys("admin");
        WebElement pw = driver.findElement(By.id("password"));
        pw.sendKeys("password");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        WebElement confirm = driver.findElement(By.id("action-confirmation"));
        Assert.assertEquals("Welcome Back, admin", confirm.getText());

    }
}

