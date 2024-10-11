//Brute force approach of longest subarray with sum<=k
import java.util.*;
public class Main{
    public static void main(String[] args){
    //Generating all sub arrays approach
    int[] arr={2,5,1,7,10};
    int n=5;
    int sum=0;
    int k=14;
    int maxlength=0;
    int length=0;
    for(int i=0;i<n;i++){
        sum=0;
        for(int j=i;j<n;j++){
            sum+=arr[j];
            if(sum<=k)
                maxlength=Math.max(maxlength,j-i+1);
            else 
                 break;
        }
    }
      System.out.println(maxlength);
    }
}
