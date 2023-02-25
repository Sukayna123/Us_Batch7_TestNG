package Day01;

import org.testng.annotations.*;

public class _02_Annotation {


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method is working");
    }


    @Test
    void test1(){
        System.out.println("so good" );
    }


    @Test
    void test2(){
        System.out.println("good");
    }

        @BeforeMethod
    public void beforeMethod2(){
            System.out.println("AAAAAAAAAAAAAAAA");
        }

        @AfterMethod
    public void afterMethod(){
            System.out.println("after");
        }


        @AfterClass
                public void afterClass(){
            System.out.println("after class ");
        }

        @BeforeClass
    public void BeforeClass(){
            System.out.println("before class");
        }
}
