package org.example.maximumAverageSubarray;

public class MaximumAverageSubarray2 {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1 && k==1) return nums[0];
        int sum =0;
        double max=Double.NEGATIVE_INFINITY;;
        int right=0,left=0;
        while(right<nums.length){
            sum+=nums[right];
            if(right-left+1>k){
                sum-=nums[left++];
            }
            if(right-left+1==k){
                max=Math.max(sum,max);
                System.out.println(max);
            }
            right++;
        }
        System.gc();
        return max/k;
    }
}
