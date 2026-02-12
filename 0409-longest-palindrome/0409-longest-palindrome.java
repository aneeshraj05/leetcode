class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<>();
        int length=0;
        for(int i=0;i<s.length();i++){
            char character=s.charAt(i);
            if(set.contains(character)){
                length+=2;
                set.remove(character);
            }
            else{
                set.add(character);
            }
        }
        if(set.size()>0){
            length+=1;
        }
        return length;
        
    }
}