package com.magicwolf.leetcode;
/**
 * 
 * @author MagicWolf
 *
 */
public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int result=0;
        while(n!=0){
            result++;
            n=(n-1)&n;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(3));
    }
}
