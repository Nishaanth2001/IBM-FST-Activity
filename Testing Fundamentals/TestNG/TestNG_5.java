import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.assertNotEquals;

public class TestNG_5 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(groups = {"titleTest"})
    public void testTitle() {
        // Check the title of the page
        String title = driver.getTitle();
        //Assertion for page title
        Assert.assertEquals("Target Practice", title);
    }
    @Test(groups = {"headerTest"})
    public void headerTest() {
        WebElement thirdH = driver.findElement(By.tagName("h3"));
        Assert.assertEquals(thirdH.getText(), "Third header");
    }
    @Test (groups = {"headerTest"})
    public void headerColorTest() {
        WebElement fifthH = driver.findElement(By.tagName("h5"));
        Assert.assertEquals(fifthH.getCssValue("color"), "rgb(33, 186, 69)");
    }
    @Test (groups = {"buttonTest"})
    public void buttonTest() {
        WebElement oliveH = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/button[4]"));
        Assert.assertEquals(oliveH.getText(), "Olive");
    }
    @Test (groups = {"buttonTest"})
    public void buttonColorTest() {
        WebElement fifthH = driver.findElement(By.cssSelector(".brown"));
        Assert.assertEquals(fifthH.getCssValue("background-color"), "rgb(165, 103, 63)");
    }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }
}
