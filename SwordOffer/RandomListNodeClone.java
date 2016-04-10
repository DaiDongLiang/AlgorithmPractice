package com.magicwolf.niuke;

public class RandomListNodeClone {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null) return null;
        RandomListNode cNode=pHead;
        while(cNode!=null){
            RandomListNode node=new RandomListNode(cNode.label);
            node.next=cNode.next;
            cNode.next=node;
            cNode=node.next;
        }
        cNode=pHead;
        while(cNode!=null){
            RandomListNode node=cNode.next;
            if(cNode.random!=null) node.random=cNode.random.next;
            cNode=node.next;
        }
        RandomListNode temp,newHead=pHead.next;
        cNode=pHead;
        while(cNode.next!=null){
            temp=cNode.next;
            cNode.next=temp.next;
            cNode=temp;
        }
        return newHead;
    }
    public static void main(String[] args) {
        RandomListNodeClone rlnc=new RandomListNodeClone();
        RandomListNode head=new RandomListNode(1);
        head.next=new RandomListNode(2);
        head.next=new RandomListNode(3);
        head.next=new RandomListNode(4);
        RandomListNode newHead=rlnc.Clone(head);
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}