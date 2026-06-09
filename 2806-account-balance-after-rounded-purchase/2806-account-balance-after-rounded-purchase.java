class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        
        int num=purchaseAmount+5;
        num=num/10;
        num*=10;
        return 100-num;
    }
}