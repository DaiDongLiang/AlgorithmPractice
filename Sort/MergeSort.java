package com.magicwolf.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 原理:将序列分割为两个子序列,再对两个子序列采用归并排序，最后将排序好的子序列合并成最终序列。
 * 时间复杂度:O(NlogN)
 * 空间复杂度:O(N)
 * 稳定性:稳定
 * 优化:
 *  1.对于小序列直接使用选择排序;
 *  2.合并前判断nums[mid]是否小于等于nums[mid+1]
 *  3.为了节省数组拷贝的时间，可以在递归调用的每层交换初始数组和辅助数组。
 * @author MagicWolf
 *
 */
public class MergeSort {
    static void mergeSort(int[] nums){
        int[] temp=new int[nums.length];
        mergeSort(nums, temp, 0, nums.length-1);
    }
    static void mergeSort(int[] nums, int[] temp,int left,int right){
        if(left<right){
            int center=(left+right)/2;
            mergeSort(nums, temp, left, center);
            mergeSort(nums,temp,center+1,right);
            merge(nums,temp,left,center+1,right);
        }
    }
    static void merge(int[] nums,int[] temp,int leftPos,int rightPos,int rightEnd ){
        int leftEnd=rightPos-1;
        int tempPos=leftPos;
        int size=rightEnd-leftPos+1;
        while(leftPos<=leftEnd&&rightPos<=rightEnd){//主循环
            if(nums[leftPos]<nums[rightPos]) 
                temp[tempPos++]=nums[leftPos++];
            else 
                temp[tempPos++]=nums[rightPos++];
        }
        while(leftPos<=leftEnd)
            temp[tempPos++]=nums[leftPos++];
        while(rightPos<=rightEnd)
            temp[tempPos++]=nums[rightPos++];
        for(int i=0;i<size;i++,rightEnd--){
            nums[rightEnd]=temp[rightEnd];
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,3,4,5,8,2,7 };
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
