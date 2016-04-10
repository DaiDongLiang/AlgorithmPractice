package com.magicwolf.niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 
 * @author MagicWolf
 * 
 */
public class KthNumber {
    private static final int CUTOFF =10;
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if(k>input.length) return list; 
        kthNumber(input,0,input.length-1,k);
        add(list, input, 0, k-1);
        return list;
    }
    private static void kthNumber(int[] input,int left,int right,int k){
        if(left+CUTOFF<=right){
            int pivot = median3(input, left, right);//选取枢纽元
            System.out.println("Pivot:"+pivot);
            // 开始排序
            int i = left, j = right - 1;
            for (;;) {
                while (input[++i] < pivot) { }//找到一个比枢纽元小的值
                while (input[--j] > pivot) { }//找一个比枢纽元大的值
                if (i < j)
                    swapReferences(input, i, j);
                else
                    break;
            }
            //一次排序结束，将枢纽元放到正确位置
            swapReferences(input, i, right - 1);
            System.out.println(Arrays.toString(input));
            if(k<=i){
                kthNumber(input,left, i-1,k);
            }else if(k>i+1){
                kthNumber(input, i+1, right, k);
            }
        }else{
            insertionSort(input, left, right);
        }
    }
    static void add(List<Integer> list,int[] input,int left,int right){
        for(int i=left;i<=right;i++){
            list.add(input[i]);
        }
    }
    static int median3( int [ ] a, int left, int right ){
        int center = ( left + right ) / 2;
        if( a[ center ]< a[ left ] )
            swapReferences( a, left, center );
        if( a[ right ]<a[ left ] )
            swapReferences( a, left, right );
        if( a[ right ]<a[ center ])
            swapReferences( a, center, right );

        swapReferences( a, center, right - 1 );
        return a[ right - 1 ];
    }
    static final void swapReferences( int [ ] input, int index1, int index2 ){
        int tmp = input[ index1 ];
        input[ index1 ] = input[ index2 ];
        input[ index2 ] = tmp;
    }
    static void insertionSort(int[] ipnut, int left, int right) {
        for (int p = left + 1; p <= right; p++) {
            int tmp = ipnut[p];
            int j;
            for (j = p; j > left && tmp < ipnut[j - 1]; j--)
                ipnut[j] = ipnut[j - 1];
            ipnut[j] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] input=new int[]{4,5,1,6,2,7,3,8,12,9,20,14,10};
        System.out.println(GetLeastNumbers_Solution(input, 4));
//        System.out.println(Arrays.toString(input));
    }
}
