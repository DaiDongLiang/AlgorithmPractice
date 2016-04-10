package com.magicwolf.sort;

import java.util.Arrays;

/**
 * 直接插入排序
 * 原理:
 *   每次将一个待排序的记录，按其关键字大小插入到前面已经排好序的子序列中的适当位置， 
 *   直到全部记录插入完成为止。
 * 时间复杂度:
 *   最好情况,序列已排序O(N);
 *   最坏情况.逆序O(N^2);
 *   平均O（N^2）
 * 空间复杂度:O(1)
 * 优化改进
 *   1.二分查找插入排序：因为在一个有序区中查找一个插入位置，所以可使用二分查找，减少元素比较次数提高效率。
 *   2.希尔排序：如果序列本来就是升序或部分元素升序，那么比较+后移赋值操作次数就会减少。
 *      希尔排序通过分组的办法让部分元素升序再进行整个序列排序。
 * 稳定性:稳定
 * @author MagicWolf
 * 
 */
public class InsertSort {
    static void Insertsort(int[] nums , int n) {
       for(int i=1;i<n;i++){
           int temp=nums[i],j=i;
           for(;j>0&&temp<nums[j-1];j--)
               nums[j]=nums[j-1];
           nums[j]=temp;
       }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 5, 3, 4, 3 };
        Insertsort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
