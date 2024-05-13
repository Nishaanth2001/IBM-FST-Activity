
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumActivity12 {

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        // getting page's title and print it in console
        String title = driver.getTitle();
        System.out.println(title);

        //Actions builder = new Actions(driver);
        // create wait object

        WebElement textBox=driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
        System.out.println("is the textbox enabled : "+textBox.isEnabled());
        WebElement inputBtn= driver.findElement(By.xpath("//*[@id=\"toggleInput\"]"));
        inputBtn.click();

        System.out.println("is the textbox enabled : "+textBox.isEnabled());
        driver.quit();
    }
}