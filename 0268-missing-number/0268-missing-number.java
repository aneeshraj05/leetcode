class Solution {
    public int missingNumber(int[] nums) {
         int j=0;
        while( j<nums.length){
            int correct=nums[j];

            if(nums[j]<nums.length && nums[j]!=nums[correct]){
                swap(nums,j,correct);
            }
            else {
                j++;

            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
            
        }
        return nums.length;
    }
     static void swap(int arr[],int max,int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
    
}