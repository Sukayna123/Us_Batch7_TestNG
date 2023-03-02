package Day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _04_Example {

    @Test
    void loginTest() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.sendKeys("testngusbatch@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("usbatch1234");

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Login']"));
        loginButton.click();

        WebElement myAccountHeader = driver.findElement(By.xpath("(//div[@id='content']//h2)[1]"));

        if (myAccountHeader.isDisplayed()){
            System.out.println(myAccountHeader.getText().equals("My Account"));
        }

        Thread.sleep(3000);
        driver.quit();
    }

    @Test(enabled = false) //this test will not run
    void test2(){
        System.out.println("Test 2 is successful");
    }
    @Test
    void test3(){
        System.out.println("Test 3 is successful");
    }
}


