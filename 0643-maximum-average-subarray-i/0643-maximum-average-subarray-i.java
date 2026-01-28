class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowsum=0;
        double maxsum=Double.MIN_VALUE;
        double avg=0;
        
        for(int i=0;i<k;i++){
            windowsum+=nums[i];

        }
        maxsum=windowsum;
        if(k==nums.length){
            return windowsum/k;
        }
        if(nums.length==1){
            return windowsum;
        }
        
        
        for(int i=k;i<nums.length;i++){
        
            windowsum-=nums[i-k];
            windowsum+=nums[i];
            maxsum=Math.max(maxsum,windowsum);
        }



        return maxsum/k;

        
        
    }
}