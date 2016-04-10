package com.magicwolf.sort;
/**
 * 希尔排序
 * 原理:
 *  采用分治策略,先将序列分割为若干子序列，
 *  分别对子序列进行插入排序，使得原来的序列基本有序。最后对整个序列进行排序。
 *  
 * 时间复杂度:
 *  最好:升序O(N)
 *  最坏情况:O(NlogN)
 *  平均:O(NlogN)
 * 空间复杂度:O(1)
 * 优化:
 *   1.将查找插入位置的代码替换为二分查找。
 * 稳定性:不稳定
 * @author MagicWolf
 *
 */
public class ShellSort {
    /**
     * 使用希尔增量
     * @param a an array of Comparable items.
     */
    public static void shellsort(int[ ] nums)
    {
         for( int gap = nums.length / 2; gap > 0; gap /= 2 )//gap增量
             for( int i = gap; i < nums.length; i++ ){
                 int tmp = nums[i],j=i;
                 for(; j >= gap &&tmp< nums[ j - gap ]; j -= gap )//插入排序
                     nums[ j ] = nums[ j - gap ];
                 nums[ j ] = tmp;
             }
    }

}
