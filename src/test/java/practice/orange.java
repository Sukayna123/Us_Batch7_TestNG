package practice;

import Utility.DriverClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class orange extends DriverClass {


    @BeforeClass
    void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @Test
    void testCaseTC_MI_01() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
            WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
            password.sendKeys("Admin123");
            WebElement logging= driver.findElement(By.xpath("//button[@type='submit']"));
            logging.click();
//       }
//        @Test
//        void TestCaseTC_MI_02(){
//            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//            WebElement username = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
//            username.sendKeys("Admin");
//            WebElement password = driver.findElement(By.name("password"));
//            password.sendKeys("abc123");
//            WebElement logging= driver.findElement(By.xpath("//button[@type='submit']"));
//            logging.click();
//        }
//        @Test
//        void TestCaseTC_MI_MIM_01(){
//            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        }
//        @Test
//        void TestCaseTC_MI_MIM_02(){
//            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//            WebElement username = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
//            username.sendKeys("Admin");
//            WebElement password = driver.findElement(By.name("password"));
//            password.sendKeys("Admin123");
//            WebElement logging= driver.findElement(By.xpath("//button[@type='submit']"));
//            logging.click();
//
//
//        }


    }

}
