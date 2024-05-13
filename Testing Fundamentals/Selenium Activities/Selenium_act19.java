
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumActivity19 {

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");



        // getting page's title and print it in console
        String title = driver.getTitle();
        System.out.println(title);

        WebElement Confirm=driver.findElement( By.xpath("//*[@id=\"confirm\"]"));
        Confirm.click();
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.accept();
        Confirm.click();
        alert.dismiss();

        driver.quit();

    }
}
