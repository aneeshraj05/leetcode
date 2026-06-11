class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=sumd(x);
        if(x%num==0){
            return num;
        }

        return -1;
    }
    public static int sumd(int x){
        int sum=0;
        while(x>0){
            int digit=x%10;
            sum+=digit;
            x=x/10;
        }
        return sum;
    }
}