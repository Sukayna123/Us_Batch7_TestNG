package day05;

import Utility.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.*;

public class _01_ContractUsTest extends DriverClass {

    @Test
    @Parameters ("message1")
void contactUs(String message1) throws InterruptedException {
        WebElement contactUs=driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();

        WebElement messageInput=driver.findElement(By.id("input-enquiry"));

            Thread.sleep(3000);



        WebElement submit=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submit.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }

    @Test
    @Parameters({"message1","message2"})
    void contactUs1(String message1,String message2) throws InterruptedException {
        WebElement contactUs=driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();

        WebElement messageInput=driver.findElement(By.id("input-enquiry"));
        messageInput.sendKeys(message1);
        messageInput.sendKeys(message2);

            Thread.sleep(3000);


    }
}
