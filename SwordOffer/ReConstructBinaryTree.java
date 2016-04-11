package com.magicwolf.swordoffer;
/**
 * 根据先序遍历和中序遍历重建二叉树
 * @author MagicWolf
 *
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBinaryTree(pre, 0, pre.length, in, 0, in.length);
    }
    private TreeNode reConstructBinaryTree(int[] pre,int preLeft,int preRight,int[] in ,int inLeft,int inRight){
        if(preLeft>preRight||inLeft>inRight)return null;
        TreeNode root=new TreeNode(pre[preLeft]);
        for(int i=inLeft;i<=inRight;i++){
            if(pre[preLeft]==in[i]){//先序遍历的第一个位置是根节点
                root.left=reConstructBinaryTree(pre, preLeft+1, preLeft+i-inLeft, in, inLeft,i-1);
                root.right=reConstructBinaryTree(pre,i-inLeft+preLeft+1, preRight, in, i+1, inRight);
            }
        }
        return root;
    }
}
