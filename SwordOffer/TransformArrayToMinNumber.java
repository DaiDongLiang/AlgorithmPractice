package com.magicwolf.swordoffer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 把数组排成最小的数 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 * 
 * @author MagicWolf
 * 
 */
public class TransformArrayToMinNumber {
    public static  String PrintMinNumber(int [] numbers) {
        if(numbers.length==0) return "";
        Integer[] integers=new Integer[numbers.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i]=numbers[i];
        }
        Arrays.sort(integers,new Comparator<Integer>() {

            @Override
            public int compare(Integer n, Integer m) {
                String nm=n+""+m;
                String mn=m+""+n;
                return nm.compareTo(mn);
            }
        });
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < integers.length; i++) {
            sb.append(integers[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(PrintMinNumber(new int[]{3,32,321}));
    }
}
