class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int start=0;
       int end=0;
       int maxlen=0;
       int n=s.length();
       Map<Character,Integer> map=new HashMap<>();

       while(end<n){
        char ch=s.charAt(end);
        if(map.containsKey(ch) && map.get(ch)>=start){
            start=map.get(ch)+1;
        }
        maxlen=Math.max(maxlen,end-start+1);
        map.put(ch,end);
        end++;





       }
       return maxlen;
    }
}