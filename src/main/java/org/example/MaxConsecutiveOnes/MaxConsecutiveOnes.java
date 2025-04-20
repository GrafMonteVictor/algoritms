package org.example.MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counterMax = 0;
        int counterTemp = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counterTemp++;
            } else {
                if (counterMax < counterTemp) {
                    counterMax = counterTemp;
                }
                counterTemp = 0;
            }
        }
        if (counterMax < counterTemp) {
            counterMax = counterTemp;
        }

        return counterMax;
    }
}
