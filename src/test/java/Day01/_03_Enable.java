package Day01;

import org.testng.annotations.Test;

public class _03_Enable {

    @Test
    void test1(){
        System.out.println("test 1 is successful");
    }

    @Test(enabled = false)
    void test(){
        System.out.println("test 2 is successful");
    }

    @Test
    void test3(){
        System.out.println("test 3 is successful");
    }
}
