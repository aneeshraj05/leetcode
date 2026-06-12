class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int arr[]=new int[10000];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && arr[nums[i]]==0){
                count++;
            }

            arr[nums[i]]++;
        }
        return count;
        
    }
}