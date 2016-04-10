package com.magicwolf.sort;

import java.util.Arrays;

/**
 * 堆排序
 * 原理:利用二叉堆结构，快速定位指定索引位置 
 * 时间复杂度:O(NlogN)
 * 空间复杂度:O(1)
 * 稳定性:不稳定
 * @author MagicWolf
 *
 */
public class HeapSort {
    static void heapSort(int[] nums){
        for(int i=nums.length/2;i>=0;i--){//构建堆
            perDown(nums, i, nums.length);
        }
        for(int i=nums.length-1;i>0;i--){
            swap(nums, 0, i);
            perDown(nums, 0, i);
        }
    }
    /**
     * 下滤操作
     * @param nums
     * @param i
     * @param n
     */
    static void perDown(int[] nums,int i,int n){
        int child,temp;
        for(temp=nums[i];leftChild(i)<n;i=child){
            child=leftChild(i);
            if(child!=n-1&&nums[child]<nums[child+1]) child++;
            if(temp<nums[child]) nums[i]=nums[child];
            else break;
        }
        nums[i]=temp;
    }
    static int leftChild(int i){
        return i*2+1;
    }
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,3,4,5,8,2,7 };
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
