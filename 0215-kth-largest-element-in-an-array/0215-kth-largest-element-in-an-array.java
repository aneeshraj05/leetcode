class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> maxheap=new PriorityQueue(Collections.reverseOrder());
        for(int num:nums){
            maxheap.add(num);
        }
        int max=0;
        for(int i=0;i<k;i++)
        {
            max=maxheap.poll();
        }

return max;
        
    }
}