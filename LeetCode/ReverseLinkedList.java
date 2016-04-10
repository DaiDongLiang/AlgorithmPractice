package com.magicwolf.leetcode;
/**
 * 206. Reverse Linked List
 * Reverse a singly linked list.
 * @author MagicWolf
 *
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(null==head||head.next==null) return head;
        ListNode newHead=head,tail=head;
        for(ListNode cur=head.next,temp;cur!=null;cur=temp){
            temp=cur.next;
            cur.next=newHead;
            newHead=cur;
        }
        tail.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode tail=head;
        tail=tail.next=new ListNode(2);
        tail=tail.next=new ListNode(3);
        head=reverseList(head);
        ListNode.print(head);
    }
}
