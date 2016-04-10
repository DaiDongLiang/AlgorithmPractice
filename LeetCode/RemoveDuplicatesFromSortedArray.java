package com.magicwolf.leetcode;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array nums = [1,1,2],
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively. It doesn't matter what you leave beyond the new
 * length.
 * 
 * @author MagicWolf
 * 
 */
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int length=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[length-1]){
                nums[length++]=nums[i];
            }
        }
        return length;
    }
    public static void main(String[] args) {
       int[] nums=new int[]{1,2,3,4,4,5};
       System.out.println(removeDuplicates(nums));
       System.out.println(Arrays.toString(nums));
    }
}
