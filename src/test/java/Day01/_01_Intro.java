package Day01;

import org.testng.annotations.Test;

public class _01_Intro {
    @Test(priority = 1)
    public void loginTest(){

        System.out.println("login test is successful ");
    }
    @Test(priority = 2)
    public void addToCartTest(){
        System.out.println("add to cart is successful ");
    }
    @Test(priority = 3)
    public void checkOutTest(){
        System.out.println("check out test is successful ");
    }
}
