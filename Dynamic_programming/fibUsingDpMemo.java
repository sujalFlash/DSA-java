/*
Used DP memoization technique to solve calculate the nth fibonacci number
*/
class Solution {
    public static int FIB(int n,Integer[] memo){
        if(n==0||n==1)
             return n;
        if(memo[n]!=null) return memo[n];
        memo[n]=FIB(n-1,memo)+FIB(n-2,memo);
        return memo[n];
    }
    public int fib(int n) {
       if(n==0||n==1)
            return n;
       Integer[] memo=new Integer[n+1];
       return FIB(n,memo);
    }
}


