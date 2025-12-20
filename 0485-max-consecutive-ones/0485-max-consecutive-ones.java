class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
            int count=0;
            int result=0;

for(int i=0;i<nums.length;i++){
    if(nums[i]==0){
        count=0;
    }
    else{
        count+=1;
    }
    if(count>result){
    result=count;
}
}

        return result;
    }
}