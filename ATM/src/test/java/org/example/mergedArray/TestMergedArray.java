package org.example.mergedArray;

import org.example.mergedArray.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMergedArray {
    Solution solution = new Solution();
    @Test
    void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        solution.merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(nums1, new int[]{1,2,2,3,5,6});
    }
}
