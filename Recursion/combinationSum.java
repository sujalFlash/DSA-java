/*
combination sum using backtracking


*/
import java.util.List;
import java.util.LinkedList;
class Solution {
    public static void backtrack(int index,int n,int[] candidates,int target,List<Integer> current,List<List<Integer>> l1){
     if(index==candidates.length){
        if(target==0){
            l1.add(new LinkedList<>(current));
        }
        return;
     }
     if(candidates[index]<=target){
       current.add(candidates[index]);
      backtrack(index,n,candidates,target-candidates[index],current,l1);
       current.remove(current.size()-1);

     }
     backtrack(index+1,n,candidates,target,current,l1);
    
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    int n=candidates.length;
    List<List<Integer>> l1=new LinkedList<>();
    backtrack(0,n,candidates,target,new LinkedList<>(),l1);
       return l1;

    }
}
