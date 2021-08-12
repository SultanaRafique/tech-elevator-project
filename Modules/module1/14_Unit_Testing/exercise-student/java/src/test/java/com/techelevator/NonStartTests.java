package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    @Test
    public void nonStart_Hello_There_returns_ellohere(){
        //Arrange
        NonStart nonstart = new NonStart();
        String Expected = "ellohere";

        //Action
        String Actual = nonstart.getPartialString("Hello", "There");

        //Assert
        Assert.assertEquals(Expected, Actual);

    }

    @Test
    public void nonStart_shotl_java_returns_hotlava(){
        //Arrange
        NonStart nonstart = new NonStart();
        String Expected = "hotlava";

        //Action
        String Actual = nonstart.getPartialString("shotl", "java");

        //Assert
        Assert.assertEquals(Expected, Actual);

    }

    @Test
    public void nonStart_java_code_returns_avaode() {
        //Arrange
        NonStart nonstart = new NonStart();
        String Expected = "avaode";

        //Action
        String Actual = nonstart.getPartialString("java", "code");

        //Assert
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void nonStart_12_13_returns_23() {
        //Arrange
        NonStart nonstart = new NonStart();
        String Expected = "23";

        //Action
        String Actual = nonstart.getPartialString("12", "13");

        //Assert
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void nonStart_aaaaa_bbbbb_returns_aaaabbbb() {
        //Arrange
        NonStart nonstart = new NonStart();
        String Expected = "aaaabbbb";

        //Action
        String Actual = nonstart.getPartialString("aaaaa", "bbbbb");

        //Assert
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    public void nonStart_3underscore_3underscore_returns_4underscore() {
        //Arrange
        NonStart nonstart = new NonStart();
        String Expected = "____";

        //Action
        String Actual = nonstart.getPartialString("___", "___");

        //Assert
        Assert.assertEquals(Expected, Actual);
    }
}
