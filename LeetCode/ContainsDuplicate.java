package com.magicwolf.leetcode;

import java.util.Arrays;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * 
 * @author MagicWolf
 * 
 */
public class ContainsDuplicate {
    /**
     * 时间复杂度O(NlogN+N)
     * 排序NlogN,遍历N
     * 改善：自己写排序,将排序和比较合成一步.
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]-nums[i+1]==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{3,3};
        System.out.println(containsDuplicate(nums));
    }
}
