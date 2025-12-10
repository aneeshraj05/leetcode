class Solution {
    public int majorityElement(int[] nums) {
Map<Integer,Integer> map=new HashMap<>();
        for(int item:nums){
            map.put(item, map.getOrDefault(item,0)+1);
        }   
        
       int maxKey=-1;
       int max=0;
for(int key:map.keySet()){
    if(map.get(key)>max){
      max=map.get(key);
        maxKey=key;

    }
} 
    return maxKey;

    }
}