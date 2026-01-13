class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean fact[]=new boolean[nums.length];
        perm(nums,result,new ArrayList<>(),fact);
        return result;
        
    }
    static void perm(int arr[],List<List<Integer>> result,List<Integer> current,boolean fact[]){
        if(current.size()==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!fact[i]){
                fact[i]=true;
                current.add(arr[i]);
                perm(arr,result,current,fact);
                current.remove(current.size()-1);
                fact[i]=false;

            }
        }
       
    }
}