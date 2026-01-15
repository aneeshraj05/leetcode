class Solution {
    public int findGCD(int[] nums) {
        int min=min(nums);
        int max=max(nums);
        return gcd(min,max);
    }
    static int max(int nums[]){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            
        }
        return max;
    }
    static int min(int nums[]){
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            
        }
        return min;
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}