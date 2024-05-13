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

public class TestNG_2 {
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

    @Test
    public void testTitle() {
        // Check the title of the page
        String title = driver.getTitle();
        //Assertion for page title
        Assert.assertEquals("Target Practice", title);
    }
    @Test
    public void findBlackElement() {
        WebElement blkbtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[3]"));
        String blk = blkbtn.getText();
        Assert.assertEquals("Black",blk);

    }
    @Test(enabled = false)
    public void skipTest() throws SkipException{
        String Condition = "Skip";
        if (Condition.equals("Skip")){
            throw new SkipException("Skipping");
        } else {

        }
    }
    @Test
    public void skipTestThrow() throws SkipException{
        String Condition = "Skip";
        if (Condition.equals("Skip")){
            throw new SkipException("Skipping");
        } else {

        }
    }
}

