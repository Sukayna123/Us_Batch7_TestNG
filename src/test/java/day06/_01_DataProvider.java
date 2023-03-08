package day06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider="myData")
    void test1(String username,String password){
        System.out.println("Test is running"+username+password);
    }
    @DataProvider
    public Object [][]myData(){
        Object[][] dataList={{"john","john123"},{"tony","tonytony"},{"dragon","dragon44"}};
        return dataList;
    }

    @Test(dataProvider = "usernames")
    void test2(String username){
        System.out.println("test 2 is running "+username);
    }
    @DataProvider(name="usernames")
    public Object [][] dataList2(){
        Object [][] dataList={{"d"},{"f"},{"g"}};
        return dataList;
    }

}
