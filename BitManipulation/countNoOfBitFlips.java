class Solution {
    public int minBitFlips(int start, int goal) {
        int a=start^goal;//General intution is xoring starting and goal gives  gives a which contains 1 where flip must happen as xor unliking bits give 1 
        int c=0;
        for(int i=0;i<32;i++){
            if((a&(1<<i))!=0)
                 c++;
        }
        return c;
    }
}
