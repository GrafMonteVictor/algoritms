package org.example.maximumAverageSubarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumAverageSubarrayTest {
    MaximumAverageSubarray maximumAverageSubarray = new MaximumAverageSubarray();

    @Test
    void findMaxAverageTestSeveralNums1() {
        int[] num = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        var result = maximumAverageSubarray.findMaxAverage(num, k);
        Assertions.assertEquals(12.75, result);
    }

    @Test
    void findMaxAverageTestSeveralNums2() {
        int[] num = new int[]{8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
        int k = 93;
        var result = maximumAverageSubarray.findMaxAverage(num, k);
        Assertions.assertEquals(-594.58065, result);
    }

    @Test
    void findMaxAverageTestOneNum() {
        int[] num = new int[]{5};
        int k = 1;
        var result = maximumAverageSubarray.findMaxAverage(num, k);
        Assertions.assertEquals(5, result);
    }

    @Test
    void findMaxAverageTestSeveralNumsOneK() {
        int[] num = new int[]{1, 12, -5, -6, 50, 3};
        int k = 1;
        var result = maximumAverageSubarray.findMaxAverage(num, k);
        Assertions.assertEquals(50, result);
    }

    @Test
    void findMaxAverageTestKMoreArrayLength() {
        int[] num = new int[]{1, 12, -5, -6, 50, 2};
        int k = 10;
        var result = maximumAverageSubarray.findMaxAverage(num, k);
        Assertions.assertEquals(9, result);
    }

    @Test
    void findMaxAverageTestKEqualArrayLength() {
        int[] num = new int[]{1, 12, -5, -6, 50, 2};
        int k = 6;
        var result = maximumAverageSubarray.findMaxAverage(num, k);
        Assertions.assertEquals(9, result);
    }


}
