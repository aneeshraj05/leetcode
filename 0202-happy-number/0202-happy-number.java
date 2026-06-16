class Solution {
            Map<Integer,Integer> set=new HashMap<>();


    public boolean isHappy(int n) {
        int m=n;

        if(n==1){
            return true;
        }
        if(set.containsKey(n)){
            return false;
        }
        set.put(n,0);
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
      
        return isHappy(sum);
       
    }
}