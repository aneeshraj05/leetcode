class Solution {
    public int[] sortArrayByParity(int[] nums) {
     int start=0;
     int end=nums.length-1;
     while(start<=end){
        if(nums[start]%2!=0 && nums[end]%2==0){
            swap(start,end,nums);
            start++;
            end--;

        }
        else if(nums[start]%2==0 && nums[end]%2==0){
            start++;
        }
        else{
            end--;
        }

     }
     return nums;
        
    }
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
       
    }
    static void swap(int first ,int second,int nums[]){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}