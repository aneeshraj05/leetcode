class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
     
        StringBuilder sb=new StringBuilder(palindrome);
        

        for(int i=0;i<palindrome.length()/2;i++){
            char ch=sb.charAt(i);
            if(ch!='a'){
sb.setCharAt(i,'a');
return sb.toString();

            }
          
        }

        sb.setCharAt(sb.length()-1,'b');


        return sb.toString();
        
    }
    static boolean checkA(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                count++;
            }
        }
        return count==s.length();
        

    }
}