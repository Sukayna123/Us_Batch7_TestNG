package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class EtsyDoll {

//TC1: Validate Dolls Text
//  Given user is on Etsy dashboard
//  When user navigates to 'Dolls' page under 'Toys & Entertainment' tab
//  Then 'Dolls' text should be displayed on search box
//

    //TC2: Validate Results Contains 'Doll' text
//  Given user is on Etsy dashboard
//  When user navigates to 'Dolls' page under 'Toys & Entertainment' tab
//  Then the results should contain 'doll' text
WebDriver driver;

    @BeforeMethod
    void navigateToDollsPage(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.etsy.com");
        Actions action =new Actions(driver);
        WebElement EAndT= driver.findElement(By.id("catnav-primary-link-11049"));
        action.moveToElement(EAndT).build().perform();

        WebElement doll=driver.findElement(By.id("catnav-l4-11052"));
        doll.click();

        WebElement dolls =driver.findElement(By.xpath("//img[@class='hobby-listings__listing-card-image wt-width-full wt-height-full wt-display-block placeholder-content']"));
        dolls.click();
        System.out.println(driver.getCurrentUrl().contains("Dolls"));
    }
    @Test
    void validateDollTextDisplayed(){
        WebElement searchBox=driver.findElement(By.id("global-enhancements-search-query"));

String dollText=searchBox.getAttribute("value");

        Assert.assertTrue(dollText.contains("Dolls"));
    }


    @Test
    void elementsTest(){
        List<WebElement>dollsType=driver.findElements(By.cssSelector("//[class=\"wt-text-caption v2-listing-card__title             wt-text-truncate\"]"));


        System.out.println(dollsType.get(8).getText().contains("doll"));
    }
    @AfterMethod
    void quiteBrowser(){
        driver.quit();
    }
}
