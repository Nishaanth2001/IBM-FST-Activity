import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_6 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    @Test
    @Parameters({"sUsername", "sPassword"})
    public void test(String sUsername, String sPassword){
        driver.findElement(By.id("username")).sendKeys(sUsername);
        driver.findElement(By.id("password")).sendKeys(sPassword);
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
    }
    @AfterClass
    public void close() {
        driver.close();
    }
}
