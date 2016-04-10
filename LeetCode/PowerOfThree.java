package com.magicwolf.leetcode;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * @author MagicWolf
 * 
 */
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n!=1&&n%3!=0)return false;
        double result=Math.log10(n)/Math.log10(3);
        return result-(int)result==0;
    
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
    }
}
