import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager.*;

public class Selenium_act4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title of the page: " + driver.getTitle());
        WebElement thirdHeader = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h3"));
        System.out.println("Third header: " + thirdHeader.getText());
        WebElement fifthHeader = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        System.out.println("Fifth header: " + fifthHeader.getCssValue("color"));
        WebElement violetButton = driver.findElement(By.cssSelector(".violet"));
        System.out.println("Violet Button: " + violetButton.getAttribute("class"));
        WebElement greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        System.out.println("Grey Button: " + greyButton.getText());
        driver.quit();
    }
}


