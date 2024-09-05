/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

*/

import java.util.HashMap;
import java.util.Map;
class Solution {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
    HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
            {
                int u=map1.getOrDefault(nums1[i],0);
                u++;
                map1.put(nums1[i],u);
            

            }
             for(int i=0;i<nums2.length;i++)
            {
                int u=map2.getOrDefault(nums2[i],0);
                u++;
                map2.put(nums2[i],u);
            

            }
            int m=0;
       HashMap<Integer,Integer> map3=new HashMap<>();
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int key = entry.getKey();
            int value1 = entry.getValue();

        
            if (map2.containsKey(key)) {
                int value2 = map2.get(key);
                int minValue=Math.min(value1,value2);
                map3.put(key, minValue);
m+=minValue;
            }
        }
    int res[]=  new int[m];
    int k=0; 
 for (HashMap.Entry<Integer, Integer> entry : map3.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            for (int i = 0; i < value; i++) {
                res[k++]=key;
            }
        }
return res;






    }
}
