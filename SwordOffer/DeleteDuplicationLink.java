package com.magicwolf.swordoffer;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;



/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5
 * 处理后为 1->2->5
 * 
 * @author MagicWolf
 * 
 */
public class DeleteDuplicationLink {
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null||pHead.next==null) return pHead;
        ListNode pre = new ListNode(0);
        pre.next = pHead;
        ListNode p = pHead;
        pHead = pre;
        while(p.next!=null){
            if(p.val==p.next.val){
                p=p.next;
            }else{
                if(pre.next==p){
                    pre=p;
                    p=p.next;
                }else{
                    pre.next=p.next;
                    p=p.next;
                }
            }
        }
        if(pre.next!=p)pre.next=null;
        return pHead.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(2);
        print(deleteDuplication(head));
    }
    public static void  print(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
