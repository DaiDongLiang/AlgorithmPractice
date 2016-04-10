package com.magicwolf.leetcode;

public class RangeSumQuery {
    private int[] sum=null;
    public RangeSumQuery(int[] nums) {
        if(nums==null||nums.length==0){
            sum=new int[0];
        }else{
            sum=new int[nums.length];
            sum[0]=nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum[i]=sum[i-1]+nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(sum.length==0||i>j||i>sum.length||j>sum.length) return 0;
        if(i==0) return sum[j];
        return sum[j]-sum[i-1];
    }
}
