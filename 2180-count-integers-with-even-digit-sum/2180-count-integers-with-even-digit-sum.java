class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int number=i;
            int sum=0;
            while(number>0){
                sum+=number;
                number=number/10;

            }
            if(sum%2==0){
                count+=1;
            }
            sum=0;

        }
        return count;
        
    }
}