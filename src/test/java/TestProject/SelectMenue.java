package TestProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMenue {
    
   @Test
            void selectMenue(){
        WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu/");
       WebElement valueeeeee = driver.findElement(By.id("withOptGroup"));
       valueeeeee.click();

       WebElement options=driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));
       options.click();






   }

    
}
