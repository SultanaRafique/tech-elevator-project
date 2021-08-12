package com.techelevator.Items;

import com.techelevator.Register;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class InventoryTest {

    @Test
    public void getItems_withValidFile_ShouldReturnCorrectMap(){

        Inventory inventory = new Inventory();
        Map<String, Item> expectedMap = new TreeMap<>();

        ChipItem chip1 = new ChipItem("A1","Potato Crisps", 305, "Chip", 5 );
        ChipItem chip2 = new ChipItem("A2","Stackers", 145, "Chip", 5 );
        expectedMap.put("A1",chip1);
        expectedMap.put("A2",chip2);

        Map<String,Item> actualMap = inventory.getInventoryMap();

        Set<String> expecteKeySet = expectedMap.keySet();

        boolean result = false;
        for(String s : expecteKeySet){
             result = expectedMap.get(s).getName().equals(actualMap.get(s).getName());
        }


        Assert.assertTrue(result);

    }
}
