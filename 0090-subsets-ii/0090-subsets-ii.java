class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        sub(0,nums,result,new ArrayList<>());
        
        return result;
        
    }
    static void sub (int index,int arr[],List<List<Integer>> result ,List<Integer> current){
        if(index==arr.length){
            
                result.add(new ArrayList(current));
         
            return;
        }
        current.add(arr[index]);
        sub(index+1,arr,result,current);
        current.remove(current.size()-1);
        while(index+1<arr.length && arr[index]==arr[index+1]){
            index++;
        }
        sub(index+1,arr,result,current);
        
    }
}