package com.magicwolf.swordoffer;

import java.util.ArrayList;
import java.util.Stack;


/**
 * 逆序打印链表
 * 
 * @author MagicWolf
 * 
 */
public class PrintListWithReversed {
    public static ArrayList<Integer> print(ListNode listNode){
        Stack<Integer> stack=new Stack<>();
        for(;listNode!=null;listNode=listNode.next){
            stack.push(listNode.val);
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        System.out.println(print(head));
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
