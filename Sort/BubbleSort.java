package com.magicwolf.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 原理:重复的遍历要排序的数组，每次遍历过程中从头至尾比较两个相邻的元素，若顺序错误则交换两个元素.
 * 时间复杂度:
 *   最好:序列是升序O(N);
 *   最坏:序列式降序O(N^2);
 *   平均:O(N^2);
 * 空间复杂度:O(1)
 * 优化:
 *   1.在进行相邻元素比较时，可以记录下循环中没有发生交换的多个连续索引对（起始索引和结束索引）.
 *   在下次轮询时直接对有序区间的最大值进行比较。
 *   2.传统冒泡每次只能找到一个最大值或最小值，可以在每趟排序中进行正向和方向两遍冒泡。
 *  稳定性:稳定
 * @author MagicWolf
 *
 */
public class BubbleSort {
    static void bubbleSort(int[] nums){
        boolean isSorted=false;
        for(int i=0;i<nums.length&&!isSorted;i++){
            isSorted=true;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    isSorted=false;
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,3,4,5,8,2,7 };
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
