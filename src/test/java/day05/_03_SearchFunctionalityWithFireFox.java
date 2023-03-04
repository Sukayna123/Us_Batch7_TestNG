package day05;

import Utility.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearchFunctionalityWithFireFox extends DriverClass {

    @Test
    @Parameters(value="searchKeyWord")
    void test1(String Mac) {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys(Mac);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class=btn btn-default btr"));
        searchButton.click();
        List<WebElement> resultList = driver.findElements(By.cssSelector("h4>a"));
        for (WebElement element : resultList) {
            Assert.assertTrue(element.getText().contains(Mac));

        }
    }
}
