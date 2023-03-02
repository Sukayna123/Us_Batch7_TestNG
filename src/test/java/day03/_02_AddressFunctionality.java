package day03;

import Utility.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _02_AddressFunctionality extends DriverClass {


//     * Add a new address
//     * Edit the address
//     * Delete the address

    @Test
    void testTest(){
        WebElement adrress=driver.findElement(By.xpath("//div[@class='list-group']//a[4]"));
        adrress.click();


        WebElement newAdreess=driver.findElement(By.xpath("//div[@class='pull-right']//a[1]"));
        newAdreess.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("sukayna");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("shalash");

        WebElement myAdress=driver.findElement(By.id("input-address-1"));
      myAdress.sendKeys("4545 king ave");

      WebElement city=driver.findElement(By.id("input-city"));
      city.sendKeys("input-city");

      WebElement postcode=driver.findElement(By.id("input-postcode"));
      postcode.sendKeys("44444");

      WebElement country =driver.findElement(By.id("input-country"));
      Select select=new Select(country);
      select.selectByIndex(223);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement state=driver.findElement(By.id("input-zone"));
      Select selectS=new Select(state);
      selectS.selectByValue("3164");
       // state.sendKeys("ohio");

WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
submit.click();




//ebElement selectCountry = driver.findElement(By.id("input-country"));
//
//        Select countrySelect = new Select(selectCountry);
//        int randomCountryIndex = (int) (Math.random()*253)+1;
//
//        countrySelect.selectByIndex(randomCountryIndex);
//
//        WebElement selectRegion = driver.findElement(By.id("input-zone"));
//
//        Select regionSelect = new Select(selectRegion);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.
//                not(ExpectedConditions.numberOfElementsToBe(By.xpath("//select[@id='input-zone']//option"),
//                        driver.findElements(By.xpath("//select[@id='input-zone']//option")).size())));
//
//        List<WebElement> listOfRegions = driver.findElements(By.xpath("//select[@id='input-zone']//option"));
//        int randomRegionIndex = ((int) (Math.random()*listOfRegions.size()-1))+1;
//
//        regionSelect.selectByIndex(randomRegionIndex);

    }

    @Test (dependsOnMethods = "testTest")
    void editTest(){
        WebElement edit=driver.findElement(By.xpath("//a[@class='btn btn-info']"));
        edit.click();
        WebElement continee=driver.findElement(By.xpath("//input[@type='submit']"));
        continee.click();

       // WebElement delete=driver.findElement(By.xpath("//a[@class='btn btn-danger']"));
        //delete.click();
    }
    @ Test (dependsOnMethods = "testTest")
    void deleteAddress(){

    }
}
