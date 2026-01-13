class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        Arrays.sort(nums);
        perm(nums,result,new ArrayList<>(),freq);
        return result;
        
    }
    static void perm(int arr[],List<List<Integer>> result,List<Integer> current,boolean freq[]){
        if(current.size()==arr.length){
            result.add(new ArrayList(current));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                if (i > 0 && arr[i] == arr[i - 1] && !freq[i - 1]) continue;
                                freq[i]=true;


                current.add(arr[i]);
               
                perm(arr,result,current,freq);
                
                current.remove(current.size()-1);  

                freq[i]=false;
                
               
            }
        }
    }
}