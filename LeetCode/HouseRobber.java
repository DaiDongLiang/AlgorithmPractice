package com.magicwolf.leetcode;
/**
 * 
 * @author MagicWolf
 *
 */
public class HouseRobber {
    /**
     * 穷举，超时
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0], nums[1]);
        int num1=nums[0]+rob(nums,2,true);
        int num2=rob(nums,1,false);
        return Math.max(num1, num2); 
    }
    public static int rob(int[] nums,int begin,boolean flag){
        if(begin>=nums.length-2)return nums[begin];
        if(flag){ 
            int num1=nums[begin]+rob(nums,begin+2,true);
            int num2=rob(nums,begin+1,false);
            return Math.max(num1, num2);
        }
        return nums[begin]+rob(nums,begin+2,true);
    }
    /**
     * 动态规划
     * @param nums
     * @return
     */
    public static int rob2(int[] nums) {
        int take = 0;
        int max = 0;
        int nonTake = 0; 
        for(int i = 0 ; i < nums.length; ++i){
            take = nonTake + nums[i];
            nonTake = max;
            max = Math.max(take,nonTake);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1,1,6};
        System.out.println(rob(nums));
    }
}
