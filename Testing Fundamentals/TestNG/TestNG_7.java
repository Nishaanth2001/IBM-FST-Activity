import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_7 {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] {
                {"admin", "password"},
                {"admin1", "pass"}
        };
    }
    @Test(dataProvider = "Authentication")
    public void test(String username, String password){
        WebElement un = driver.findElement(By.id("username"));
        un.sendKeys(username);
        WebElement pw = driver.findElement(By.id("password"));
        pw.sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
        if(driver.findElement(By.id("action-confirmation")).getText().equals("Welcome Back, admin")) {
            un.clear();
            pw.clear();
        }
    }
    @AfterClass
    public void close() {
        driver.close();
    }
}
