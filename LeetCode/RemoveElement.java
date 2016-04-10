package com.magicwolf.leetcode;

import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * @author MagicWolf
 * 
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int length=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[length++]=nums[i];
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
        System.out.println(removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
    }
}
