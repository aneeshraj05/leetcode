class Solution {
    public boolean isMonotonic(int[] nums) {
          if(nums.length==1){
            return true;
        }
       boolean isIncrease=true;
      boolean  isDecrease=true;
      
        for(int i=1;i<nums.length;i++){
            if(!isIncrease && !isDecrease){
                return false;
            }
            if(nums[i]>nums[i-1]){
                isDecrease=false;
            }
            if(nums[i]<nums[i-1]){
                isIncrease=false;
            }
        }

        return isIncrease || isDecrease;
        
    }
}