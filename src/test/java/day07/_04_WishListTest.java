package day07;

import Utility.DriverClass;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class _04_WishListTest extends DriverClass {

     /* Go to "https://opencart.abstracta.us/index.php?route=account/login"
            * Log in
     * search for ipod (send "ipod" from xml file
            * add one of the elements to the wish list randomly
            * Click on Wish List button
            * Check if the name of the element is the same with the name of the element you added.
            * */

@Test
     @Parameters("ipod")
    void test1(String key){
    WebElement inputBox= driver.findElement(By.name("search"));
    inputBox.sendKeys(key);
    inputBox.click();

   List<WebElement> ipod=driver.findElements(By.xpath("product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12"));

    for (WebElement EE:ipod ) {

    }
//
//WebElement wishList= driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/i"));
//    wishList.click();
//    WishList.contain
//
//    Assert.assertEquals(wishList,);
}

}
