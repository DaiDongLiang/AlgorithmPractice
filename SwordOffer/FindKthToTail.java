package com.magicwolf.swordoffer;

public class FindKthToTail {
    public static ListNode findKthToTail(ListNode head,int k) {
        if(k==0) return null;
        ListNode k2=head,k1=head;
        for(int i=0;i<k-1&&k1!=null;i++){
            k1=k1.next;
        }
        if(k1==null)return null;
        k1=k1.next;
        while(k1!=null){
            k2=k2.next;
            k1=k1.next;
        }
        return k2;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        System.out.println(findKthToTail(head, 45).val);
    }
}
