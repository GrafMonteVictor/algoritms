package org.example.maximumAverageSubarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumAverageSubarray2Test {
    MaximumAverageSubarray2 maximumAverageSubarray2 = new MaximumAverageSubarray2();

    @Test
    void findMaxAverageTestSeveralNums2() {
        int[] num = new int[]{1, 12, -5, -6, 50, 3};
        int k = 5;
        var result = maximumAverageSubarray2.findMaxAverage(num, k);
        Assertions.assertEquals(10.8, result);
    }
}
