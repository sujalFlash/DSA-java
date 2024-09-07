/*
House robbery using memoization technique
*/
class Solution {

   public static int houserobbery(int []nums,int n,Integer[] memo){
    if(n==1)
        return nums[0];
    if(n==2)
         return Math.max(nums[0],nums[1]);
    if(memo[n-1]!=null) return memo[n-1];
    memo[n-1]= Math.max(houserobbery(nums,n-2,memo)+nums[n-1],houserobbery(nums,n-1,memo));
     return memo[n-1];
   }


    public int rob(int[] nums) {
        if(nums.length==1)
             return nums[0];
        Integer memo[]=new Integer[nums.length];
       return houserobbery(nums,nums.length,memo);


    }
}
