class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++)
                  set.add(allowed.charAt(i));
        
        boolean flag=true;

        for(String s:words){
             flag=true;
            for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                    flag=false;
                    break;
                }    
            }
            if(flag)
                 count++;
        }

    return count;
    
        }
}
