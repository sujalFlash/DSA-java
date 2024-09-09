/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 Used backtracking

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]

*/
class Solution {
    public static boolean valid(String prefix){
        if(prefix.charAt(0)==')')
            return false;
        if(prefix.charAt(prefix.length()-1)=='(')
            return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<prefix.length();i++){
            if(prefix.charAt(i)=='(')
                     stack.push('C');
            else{
              if(!stack.isEmpty())  
                     stack.pop();
                
            }
         
        }
           if(stack.isEmpty())
                return true;
            return false;
          
    }
    public  static LinkedList<String> gt(String prefix,String remaining,LinkedList<String> l1){
        if(remaining.isEmpty())
               {
                if(valid(prefix)&&!l1.contains(prefix))
                     l1.add(prefix);
               }
        else{
            for(int i=0;i<remaining.length();i++){
              l1=gt(prefix+remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1),l1);
            }
        }
        return l1;
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder("");
     for(int i=0;i<n;i++){
       sb.append('(');
     }
       for(int i=0;i<n;i++){
       sb.append(')');
     }     
     LinkedList<String> l1=new LinkedList<>();
     l1=gt("",sb.toString(),l1);
     return l1; 
    }
}

