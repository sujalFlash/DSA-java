/*
While calculating exponential general  cases are are powers of 1,-1  
edge cases are n==Integer.MIN_VALUE




*/

class Solution {
    public double myPow(double x, int n) {
        boolean isNegative=false;
        if(x==1)
           return x;
        if(x==-1&&n%2!=0)
              return -1;
        if(x==-1&&n%2==0)
             return 1;
        if(n==0)
            return 1.0;
            //because absolute value of Integer.MIN_VALUE doesnt exist
           if(n==Integer.MIN_VALUE)
                 return 0;
     if(n<0)
     { isNegative=true;
        n=Math.abs(n);
     }
     double ans=1;
     while(n>0){
    if(n%2!=0){
         ans=ans*x;
         n=n-1;
     }else{
        x=x*x;
        n=(int)n/2;
     }



    }

    if(isNegative)
           return 1/ans;
    return ans;
    }
}
