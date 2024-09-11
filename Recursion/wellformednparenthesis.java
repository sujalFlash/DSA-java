/*
generate well formed  n pairs parenthesis parenthesis
*/


import java.util.List;
import java.util.LinkedList;
class Solution {
    static List<String> l1=new LinkedList<>();
    public static void gp(int open,int close,int n,StringBuilder sb){
      if(open==n&&close==n){
        l1.add(sb.toString());
        return;
      }
      if(open>n||close>n)
           return;
      if(open<n){
        sb.append('(');
        gp(open+1,close,n,sb);
        sb.deleteCharAt(sb.length()-1);
      }
       if(close<open){
        sb.append(')');
        gp(open,close+1,n,sb);
        sb.deleteCharAt(sb.length()-1);
      }
    }
    public List<String> generateParenthesis(int n) {
    int open=0;
    int close=0;
    StringBuilder sb=new StringBuilder("");
    gp(open,close,n,sb);
    List<String> l=new LinkedList<>();
    for(String i:Solution.l1){
        l.add(i);
    }
    l1.clear();
    return l;
    }
}
