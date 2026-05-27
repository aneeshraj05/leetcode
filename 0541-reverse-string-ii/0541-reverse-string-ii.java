class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int left=i;
            int right=Math.min(i+k-1,s.length()-1);
            reverse(ch,left,right);

            
        }
        return new String(ch);
       
    }
    public static void reverse(char ch[],int start,int end){
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
    }
}