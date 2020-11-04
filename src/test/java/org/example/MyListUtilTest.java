package org.example;

import org.joda.time.DateTime;
import org.joda.time.JodaTimePermission;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MyListUtilTest {

    private static MyListUtil myList;
    @BeforeClass
    public static void prepare(){
        myList = new MyListUtil();
        DateTime dt = new DateTime();
        System.out.print("Test executed on date: ");
        System.out.println(dt.toLocalDateTime());
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

    @Test
    public void provePesanti() {
        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 99; i >= 0; i--)
            test.add(i);
        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99), myList.ordinaCrescente(test));
    }

    @AfterClass
    public static void ending(){
        DateTime dt = new DateTime();
        System.out.print("Tests ended on date: ");
        System.out.println(dt.toLocalDateTime());
    }

}
