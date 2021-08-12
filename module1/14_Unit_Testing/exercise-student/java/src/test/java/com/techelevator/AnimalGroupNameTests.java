package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    @Test
    public void AnimalGroupName_null_animalName_return_unknown() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        String Expected = "unknown";

        //Act
        Object result = animalGroup.getHerd(null);

        //Assert
        Assert.assertEquals(Expected, result);
    }

    @Test
    public void valid_AnimalName_shouldReturn_validAnimalGroupName() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        String Expected = "Pride";

        //Act
        Object result = animalGroup.getHerd("LION");

        //Assert
        Assert.assertEquals(Expected, result);
    }

    @Test
    public void AnimalGroupName_empty_string_returns_unknown() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        String Expected = "unknown";

        //Act
        Object result = animalGroup.getHerd("");

        //Assert
        Assert.assertEquals(Expected, result);
    }
    @Test
    public void AnimalGroupName_invalid_AnimalName_returns_unknown() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        String Expected = "unknown";

        //Act
        Object result = animalGroup.getHerd("elephants");

        //Assert
        Assert.assertEquals(Expected, result);
    }

    @Test
    public void AnimalGroupName_lowerCase_AnimalName_returns_valid_output() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        String Expected = "Herd";

        //Act
        Object result = animalGroup.getHerd("deer");

        //Assert
        Assert.assertEquals(Expected, result);
    }

    @Test
    public void AnimalGroupName_upperCase_AnimalName_returns_valid_output() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        String Expected = "Herd";

        //Act
        Object result = animalGroup.getHerd("DEER");

        //Assert
        Assert.assertEquals(Expected, result);
    }

    @Test
    public void AnimalGroupName_randomCase_AnimalName_returns_valid_output() {
        //Arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        String Expected = "Herd";

        //Act
        Object result = animalGroup.getHerd("dEeR");

        //Assert
        Assert.assertEquals(Expected, result);
    }

}
