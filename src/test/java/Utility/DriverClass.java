package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class DriverClass {
public static WebDriver driver;

    @BeforeClass
    public void startingSettings(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
loging();

    }
    void loging(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("shalashsukayna@gmail.com");

        WebElement pass=driver.findElement(By.name("password"));
        pass.sendKeys("shalash123");

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Login']"));
        loginButton.click();
    }

    @AfterTest
    public void finishSetting(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
   //     driver.quit();

    }
}
