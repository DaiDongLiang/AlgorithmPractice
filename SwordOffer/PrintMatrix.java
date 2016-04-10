package com.magicwolf.niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字.
 * 例如，如果输入如下矩阵： 
 * 1  2  3  4 
 * 5  6  7  8 
 * 9  10 11 12 
 * 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * @author MagicWolf
 * 
 */
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        if(matrix==null||matrix.length==0) return list;
        int row=matrix.length,col=matrix[0].length;
        while(row>0&&col>0){
            print(list, matrix, col,row);
            col-=2;
            row-=2;
        }
        return list;
    }
    private static void print(List<Integer> list,int[][] matrix,int width,int height){
        int colBegin=(matrix[0].length-width)/2,colEnd=colBegin+width-1;
        int rowBegin=(matrix.length-height)/2,rowEnd=rowBegin+height-1;
        System.out.println("rowBegin:"+rowBegin+"---rowEnd:"+rowEnd);
        System.out.println("colBegin:"+colBegin+"---colEnd:"+colEnd);
        for(int i=colBegin;i<=colEnd;i++) list.add(matrix[rowBegin][i]);
        for(int i=rowBegin+1;i<=rowEnd;i++) list.add(matrix[i][colEnd]);
        if(width>1&&height>1){
            for(int i=colEnd-1;i>=colBegin;i--) list.add(matrix[rowEnd][i]);
            for(int w=rowEnd-1;w>=rowBegin+1;w--) list.add(matrix[w][rowBegin]);
        }
    }
    public static void main(String[] args) {
//        int[][] matrix=new int[][]{
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15},
//                {16,17,18,19,20},
//                {21,22,23,24,25}
//        };
        int[][] matrix=new int[][]{
                {1},{2},{3},{4},{5}
        };
//        int[][] matrix=new int[][]{
//                {1,2},
//                {3,4},
//                {5,6},
//                {7,8},
//                {9,10}
//        };
        System.out.println(printMatrix(matrix));
        
    }
}
