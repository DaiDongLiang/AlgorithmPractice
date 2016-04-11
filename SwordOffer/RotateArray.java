package com.magicwolf.swordoffer;

public class RotateArray {
    public static int RotateArray(int [] array) {
        if(array==null||array.length==0)return 0;
        if(array.length==1)return array[0];
        int left=0,right=array.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(array[mid]>array[right])
                left=mid+1;
            else if(array[mid]<array[right])
                right=mid;
            else
                right=right-1;
            if(left>=right) break;
        }
        return array[left];
    }
    public static void main(String[] args) {
        System.out.println(RotateArray(new int[]{2,2,2,1,2,2}));
    }
}
