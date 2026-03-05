class Solution {
    public String convertToBase7(int num) {
                if(num == 0) return "0";
                        boolean isNegative=num<0;


        num=Math.abs(num);
        String octal="";
        while(num>0){
            int rem=num%7;
            octal=rem+octal;
            num/=7;
        }

        if(isNegative){
            octal="-"+octal;
        }
        return octal;
    }
}