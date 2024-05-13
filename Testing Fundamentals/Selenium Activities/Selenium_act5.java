import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager.*;
import org.openqa.selenium.interactions.Actions;

public class Selenium_act5 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title of the page: " + driver.getTitle());
        WebElement cli = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div"));
        cli.click();
        WebElement activeElement = driver.findElement(By.className("active"));
        System.out.println("Number on Dice: " + activeElement.getText());
        WebElement dcli = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div"));
        Actions actions = new Actions(driver);
        actions.doubleClick(dcli).perform();
        WebElement activeElement1 = driver.findElement(By.className("active"));
        System.out.println("Number on Dice After Double Click: " + activeElement1.getText());
        WebElement ccli = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div"));
        actions.contextClick(ccli).perform();
        WebElement activeElement2 = driver.findElement(By.className("active"));
        System.out.println("Number on Dice After Right Click: " + activeElement2.getText());
        driver.quit();
    }
}


