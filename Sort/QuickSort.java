package com.magicwolf.sort;
/**
 * 快速排序
 * 原理:通过一趟排序将要排序的数据分割成独立的两个部分，
 * 其中一个部分的所有数据都比另一个部分的小。再递归的对两部分分别排序
 * 时间复杂度:
 *   最好:基准值正好是中间值O(NlogN)
 *   最坏:基准值为最大值或最小值,退化为冒泡排序O(N^2)
 *   平均:O(NlogN)
 * 空间复杂度:O(1)
 * 稳定性:不稳定
 * 优化:
 *   1.随机选取基准值,避免分布不均问题
 *   2.三数中值分割法
 * @author MagicWolf
 *
 */
public class QuickSort {
    private static final int CUTOFF =10;
    /**
     * 驱动程序
     * @param nums
     */
    static void quicksort( int [ ] nums ){
        quicksort( nums, 0, nums.length - 1 );
    }
    /**
     * 
     * @param a
     * @param left
     * @param right
     */
    private static void quicksort(int[] a, int left, int right) {
        if (left + CUTOFF <= right){
            int pivot = median3(a, left, right);//选取枢纽元
            
            // 开始排序
            int i = left, j = right - 1;
            for (;;) {
                while (a[++i] < pivot) { }//找到一个比枢纽元小的值
                while (a[--j] > pivot) { }//找一个比枢纽元大的值
                if (i < j)
                    swapReferences(a, i, j);
                else
                    break;
            }
            //一次排序结束，将枢纽元放到正确位置
            swapReferences(a, i, right - 1);
            
            //对两个子序列进行排序
            quicksort(a, left, i - 1);
            quicksort(a, i + 1, right);
        } else
            // //如果小于10则运用插入排序
            insertionSort(a, left, right);
    }
    /**
     * 三数中值分割法
     * @param a
     * @param left
     * @param right
     * @return
     */
    static int median3( int [ ] a, int left, int right ){
        int center = ( left + right ) / 2;
        if( a[ center ]< a[ left ] )
            swapReferences( a, left, center );
        if( a[ right ]<a[ left ] )
            swapReferences( a, left, right );
        if( a[ right ]<a[ center ])
            swapReferences( a, center, right );

            // 将枢纽元放在right-1的位置,将它作为警戒标志
        swapReferences( a, center, right - 1 );
        return a[ right - 1 ];
    }
    static final void swapReferences( int [ ] a, int index1, int index2 ){
        int tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

    
    static void insertionSort(int[] a, int left, int right) {
        for (int p = left + 1; p <= right; p++) {
            int tmp = a[p];
            int j;
            for (j = p; j > left && tmp < a[j - 1]; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }
}
