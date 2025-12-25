class Solution {
    public int lengthOfLastWord(String s) {
        String t=s.trim();
        int i=t.length()-1;
        int count =0;
        while(i>=0 && t.charAt(i)!=' '){
            if(t.charAt(i)!=' '){
                count+=1;
                   i--;
            }



        }
                 return count;

        
    }
}