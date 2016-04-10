package com.magicwolf.niuke;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。
 * 例如， 5 
 *      / \ 
 *      3 7 
 *     /\ /\ 
 *    2 4 6 8 中，
 *    按结点数值大小顺序第三个结点的值为4。
 * 
 * @author MagicWolf
 * 
 */
public class BinaryTreeKthNode {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(k==0||pRoot==null)return null;
        List<TreeNode> list=new LinkedList<>();
        LDR(pRoot, list,k);
        return list.size()<k?null:list.get(k-1);
    }
    private void LDR(TreeNode node,List<TreeNode> list,int k){
        if(node.left!=null) LDR(node.left,list,k);
        if(list.size()<k) list.add(node);
        if(node.right!=null)LDR(node.right,list,k);
    }
    public static void main(String[] args) {
        BinaryTreeKthNode btk=new BinaryTreeKthNode();
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);
        System.out.println(btk.KthNode(root, 2).val);
    }
}
