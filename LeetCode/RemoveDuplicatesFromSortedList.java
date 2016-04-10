package com.magicwolf.leetcode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode newHead=head,tail=head;
        for(ListNode node=head;node!=null;node=node.next){
            if(tail.val!=node.val){
                tail=tail.next=node;
            }
        }
        tail.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode tail=head;
        tail=tail.next=new ListNode(1);
        tail=tail.next=new ListNode(1);
        tail=tail.next=new ListNode(1);
        tail=tail.next=new ListNode(1);
        ListNode.print(head);
        head=deleteDuplicates(head);
        System.out.println();
        ListNode.print(head);
    }
}
