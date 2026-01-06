class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       List<Integer> list=new ArrayList<>();
       int threshold=nums.length/3;

       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        int element=entry.getKey();
        int count=entry.getValue();
        if(count>threshold){
            list.add(element);

        }
       }
       return list;
        
    }
}