package com.magicwolf.sort;

import java.util.Arrays;

/**
 * 二分查找插入排序
 * 原理:在有序区查找新元素插入位置时，为了减少比较次数，
 *      采用二分查找算法进行插入位置的确定。
 * 时间复杂度:
 *   最好情况:查找位置是有序区的最后一位，无须进行后移赋值操作O(logN);
 *   最坏情况:查找位置是有序区的第一位，O(N^2);
 *   平均O(N^2)
 * 空间复杂度:O(1)
 * 稳定性:稳定
 * @author MagicWolf
 *
 */
public class BinaryInsertSort {
    static void binaryInsertSort(int[] nums){
        for(int i=1;i<nums.length;i++){
            int temp=nums[i];
            int index=binarySearchIndex(nums, i-1,temp);
            for(int j=i-1;j>=index&&i!=index;j--)
                nums[j+1]=nums[j];
            nums[index]=temp;
        }
    }
    private static int binarySearchIndex(int[] nums,int right,int num){
        int begin=0,end=right;
        while(begin<=end){
            int middle=(begin+end)/2;
            if(nums[middle]>num)
                end=middle-1;
            else
                begin=middle+1;
        }
        return begin;
    }
    public static void main(String[] args) {
        int[] nums = new int[] { 5, 3, 4, 3,1 };
        binaryInsertSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
