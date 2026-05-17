class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int index=2;
        int start=2;

        while(start<nums.length){
            if(nums[start]!=nums[index-2]){
                nums[index]=nums[start];
                index++;


            }
            start++;
        }
        return index;
   
    }
}