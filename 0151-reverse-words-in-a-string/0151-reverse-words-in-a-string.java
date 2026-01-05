class Solution {
    public String reverseWords(String s) {
        String p[]=s.trim().split(" ");
        String b="";
        int j=p.length-1;
        while(j>=0){
            b+=p[j] + " ";
            j--;

        }
        return b.replaceAll("\\s+"," ").trim();
    }
}