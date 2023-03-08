package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static Utility.DriverClass.driver;

public class _03_ww {

    @Test(dataProvider = "searchKeywords")
    void searchFunctionalityTest(String str) throws InterruptedException {
        WebElement searchBox= driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.clear();
        searchBox.sendKeys(str);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> resultList = driver.findElements(By.cssSelector("h4>a"));

        for (WebElement element: resultList){
            Assert.assertTrue(element.getText().toLowerCase().contains(str));
        }
        Thread.sleep(3000);
    }

    @DataProvider(name = "searchKeywords")
    public Object[][] searchData(){
        Object[][] dataList = {{"mac"},{"samsung"},{"ipod"}};
        return dataList;
    }
}
