class Solution {
    public int maxDepth(String s) {
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count+=1;
            }
            else if(s.charAt(i)==')'){
                count-=1;
            }
            max=Math.max(max,count);
        }
        return max;
        
    }
}