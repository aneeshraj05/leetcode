class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int nums:nums1)
        {
            map.put(nums,0);
        }
      List<Integer> list=new ArrayList<>();
      for(int num:nums2){
        if(map.containsKey(num)){
            list.add(num);
            map.remove(num);
        }
      }
int size=list.size();
int arr[]=new int[size];
for(int i=0;i<arr.length;i++)
{
    arr[i]=list.get(i);
}

return arr;

    }
}