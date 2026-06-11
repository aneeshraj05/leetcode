class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[]=new int[num_people];
        
        for(int i=0;candies>0;i++){
            int people=i%num_people;

            int cgive=Math.min(candies,i+1);

            arr[people]+=cgive;
            candies-=cgive;
        }
        return arr;
    }
}