package TestProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class TestID18 {

    @Test
    void Test18(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/date-picker/");
        Actions actions=new Actions(driver);

        WebElement selectDate= driver.findElement(By.id("datePickerMonthYearInput"));
        //selectDate.clear();
        //actions.keyDown(selectDate,Keys.CONTROL).sendKeys("a").keyDown(Keys.BACK_SPACE).build().perform();

        actions.moveToElement(selectDate).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
        //actions.keyUp(selectDate,Keys.CONTROL).keyUp(Keys.BACK_SPACE).keyUp(selectDate.sendKeys("a");
     //   WebElement selectDateAgain= driver.findElement(By.id("datePickerMonthYearInput"));
        selectDate.sendKeys("01/14/0030 ");

WebElement selectedDay=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--014 react-datepicker__day--selected']"));
String selectedDayColor=selectedDay.getCssValue("background-color");

WebElement otherDay=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--013 react-datepicker__day--weekend']"));
        String otherDayColor=otherDay.getCssValue("background-color");


        //String expectedDateMonth ="21";
        String expectedDate="21/12/0023";


        WebElement currentDate=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"));
        String currentMonthAndYear= currentDate.getText();
        System.out.println(currentMonthAndYear);

//Assert.assertEquals(currentDate,expectedDate,"current date is different than expected date ");

        Assert.assertNotEquals(currentMonthAndYear,expectedDate);


    }
}
