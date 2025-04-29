package org.example.maximumAverageSubarray;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        //тест-кейсы
        //1-ый элемент > суммы
        //Output Limit Exceeded
        double sumMax, sumTemp;
            sumMax = nums[0];
            sumTemp = nums[0];
        int j = 1;
        k = Math.min(k, nums.length);
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (k == 1) {
                sumTemp = nums[i];
                j++;
            }
            if (i != 0 && k != 1) {
                sumTemp = sumTemp - nums[i - 1];
            }
            while (j - i < k) {
//                System.out.println("i: " + i);
//                System.out.println("j: " + j);
                sumTemp += nums[j];
//                System.out.println("sumTemp: " + sumTemp);
                j++;
            }
            if (sumMax < sumTemp || sumMax == nums[0]) {
                sumMax = sumTemp;
//                System.out.println("врем. макс.: " + sumMax);
            }
        }
        double averageValue = sumMax / k;
        return averageValue;
    }
}
