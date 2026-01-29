class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=0;
        while(right<nums.length){
            if(left!=right &&(nums[left]+nums[right]==target)){
                return new int[]{left,right};
            }

            right++;
            if(right==nums.length){
                left++;
                right=0;
            }
        }
        return new int[]{-1,-1};
        
    }
}