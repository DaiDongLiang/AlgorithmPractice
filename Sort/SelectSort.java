package com.magicwolf.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 原理:将未排序区域的最小值放入已排序区域的末尾。
 * 时间复杂度:
 *   最优:升序,O(N^2)
 *   最坏:降序,O(N^2)
 *   平均:O(N^2)
 * 空间复杂度:O(1)
 * 优化:
 *  1. 相同元素:如果重复率较高,可以用辅助空间将本次选择相同的数的索引记录下来，一次处理。
 *  2. 堆排序:在从未排序区选出最小值得过程中，
 *     简单选择排序的每次比较可能在之前的比较中已经计算过,
 *     使用堆记录下未排序区的比较结果可以减少比较次数。
 *  3.二元选择排序，在一次循环中同时选出最大值和最小值
 * @author MagicWolf
 *
 */
public class SelectSort {
    static void selectSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j])
                    minIndex=j;
            }
            if(minIndex==i)continue;
            
            int temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,3,4,5,8,2,7 };
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
