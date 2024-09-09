//longest palindrome that can be built using a string


import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        if(n==1)
            return 1;
        HashMap<Character,Integer> map=new HashMap<>();
         
       for(int i=0;i<n;i++){
        int u=map.getOrDefault(s.charAt(i),0);
        u++;
        map.put(s.charAt(i),u);
       }  
       StringBuilder sb=new StringBuilder("");  
       int count=0;//to count how many uniques are there    
       for(Character i:map.keySet()){
        if(map.get(i)%2==0){
           for( int k=0;k<map.get(i)/2;k++)
                  sb.append(i);
        }     
        else if(map.get(i)==1)
             count++;
         else{
           for(int m=0;m<map.get(i)/2;m++)
                 sb.append(i);
            count++;
         }  
       }
    if(count==0)
        return 2*sb.length();
    else 
       return 2*sb.length()+1;
    }

}
