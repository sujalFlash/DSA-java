/*
Design a function to take input n,m to represent n*m grid path
and return number of all possible paths from top left corner to bottom right corner ,Constraints :You can only move one step at a time to right or down
*/
import java.util.Scanner;
public class Main{
    public static int allPossiblePaths(int n,int m){
        if(n==1||m==1)
              return 1;
        return allPossiblePaths(n-1,m)+allPossiblePaths(n,m-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter m:");
        int m=sc.nextInt();
        int k=allPossiblePaths(n,m);
        System.out.print("All possible paths are :");
        System.out.println(k);
        
        
        
        
    }
}
