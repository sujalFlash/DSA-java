/*
House robbery tabulation technique
*/
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
             return nums[0];
        int totalloot[]=new int[nums.length];
        totalloot[0]=nums[0];
        totalloot[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
         totalloot[i]=Math.max(totalloot[i-2]+nums[i],totalloot[i-1]);

        }
        int max=0;
     return totalloot[nums.length-1];

    }
}
