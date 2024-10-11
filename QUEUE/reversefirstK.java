// Reversing first k elements of queue using recursion

import java.util.*;
public class Main{
    public static void print(Queue<Integer> q){
        System.out.println();
        for(Integer i:q){
            System.out.print(i+" ");
            
        }
        System.out.println();
    }
    public static void reverse(Queue<Integer> q,int k){
        if(k==0)
              return;
    int m=q.poll();
    reverse(q,k-1);
    q.add(m);
             
      
    }
    public static void reversefirstk(Queue<Integer> q,int k,int size){
        reverse(q,k);
        int remaining=size-k;
        while(remaining--!=0){
            int m=q.poll();
            q.add(m);
            
        }
    }
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(5);
        queue.add(4);
        queue.add(9);
        queue.add(2);
        queue.add(3);
        queue.add(7);
        Scanner sc=new Scanner(System.in);
       int size=queue.size();
       System.out.println("Enter the value of k:");
       int k=sc.nextInt();
       if(k<1||k>size)
               {
                   System.out.println("K must be witing queue size");
               }
    else{           
       System.out.println("Before reversing:");
       print(queue);
        reversefirstk(queue,k,size);
        System.out.println("After reversing");
        print(queue);
    }
    }
    
    
    
    
    
    
    
}
