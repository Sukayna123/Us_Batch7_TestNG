package day06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _06_SoftAssertVsHardAssert {

    @Test
    void hardAssertTest(){
        String str="hello";
        System.out.println("before assertion");
        Assert.assertEquals("hello worls",str,"your test is failed");
        //if actual is not the same with expected it throws an exception and stops the code
        //then TestNG will run the next test
        System.out.println("after assertion ");

}

@Test
void softAssertTest(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/caerpage";
        String strEditAccount="www.facebopok.com/editaccountpage";

        SoftAssert softAssert=new SoftAssert();

    System.out.println("before soft assert 1");
    softAssert.assertEquals("www.facebook.com/homepage",strHomePage);
    System.out.println("after soft assert 1");

softAssert.assertEquals("www.facebook.com/profile",strCartPage);
    }
}
