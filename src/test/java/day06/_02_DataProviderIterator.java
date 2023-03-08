package day06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class _02_DataProviderIterator {

    @Test
    void searchTest(String searchText){
        System.out.println("search"+searchText);

    }
   @ DataProvider
    public Iterator<Object[]> myDAta(){
return myDAta();
    }

}
