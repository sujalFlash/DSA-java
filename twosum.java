//Implementation of two sum using HashMap
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
      }
      int[]arr={-1,-1};
      for(int i=0;i<nums.length;i++){
        int secondElement=target-nums[i];
        if(map.containsKey(secondElement)&&map.get(secondElement)!=i){
            arr[0]=i;
            arr[1]=map.get(secondElement);
        }
      }
     return arr;
    }
}
