package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Assertions {
@Test
    void test1(){
    String str1="John";
    String str2="John";

    Assert.assertEquals(str1,str2,"Test is not successful");
    }

@Test
    void test2(){
    String str1="John";
    String str2="snow";
    Assert.assertEquals(str1,str2, "test is not successful ");
}

@Test
    void test3(){
    String str1="John";
    String str2="snow";
    Assert.assertNotEquals(str1,str2,"test is not successful");
}
    @Test
    void test4() {
        String str1 = "John";
        String str2 = "John";
        Assert.assertNotEquals(str1, str2, "test is not successful");
    }
    @Test
    void test5() {
int num1=54;
int num2=37;
Assert.assertTrue(num1==num2,"test is not successful");
    }


    @Test
    void test6() {
        int num1=54;
        int num2=54;
        Assert.assertTrue(num1==num2,"test is not successful");
    }

    @Test
    void test7() {
       String name="John";
       Assert.assertNull(name,"test is not successful");
    }
    @Test
    void test8() {
        String name="John";
        if(name.equals("Jo"))
        Assert.fail("test fail anyway ");
    }
}

