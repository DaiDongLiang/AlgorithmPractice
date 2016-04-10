package com.magicwolf.niuke;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * @author MagicWolf
 * 
 */
public class ReOrderArray {
    public static void reOrderArray(int [] array) {
        if(array==null||array.length==0) return;
        for(int i=0;i<array.length;i++){
            int num=array[i];
            if((num&1)==1){
                int j=i;
                for(;j>0;j--){
                    if((array[j-1]&1)==1)break;
                    else array[j]=array[j-1];
                }
                array[j]=num;
            }
        }
    }
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,6,5,8,7,9};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}
