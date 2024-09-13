//xor queries of subarray
class Solution {
    static int[] ans;
    static int k;
    public static void Q(int []arr,int left,int right){
        int res=0;

        for(int i=left;i<=right;i++){
            res=res^arr[i];
        }
        ans[k++]=res;
    }
    public int[] xorQueries(int[] arr, int[][] queries) {
        if(arr.length==1&&queries.length==1)
                return arr;
        ans=new int[queries.length];
        k=0;
        for(int i=0;i<queries.length;i++){
               Q(arr,queries[i][0],queries[i][1]);
        }  
        int[]result=ans.clone();
        ans=new int[arr.length];
        k=0;
        return result;
          }
}
