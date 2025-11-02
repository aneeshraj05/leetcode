class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String s1=String.join(" ",word1).replaceAll(" ","");
        String s2=String.join(" ",word2).replaceAll(" ","");
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}