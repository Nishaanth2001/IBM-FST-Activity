import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager.*;

public class Selenium_act2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title of the page: " + driver.getTitle());
        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("admin");
        WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("password");
        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        login.click();
        System.out.println("Title of the new page: " + driver.getTitle());
        driver.quit();

    }
}
