package com.magicwolf.leetcode;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements. For example, given
 * nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3,
 * 12, 0, 0]. Note: You must do this in-place without making a copy of the
 * array. Minimize the total number of operations.
 * 
 * @author MagicWolf
 * 
 */
public class MoveZeroes {
    /**
     * 时间复杂度O(N^2)
     */
    public static void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                int num = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[j - 1] = nums[j];
                    } else if (nums[j] == 0) {
                        nums[j - 1] = num;
                        break;
                    }
                    if (j == nums.length - 1) {
                        nums[j] = num;
                        break;
                    }
                }
            }
        }
    }

    /**
     * O(N)
     */
    public static void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int index = 0;
        for (int num : nums) {
            if (num != 0)
                nums[index++] = num;
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }


    public static void moveZeroes2(int[] nums) {
        int i = 0,index= 0;
        for (; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index != i) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
    }
    public void moveZeroes3(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0)
                nums[insertPos++] = num;
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }
}
