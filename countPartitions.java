/*
Count number of partitions of n objects using atmost m groups
*/
import java.util.Scanner;
public class Main{
    public static int countNoOfPartitions(int n,int m){
        if(n==0)
            return 1;
        if(m==0||n<0)
            return 0;
        return countNoOfPartitions(n,m-1)+countNoOfPartitions(n-m,m);    
        
        
        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of objects:");
        int n=sc.nextInt();
         System.out.println("Enter number of groups:");
         int m=sc.nextInt();
        int k= countNoOfPartitions(n,m);
        System.out.println("The number of partitions can be ");
        System.out.println(k);
        
        
        
        
        
    }
    
    
    
    
    
    
}
