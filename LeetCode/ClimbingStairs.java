package com.magicwolf.leetcode;

/**
 * 70. Climbing Stairs You are climbing a stair case. It takes n steps to reach
 * to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * @author MagicWolf
 * 
 */
public class ClimbingStairs {
    /**
     * 递归求费波拉契
     * 
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n < 0)
            return 0;
        if (n <= 1)
            return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs2(int n) {
        int first = 1, second = 1, result = 0;
        if (n == 1 || n == 0)
            return 1;
        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs2(4));
    }
}
