import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNG_9 extends DP {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    }
    @Test
    public void simpleAlertTestCase() {
        WebElement simple = driver.findElement(By.id("simple"));
        simple.click();
        Alert alert = driver.switchTo().alert();
        Reporter.log(alert.getText());
        alert.accept();
    }
    @Test
    public void confirmAlertTestCase() {
        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();
        Alert alert = driver.switchTo().alert();
        Reporter.log(alert.getText());
        alert.accept();
    }
    @Test
    public void promptAlertTestCase() {
        WebElement prompt= driver.findElement(By.id("prompt"));
        prompt.click();
        Alert alert = driver.switchTo().alert();
        Reporter.log(alert.getText());
        alert.accept();
    }
    @AfterTest
    public void close() {
        driver.close();
    }
}
