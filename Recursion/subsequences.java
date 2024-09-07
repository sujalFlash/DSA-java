/*
code to generate Subsequences(contiguos or non contiguos) using Recursion(Backtracking) pick no pick
*/
import java.util.LinkedList;
public class Main{
    static int counter;
    static LinkedList<Integer> l1=new LinkedList<>();
    public static void print(LinkedList<Integer> current){
        System.out.print(counter++ +" :");
        for(int i:current){
            System.out.print( i+" ");
        }
        System.out.println();
    }
    public static void  subsequence(int index,LinkedList<Integer> current){
        if(index>=Main.l1.size())
        {print(current);
            return;
        }
        System.out.println("added "+l1.get(index)+"current index: "+index);
        current.add(Main.l1.get(index));
        subsequence(index+1,current);
        System.out.println(" removed "+"current index: "+index);
        current.removeLast();
        subsequence(index+1,current);
    }
    public static void main(String[] args){
        Main.l1.add(3);

        Main.l1.add(2);
        Main.l1.add(5);
        Main.l1.add(6);
        Main.l1.add(1);
        System.out.println("Orginal list:");
        print(l1);
        System.out.println("The Subsequences are:");     subsequence(0,new LinkedList<>());
    }
}
