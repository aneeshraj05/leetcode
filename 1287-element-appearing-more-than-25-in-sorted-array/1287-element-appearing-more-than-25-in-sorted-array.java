class Solution {
    public int findSpecialInteger(int[] arr) {
        int num=arr.length/4;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>num){
                return key;
            }
        }
        return -1;
    }
}