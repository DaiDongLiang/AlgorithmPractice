package com.magicwolf.niuke;

import java.util.Scanner;

public class MaximumSubArrK {
//    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
//        ArrayList<Integer> list=new ArrayList<>();
//        if(size==0) return list;
//        Deque<Integer> deque=new LinkedList<>();
//        for(int i=0;i<num.length;i++){
//            while(!deque.isEmpty()&&(i-deque.peekFirst()>=size))
//                deque.pollFirst();
//            while(!deque.isEmpty()&&(num[deque.peekLast()]<=num[i]))
//                deque.pollLast();
//            deque.addLast(i);
//            if(i>=size-1){
//                System.out.println(deque.peekFirst());
//                list.add(num[deque.peekFirst()]);
//            }
//        }
//        return list;
//    }
    public static void main(String[] args) {
//        int arr[] =  {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
//        System.out.println(maxInWindows(arr ,4));
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int count=scanner.nextInt();
            int init=scanner.nextInt();
            int[] defenses=new int[count];
            for(int i=0;i<count;i++){
                defenses[i]=scanner.nextInt();
            }
            System.out.println(play(init, defenses));
        }
        scanner.close();
    }
    private static int play(int init,int[] defenses){
        int result=init;
        for (int i = 0; i < defenses.length; i++) {
            int defense=defenses[i];
            if(defense<result) result+=defense;
            else result+=divisor(defense,result);
        }
        return result;
    }
    private static int divisor(int n1,int n2){
        while(n2!=0){
           int rem=n1%n2;
           n1=n2;
           n2=rem;
       }
       return n1;
    }
}
