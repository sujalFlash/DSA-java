//sum of digits of string after convert

class Solution {
    public int getLucky(String s, int k) {
      StringBuilder sb=new StringBuilder("");
      for(int i=0;i<s.length();i++){
        sb.append(s.charAt(i)-96);
      }  
      String str=sb.toString();
     
      int sum=0;
      int j=0;
      while(j<k){
      for(int i=0;i<str.length();i++){
        sum+=(str.charAt(i)-48);//substracting to convert '1' to 1;
      }
       str=String.valueOf(sum);
      sum=0;

      j++;

      }
      return Integer.valueOf(str);
    }
}