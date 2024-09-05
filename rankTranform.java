//Rank tranfrom using sorting and HashMap
import java.util.HashMap;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int[] arr2=arr.clone();
      int rank=1;
      int i=0;
      Arrays.sort(arr2);
      HashMap<Integer,Integer> map=new HashMap<>();
      while(i<arr2.length){
    
             if(!map.containsKey(arr2[i]))
                   { map.put(arr2[i],rank);
                   rank++;

                   }
            i++;
      } 
          


      int []res=new int[arr.length];
      for(i=0;i<arr.length;i++){
        res[i]=map.get(arr[i]);
      }
      return res;
    }
}
