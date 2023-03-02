package day03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01Dependency {


    @Test
    void startCar(){
        System.out.println("car is started");
       // Assert.fail();
    }
    @Test(dependsOnMethods = "startCar")
    void driveCar(){
        System.out.println("car is driven");
    }
    @Test(dependsOnMethods = {"startCar", "driveCar"})
    void parkCar(){
        System.out.println("car is parked");
    }

    @Test(dependsOnMethods = {"parkCar","driveCar","startCar"}) // just one it wont work becuse park car depend on drive car and start car and drive car is dependent on start car so
    //to work it must be written all that the test are dependent on  not just one.
    //{"parkCar","driveCar","startCar"})
    void stopCar(){
        System.out.println("car is stopped");
    }
}
