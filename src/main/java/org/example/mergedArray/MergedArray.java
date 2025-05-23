package org.example.mergedArray;

public class MergedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n-1;  //last index
        while(n>0)
        {
            if(m>0 && nums1[m-1]>nums2[n-1])
            {
                nums1[index] = nums1[m-1];
                m--;
            }
            else
            {
                nums1[index] = nums2[n-1];
                n--;
            }
            index --;
        }
    }
}
