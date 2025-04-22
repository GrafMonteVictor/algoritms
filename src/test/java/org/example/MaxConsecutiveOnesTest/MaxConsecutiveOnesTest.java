package org.example.MaxConsecutiveOnesTest;

import org.example.maxConsecutiveOnes.MaxConsecutiveOnes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {
    MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
    @Test
    void findMaxConsecutiveOnesTest1() {
        int nums[] = {1,1,0,1,1,1};
        int one = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        Assertions.assertEquals(3, one);
    }

    @Test
    void findMaxConsecutiveOnesTest2() {
        int nums[] = {1};
        int one = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        Assertions.assertEquals(1, one);
    }
}
