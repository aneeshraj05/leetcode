class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        comb(0,candidates,target,result,new ArrayList<>());
        return result;
        
    }


    static void comb(int index,int arr[], int target,List<List<Integer>> result, List<Integer> current){
        if(index==arr.length){
            if(target==0){
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if(arr[index]<=target){
            current.add(arr[index]);
            comb(index, arr,target-arr[index],result,current);
            current.remove(current.size()-1);

        }
                    comb(index+1, arr,target,result,current);






    }


}