class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int start=0;
        // int end=1;
        // while(start<nums.length){
        //   if(end<nums.length){
        //     if(Math.abs(end-start)<=k && nums[start]==nums[end]){
        //         return true;
        //     }
        //     end++;
        //   }
        //   else{
        //     start=start+1;
        //     end=start+1;
        //   }
        
        
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    int num=nums[i];
    if(map.containsKey(num) && i-map.get(num)<=k)
    {
        return true;
    }
    map.put(num,i);
}
      return false;
}
}