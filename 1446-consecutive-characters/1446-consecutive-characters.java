class Solution {
    public int maxPower(String s) {

        char ch[] = s.toCharArray();

        int count = 1;
        int max = 1;

        for(int i = 1; i < ch.length; i++) {

            if(ch[i] == ch[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}