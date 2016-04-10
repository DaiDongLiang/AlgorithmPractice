package com.magicwolf.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static  boolean isHappy(int n) {
        if(n==1) return true;
        boolean[] flag=new boolean[10000];
        while(true){
            int result=0;
            for(;n!=0;n=n/10){
                int num=n%10;
                result+=(num*num);
            }
            if(result==1)return true;
            if(flag[result])return false;
            n=result;
            flag[result]=true;
        }
    }
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
