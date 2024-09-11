//binarywatch


/*
basic intution is go through all combination of hours and minutes possible in n^2 loop
and count setbits of hours and minutes for all combination and add 
check whether equal to turned on if sum 
is equal to turned on then add formed hour and minute to string





*/
class Solution {
    public static int countbit(int m) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if ((m & (1 << i)) != 0)
                count++;
        }
        return count;

    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> l1 = new LinkedList<>();
        for (int hours = 0; hours < 12; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                if (countbit(hours) + countbit(minutes) == turnedOn) {
                    if (minutes < 10)
                        l1.add(String.format("%d:0%d", hours, minutes));
                    else
                        l1.add(String.format("%d:%d", hours, minutes));

                }

            }
        }
        return l1;
    }
}
