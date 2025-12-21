class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int notfound[]={-1,-1};
        int start=0;
        int end=numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            int total=numbers[start]+numbers[end];
            if(total==target){
                return new int[]{start+1,end+1};
            }
            else if(total>target){
                end--;
            }
            else{
                start++;
            }
        }
        return notfound;
        
    }
}