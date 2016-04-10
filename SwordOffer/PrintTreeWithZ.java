package com.magicwolf.niuke;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
 *  第三行按照从左到右的顺序打印，其他行以此类推。
 * 
 * @author MagicWolf
 * 
 */
public class PrintTreeWithZ {
    public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(pRoot==null)return result;
        Deque<TreeNode> deque=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        deque.add(pRoot);
        while(!deque.isEmpty()||!stack.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            if(stack.isEmpty()){
                while(!deque.isEmpty()){
                    TreeNode tmp=deque.pollLast();
                    System.out.println(tmp.val);
                    if(tmp.left!=null) stack.push(tmp.left);
                    if(tmp.right!=null) stack.push(tmp.right);
                    list.add(tmp.val);
                }
            }else{
                while(!stack.isEmpty()){
                    TreeNode tmp=stack.pop();
                    if(tmp.right!=null) deque.add(tmp.right);
                    if(tmp.left!=null) deque.add(tmp.left);
                    list.add(tmp.val);
                }
            }
            result.add(list);
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        System.out.println(Print(root));
    }
}
