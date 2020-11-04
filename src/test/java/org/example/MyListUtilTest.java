package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MyListUtilTest {

    private static MyListUtil myList;

    @BeforeClass
    public static void prepare(){
        myList = new MyListUtil();
    }

    @Test
    public void prove(){

        //Riempimento dell'array da passare per fare il test
        ArrayList<Integer> test = new ArrayList<>();
        test.add(6);
        test.add(2);
        test.add(8);
        test.add(10);
        test.add(1);

        //PROVA CRESCENTE
        assertEquals(Arrays.asList(1,2,6,8,10), myList.ordinaCrescente(test));
        assertNotEquals(Arrays.asList(1,2,10,16,14), myList.ordinaCrescente(test));

        //PROVA DECRESCENTE
        assertEquals(Arrays.asList(10,8,6,2,1), myList.ordinaDecrescente(test));
        assertNotEquals(Arrays.asList(1,4,10,16,14), myList.ordinaCrescente(test));

    }


}
