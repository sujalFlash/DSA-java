

/*
House robbery ,stealing maximum wealth (expect adjacent houses which can alert police) Houses are linear


*/


import java.util.LinkedList;
class Solution {
    static int max=Integer.MIN_VALUE;
    static LinkedList<Integer> l1=new LinkedList<>();
    public static void houserobbery(int index,LinkedList<Integer> current){
        if(index>=Solution.l1.size())
           {
            int sum=0;
            for(int i:current)
                     sum=i+sum;
            if(sum>Solution.max)
                    Solution.max=sum;
            return;
           }
        current.add(Solution.l1.get(index));
        houserobbery(index+2,current);
        current.removeLast();
        houserobbery(index+1,current);


    }
    public int rob(int[] nums) {
    for(int i:nums)
            Solution.l1.add(i);

    houserobbery(0,new LinkedList<>());
    int maximum=Solution.max;
    l1.clear();// cleared as i dont have access to main method and multiple call to this functions,static variables can retain values to next test cases
    Solution.max=Integer.MIN_VALUE;//same reason
   return maximum;

     


    }


}
