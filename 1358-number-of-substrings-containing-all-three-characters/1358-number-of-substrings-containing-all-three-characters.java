class Solution {
    public int numberOfSubstrings(String s) {
        int freq[]=new int[3];
        int left=0;
        int right=0;
        int n=s.length();
        int ans=0;
        while(right<s.length()){
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
               ans+=n-right;
               freq[s.charAt(left)-'a']--;
               left++;


            }
         
            right++;
        }

        return ans;

        
    }
}