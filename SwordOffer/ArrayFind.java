package com.magicwolf.swordoffer;

/**
 * 题目描述
 * 
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * 
 * @author MagicWolf
 * 
 */
public class ArrayFind {
    public static  boolean Find(int [][] array,int target) {
        if(array==null) return false;
        int col=array[0].length,row=array.length;
        for(int rindex=row-1,cindex=0;rindex>=0&&cindex<col;){
            int cur=array[rindex][cindex];
            if(cur==target) return true;
            else if(cur>target) rindex--;
            else cindex++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] array=new int[][]{
            {1,2,8,9},
            {2,4,9,12},
            {4,7,10,13},
            {6,8,11,15}};
        System.out.println(Find(array,12));
    }
}
