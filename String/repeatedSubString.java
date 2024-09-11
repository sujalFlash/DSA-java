/*
Given a string s, check if it can be constructed by taking a substring of it 
and appending multiple copies of the substring together.
*/
class Solution {
    public boolean repeatedSubstringPattern(String s) {
      
       String st=s+s;
       String str=st.substring(1,st.length()-1);
       if(str.contains(s))
           return true;
        return false;
    }
}
