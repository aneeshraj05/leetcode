class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
      for(String  s:words){
        int sum=0;
        for(char ch:s.toCharArray()){
            sum+=weights[ch-'a'];
        }
        int rem=(int)(sum%26);
        sb.append((char)('z'-rem));
      }
      return sb.toString();

    }
}