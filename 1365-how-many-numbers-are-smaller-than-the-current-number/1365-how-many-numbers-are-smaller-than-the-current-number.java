class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        int start=0;
        int end=0;
        while(start<nums.length){
            if(end==nums.length){
                start++;
                end=0;
                continue;
            }
            if(start!=end && nums[end] < nums[start]){
                arr[start]++;
            }
            end++;
            

        }
        return arr;
        
    }
}