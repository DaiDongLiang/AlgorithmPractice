package com.magicwolf.leetcode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * @author MagicWolf
 * 
 */
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)return null;
        if(l1!=null&&l2==null)return l1;
        if(l2!=null&&l1==null)return l2;
        ListNode point1=l1,point2=l2;
        ListNode head,tail;
        if(l1.val<l2.val){
            tail=head=l1;
            point1=point1.next;
        }else{
            tail=head=l2;
            point2=point2.next;
        }
        for(;point1!=null&&point2!=null;){
            if(point1.val<point2.val){
                tail=tail.next=point1;
                point1=point1.next;
            }else{
                tail=tail.next=point2;
                point2=point2.next;
            }
        }
        if(point1!=null)
            tail.next=point1;
        if(point2!=null)
            tail.next=point2;
        return head;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode tail=head;
        tail=tail.next=new ListNode(2);
        tail=tail.next=new ListNode(4);
        tail=tail.next=new ListNode(6);
        tail=tail.next=new ListNode(7);
        
        ListNode head1=new ListNode(3);
        ListNode tail1=head1;
        tail1=tail1.next=new ListNode(5);
        tail1=tail1.next=new ListNode(8);
        tail1=tail1.next=new ListNode(9);
        head=mergeTwoLists(head, head1);
        ListNode.print(head);
    }
}
