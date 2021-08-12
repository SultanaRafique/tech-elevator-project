package com.techelevator;

import junit.framework.Assert;
import org.junit.Test;

public class DateFashionTests {

    @Test
    public void  DateFashionTest_minValue_test_returns0(){
        DateFashion dateFashion = new DateFashion();

        //arrange
        int Expected = 0;

        //act
        int Actual = dateFashion.getATable(0, 0);

        //assert
        Assert.assertEquals(Expected, Actual);


    }

    @Test
    public void  DateFashionTest_maxValue_test_returns2(){
        DateFashion dateFashion = new DateFashion();

        //arrange
        int Expected = 2;

        //act
        int Actual = dateFashion.getATable(10, 10);

        //assert
        Assert.assertEquals(Expected, Actual);


    }



    // higher than 2 returns 1.
    @Test
    public void  DateFashionTest_both3_returns1() {

        //arrange
        DateFashion dateFashion = new DateFashion();
        Integer Expected = 1;

        //act
        Integer Actual = dateFashion.getATable(3, 3);

        //assert
        Assert.assertEquals(Expected, Actual);
    }

    // less than 7 returns 1.
    @Test
    public void  DateFashionTest_both7_returns1() {

        //arrange
        DateFashion dateFashion = new DateFashion();
        Integer Expected = 1;

        //act
        Integer Actual = dateFashion.getATable(7, 7);

        //assert
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void  DateFashionTest_you0_date10_returns0() {

        //arrange
        DateFashion dateFashion = new DateFashion();
        Integer Expected = 0;

        //act
        Integer Actual = dateFashion.getATable(0, 10);

        //assert
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void  DateFashionTest_you10_date0_returns0() {

        //arrange
        DateFashion dateFashion = new DateFashion();
        Integer Expected = 0;

        //act
        Integer Actual = dateFashion.getATable(10, 0);

        //assert
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void  DateFashionTest_you3_date7_returns1() {

        //arrange
        DateFashion dateFashion = new DateFashion();
        Integer Expected = 1;

        //act
        Integer Actual = dateFashion.getATable(3, 7);

        //assert
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void  DateFashionTest_you7_date3_returns1() {

        //arrange
        DateFashion dateFashion = new DateFashion();
        Integer Expected = 1;

        //act
        Integer Actual = dateFashion.getATable(7, 3);

        //assert
        Assert.assertEquals(Expected, Actual);
    }

}
