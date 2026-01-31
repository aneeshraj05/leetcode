class Solution {
    public boolean detectCapitalUse(String word) {
       int count=0;
       if(word.length()==0 || word.length()==1){
        return true;
       }
       for(int i=0;i<word.length();i++){
        if(capital(word.charAt(i))){
            count++;

        }
       }
       if(count ==word.length()) return true;
       if(capital(word.charAt(0)) && count==1) return true;
       if(count==0) return true;



       return false;


    }
    static boolean capital(char ch){
        if(ch>='A' && ch<='Z'){
            return true;
        }
        return false;
    }
}