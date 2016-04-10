package com.magicwolf.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's
 * sum equals the given sum.
 * For example:
    Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
    return
    [
       [5,4,11,2],
       [5,8,4,5]
    ]
 * @author MagicWolf
 * 
 */
public class PathSumII {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        LinkedList<Integer> path=new LinkedList<>();
        pathSum(root,result,path,0, sum);
        return result;
    }
    private static  void pathSum(TreeNode node,List<List<Integer>> result,LinkedList<Integer> path,int current,int sum){
        path.add(node.val);
        if(node.left==null&&node.right==null&&(node.val+current)==sum){
            LinkedList<Integer> temp=new LinkedList<>(path);
            result.add(temp);
        }
        if(node.left!=null){
            pathSum(node.left,result,path,current+node.val, sum);
        }
        if(node.right!=null){
            pathSum(node.right,result,path,current+node.val, sum);
        }
        path.removeLast();
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.right= new TreeNode(3);
        System.out.println(pathSum(root,7));
    }
}
