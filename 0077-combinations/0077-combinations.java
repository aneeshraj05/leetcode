class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        combination(1,n,result,new ArrayList<>(),k);
        return result;
        
    }
    static void combination(int start,int n,List<List<Integer>> result, List<Integer> current,int k){
        if(current.size()==k){
            result.add(new ArrayList(current));
            return;

        }
        for(int i=start;i<=n;i++){
            current.add(i);
            combination(i+1,n,result,current,k);
            current.remove(current.size()-1);
            

        }
    }
}