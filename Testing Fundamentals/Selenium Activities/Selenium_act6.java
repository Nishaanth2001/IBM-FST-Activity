import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager.*;
import org.openqa.selenium.interactions.Actions;

public class Selenium_act6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title of the page: " + driver.getTitle());
        new Actions(driver)
                .sendKeys("S")
                .perform();
        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL,"c");
        driver.quit();
    }
}


