package com.magicwolf.swordoffer;
/**
 * 丑数
 * @author MagicWolf
 *
 */
public class UglyNumber {
    public static int uglyNumber(int index) {
        if(index<=0) return 0;
        int[] uglyNumbers=new int[index];
        uglyNumbers[0]=1;
        int nextindex=1,index2=0,index3=0,index5=0;
        while(nextindex<index){
            int min=Math.min(uglyNumbers[index2]*2, Math.min(uglyNumbers[index3]*3, uglyNumbers[index5]*5));
            uglyNumbers[nextindex++]=min;
            while(uglyNumbers[index2]*2<=min) index2++;
            while(uglyNumbers[index3]*3<=min) index3++;
            while(uglyNumbers[index5]*5<=min) index5++;
        }
        return uglyNumbers[nextindex-1];
    }
    public static void main(String[] args) {
        System.out.println(uglyNumber(1500));
    }
}
