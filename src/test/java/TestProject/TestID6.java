package TestProject;

import Utility.DriverClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestID6 {

    @Test
    void TestCase6() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/selectable");
        Actions Action = new Actions(driver);
        WebElement item1 = driver.findElement(By.xpath("//*[@id='verticalListContainer']//li[1]"));
        String item1BeforeClick = item1.getCssValue("background-color");
        System.out.println(item1BeforeClick);
        Action.keyDown(item1, Keys.CONTROL).build().perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Click on Item 2 on the selectable list
        WebElement item2 = driver.findElement(By.xpath("//*[@id='verticalListContainer']//li[2]"));
        String item2BeforeClick = item2.getCssValue("background-color");
        System.out.println(item2BeforeClick);
        Action.keyDown(item2, Keys.CONTROL).build().perform();

        WebElement item3 = driver.findElement(By.xpath("//*[@id='verticalListContainer']//li[3]"));
        String item3BeforeClick = item3.getCssValue("background-color");
        System.out.println(item3BeforeClick);
        Action.keyDown(item3, Keys.CONTROL).build().perform();
        Action.keyUp(Keys.CONTROL);

        String item1AfterClick = item1.getCssValue("background-color");
        System.out.println(item1AfterClick);
        String item2AfterClick = item2.getCssValue("background-color");
        System.out.println(item2AfterClick);
        String item3AfterClick = item3.getCssValue("background-color");
        System.out.println(item3AfterClick);

        Assert.assertNotEquals(item1BeforeClick, item1AfterClick);
        Assert.assertNotEquals(item2BeforeClick, item2AfterClick);
        Assert.assertNotEquals(item3BeforeClick, item3AfterClick);

    }
}
