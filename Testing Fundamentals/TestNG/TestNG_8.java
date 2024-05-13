import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNG_8 extends DP{
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }
    @Test(dataProvider = "Authentication")
    public void test(String firstname, String lastname, String email, String number){
        WebElement fn = driver.findElement(By.id("firstName"));
        fn.sendKeys(firstname);
        WebElement ln = driver.findElement(By.id("lastName"));
        ln.sendKeys(lastname);
        WebElement em = driver.findElement(By.id("email"));
        em.sendKeys(email);
        WebElement cn = driver.findElement(By.id("number"));
        cn.sendKeys(number);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[2]/input")).click();

    }
    @AfterClass
    public void close() {
        driver.close();
    }
}
