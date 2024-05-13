
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_act9 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/ajax");
        String title = driver.getTitle();
        System.out.println(title);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement changeContent = driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button"));
        changeContent.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ajax-content")));
        WebElement h1=driver.findElement(By.id("ajax-content"));
        System.out.println(h1.getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[2]/div/div[2]/h3"), "I'm late!"));
        WebElement h3=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/h3"));
        System.out.println(h3.getText());
        driver.quit();
    }
}