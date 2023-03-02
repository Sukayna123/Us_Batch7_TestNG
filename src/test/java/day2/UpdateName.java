package day2;

import Utility.DriverClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateName extends DriverClass {

    @Test
    void editNameTest(){
        editName("testNg3");
        editName("testTest");

    }
    public void editName(String name ) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
//
//        WebElement email=driver.findElement(By.name("email"));
//        email.sendKeys("testngusbatch@gmail.com");
//
//        WebElement pass=driver.findElement(By.name("password"));
//        pass.sendKeys("usbatch1234");

        // WebElement loginButton = driver.findElement(By.cssSelector("input[value='Login']"));
        //loginButton.click();

        WebElement editAccount = driver.findElement(By.xpath("//*[@class='list-group']//a[2]"));
        editAccount.click();

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.clear();
        firstname.sendKeys("TestNG1");

        WebElement continuee = driver.findElement(By.xpath("//input[@type='submit']"));
        continuee.click();

        WebElement message = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertEquals(message.getText(), "Success: Your account has been successfully updated.");
        //System.out.println(message.getText());

    }

}
