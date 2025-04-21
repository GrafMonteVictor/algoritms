package org.example.CanPlaceFlowersTest;

import org.example.CanPlaceFlowers.PlaceFlowers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaceFlowersTest {
    PlaceFlowers placeFlowers = new PlaceFlowers();
    @Test
    void canPlaceFlowersTestLeftRightOnesTrue() {
        int[] plantBed = {1,0,0,0,1};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 1);
        Assertions.assertEquals(true, is);
    }

    @Test
    void canPlaceFlowersTestLeftRightOnesTrue2() {
        int[] plantBed = {1,0,0,0,0,1};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 2);
        Assertions.assertEquals(false, is);
    }

    @Test
    void canPlaceFlowersTestRightOnesTrue() {
        int[] plantBed = {0,0,1};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 1);
        Assertions.assertEquals(true, is);
    }

    @Test
    void canPlaceFlowersTestFalse1() {
        int[] plantBed = {1,0,0,0,1};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 2);
        Assertions.assertEquals(false, is);
    }

    @Test
    void canPlaceFlowersTestFalse2() {
        int[] plantBed = {1,0,1,0,0,0,1};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 2);
        Assertions.assertEquals(false, is);
    }

    @Test
    void canPlaceFlowersTestAllZerosCanPlant() {
        int[] plantBed = {0,0,0,0,0};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 1);
        Assertions.assertEquals(true, is);
    }

    @Test
    void canPlaceFlowersTestAllZerosCantPlantTrue() {
        int[] plantBed = {0,0,0,0,0};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 3);
        Assertions.assertEquals(true, is);
    }

    @Test
    void canPlaceFlowersTestAllZerosCantPlantFalse() {
        int[] plantBed = {0,0,0,0,0};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 4);
        Assertions.assertEquals(false, is);
    }

    @Test
    void canPlaceFlowersTestAllOnes() {
        int[] plantBed = {1,1,1,1,1};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 1);
        Assertions.assertEquals(false, is);
    }

    @Test
    void canPlaceFlowersTestNZero() {
        int[] plantBed = {0,0,0,0,0};
        boolean is = placeFlowers.canPlaceFlowers(plantBed, 0);
        Assertions.assertEquals(true, is);
    }


}
