package com.magicwolf.leetcode;

/**
 * 231. Power of Two. 
 * Given an integer, write a function to determine if it is a
 * power of two.
 * 
 * @author MagicWolf
 * 
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n!=1&&n%2!=0)return false;
        double result=Math.log10(n)/Math.log10(2);
        return result-(int)result==0;
    }
    public static boolean isPowerOfTwo1(int n) {
        return n>0?(n&(n-1))==0:false;
    }
}
