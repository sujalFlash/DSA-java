/*
Generating permutations of a String using Recursion Backtracking
*/
import java.util.Scanner;
import java.util.LinkedList;
public class Main{
    public static LinkedList generatePermutations(String prefix,String remaining,LinkedList<String>l1){
        if(remaining.isEmpty())
             l1.add(prefix);
        else{
            for(int i=0;i<remaining.length();i++){
 l1=generatePermutations(prefix+remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1),l1);
            }
        }
        return l1;
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LinkedList<String> l1=new LinkedList<>();
        l1=generatePermutations("",s,l1);
        System.out.println(l1.size());
        for(String str:l1){
            System.out.println(str);
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}



*/
