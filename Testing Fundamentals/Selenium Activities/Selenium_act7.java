import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager.*;
import org.openqa.selenium.interactions.Actions;

public class Selenium_act7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Title of the page: " + driver.getTitle());
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, dropzone1).perform();
        String d1=dropzone1.getText();
        System.out.println(d1);
        actions.dragAndDrop(draggable, dropzone2).perform();
        String d2=dropzone2.getText();
        System.out.println(d2);
    }
}


