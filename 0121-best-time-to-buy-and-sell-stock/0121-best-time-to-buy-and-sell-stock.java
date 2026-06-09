class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
                        max=Math.max(max,prices[i]-min);

            min=Math.min(prices[i],min);
           
        }
      
       return max<0?0:max;
    }
}