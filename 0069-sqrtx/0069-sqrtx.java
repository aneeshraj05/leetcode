class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
         long mid=start+(end-start)/2;
          long val=(mid*mid);
          if(val==x){
            return (int) mid;
          }
            if(val<=x){
                start=(int)mid+1;
            }
            else{
                end=(int )mid-1;
            }
        }
        return end;
        
    }
}